package com.br.condominio.correios.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.packboo.postal.correios.CorreiosAPI;
import com.packboo.postal.correios.models.Authentication;
import com.packboo.postal.correios.models.Balance;

public class BalanceMethod {
	
	private String path = "/packet/v1/balance";
	
	private Authentication auth;
	
	private CorreiosAPI.Conf conf;
	
	public BalanceMethod(CorreiosAPI.Conf conf, Authentication auth) {
		this.conf = conf;
		this.auth = auth;
	}
	
	private HttpHeaders buildHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + this.auth.getToken());
		
		return headers;
	}
	
	public Balance execute() {
		HttpEntity<String> request = new HttpEntity<String>("", buildHeaders());
		ResponseEntity<Balance> response = conf.getRestTemplate().exchange(conf.getURL() + path, HttpMethod.GET, request, Balance.class);
		Balance balance = response.getBody();
		
		return balance;
	}
}
