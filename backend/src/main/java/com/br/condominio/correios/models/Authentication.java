package com.br.condominio.correios.models;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Authentication {

	@Data
	@ToString
	static class CartaoPostagem {
		private String numero;
		private String contrato;
		private String dr;
		private List<Integer> api;
	}
	
	private String ambiente;
	private String id;
	private String pjInternacional;
	private List<Integer> api;
	private String ip;
	private Date emissao;
	private Date expiraEm;
	private String token;
	private CartaoPostagem cartaoPostagem;
	
	
}
