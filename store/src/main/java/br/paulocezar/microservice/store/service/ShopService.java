package br.paulocezar.microservice.store.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.paulocezar.microservice.store.controller.dto.ShopDTO;
import br.paulocezar.microservice.store.dto.InfoFornecedorDTO;

public class ShopService {

	public void doShopping(ShopDTO shop) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange = 
				client.exchange("http://localhost:8082/info/"+shop.getAddress().getState(),
				HttpMethod.GET, null,InfoFornecedorDTO.class);
	}

}
