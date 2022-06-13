package com.br.condominio.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.br.condominio.correios.CorreiosAPI;

@Configuration
public class CorreiosAPIConfig {

	@Value("${com.packboo.postal.correios.host}")
	private String host;
	
	@Value("${com.packboo.postal.correios.protocol}")
	private String protocol;
	
	@Value("${com.packboo.postal.correios.user}")
	private String username;
	
	@Value("${com.packboo.postal.correios.password}")
	private String password;
	
	@Value("${com.packboo.postal.correios.cartao}")
	private String cartao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public CorreiosAPI correiosAPI() {
	    return new CorreiosAPI(protocol, host, restTemplate, username, password, cartao);
	}
}
