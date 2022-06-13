package com.br.condominio.correios;

import java.math.BigDecimal;

import org.springframework.web.client.RestTemplate;

import com.br.condominio.correios.methods.AuthenticationMethod;
import com.br.condominio.correios.methods.BalanceMethod;
import com.br.condominio.correios.models.Authentication;
import com.br.condominio.correios.models.Balance;

public class CorreiosAPI {

	private Conf conf;
	private String username;
	private String password;
	private String numeroCartao;
	private Authentication auth;
	
	public CorreiosAPI(String protocol, String host, RestTemplate restTemplate, String username, String password, String numeroCartao) {
		this.conf = new Conf(protocol, host, restTemplate);
		this.username = username;
		this.password = password;
		this.numeroCartao = numeroCartao;
	}
	
	public Authentication doAuth() {
		AuthenticationMethod authMethod = new AuthenticationMethod(this.conf, this.username, this.password);
		authMethod.addContent("numero", numeroCartao);
		return authMethod.execute();
	}
	
	public BigDecimal getBalance() {
		BalanceMethod balanceMethod = new BalanceMethod(conf, auth);
		Balance balance = balanceMethod.execute();
		return balance.getCurrentBalance();
	}
	
	public static class Conf {
		private RestTemplate restTemplate;
		private String protocol;
		private String host;
		
		public Conf(String protocol, String host, RestTemplate restTemplate) {
			this.protocol = protocol;
			this.host = host;
			this.restTemplate = restTemplate;
		}
		
		public String getURL() {
			return protocol + "://"+ host;
		}
		
		public RestTemplate getRestTemplate() {
			return restTemplate;
		}
	}
}
