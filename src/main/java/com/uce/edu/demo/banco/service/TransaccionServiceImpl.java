package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepo;
import com.uce.edu.demo.banco.repository.IRetiroRepo;
import com.uce.edu.demo.banco.repository.ITransferenciaRepo;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private IDepositoService depositoService;

	@Autowired
	private IRetiroService retiroService;
	
	@Autowired
	private ITransferenciaRepo transferenciaRepo;
	
	@Autowired
	private IRetiroRepo retiroRepo;
	
	@Autowired
	private IDepositoRepo depositoRepo;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.registrarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroService.insertarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> conultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFinal) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.transferenciaRepo.consultar(cuenta, fechaInicio, fechaFinal);
		List<Deposito> listaDepo = this.depositoRepo.consulta(cuenta, fechaInicio, fechaFinal);
		List<Retiro> listaRetiro = this.retiroRepo.consultar(cuenta, fechaInicio, fechaFinal);

		// Unimos las listas en la TransaccionTo
		List<TransaccionTo> listaFinal = new ArrayList<>();

		for (Transferencia t : listaTrans) {
			TransaccionTo transaccion = this.transformar(t);

			listaFinal.add(transaccion);
		}

		for (Deposito d : listaDepo) {
			TransaccionTo deposito = this.transformar(d);
			listaFinal.add(deposito);
		}

		for (Retiro r : listaRetiro) {
			TransaccionTo retiro = this.transformar(r);
			listaFinal.add(retiro);
		}

		return listaFinal;
	}

	private TransaccionTo transformar(Transferencia transferencia) {

		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(transferencia.getFecha());
		tranTo.setMonto(transferencia.getMontoTransferir());
		tranTo.setTipo("T");
		return tranTo;
	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(deposito.getFecha());
		tranTo.setMonto(deposito.getMonto());
		tranTo.setTipo("D");
		return tranTo;
	}

	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(retiro.getFecha());
		tranTo.setMonto(retiro.getMonto());
		tranTo.setTipo("R");
		
		return null;
	}

}
