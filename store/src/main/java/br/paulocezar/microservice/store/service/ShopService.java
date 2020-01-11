package br.paulocezar.microservice.store.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.paulocezar.microservice.store.controller.dto.ProviderInfoDTO;
import br.paulocezar.microservice.store.controller.dto.ShopDTO;

@Service
public class ShopService {

	public void doShopping(ShopDTO shop) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<ProviderInfoDTO> exchange = client.exchange("http://localhost:8082/info/"+shop.getAddress().getState(),
				HttpMethod.GET, null,ProviderInfoDTO.class);
				System.out.println(exchange.getBody().getAddress());
	}
}
