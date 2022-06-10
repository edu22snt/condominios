package com.br.condominio.correios.methods;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.packboo.postal.correios.CorreiosAPI;
import com.packboo.postal.correios.models.Authentication;

public class AuthenticationMethod {

	private String username;
	private String password;
	private String path = "/token/v1/autentica/cartaopostagem";
	private JSONObject cartao;
	private CorreiosAPI.Conf conf;
	
	public AuthenticationMethod(CorreiosAPI.Conf conf, String username, String password) {
		this.username = username;
		this.password = password;
		this.conf = conf;
		this.cartao = new JSONObject();
	}
	
	private HttpHeaders buildHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth(username, password);
		headers.add("Content-Type", "application/json");
		
		return headers;
	}
	
	public void addContent(String property, String value) {
		cartao.put(property, value);
	}
	
	public Authentication execute() {
		HttpEntity<String> request = new HttpEntity<String>(cartao.toString(), buildHeaders());
		ResponseEntity<Authentication> response = conf.getRestTemplate().exchange(
				conf.getURL() + path, HttpMethod.POST, request, Authentication.class);
		Authentication auth = response.getBody();
		
		return auth;
	}
}
