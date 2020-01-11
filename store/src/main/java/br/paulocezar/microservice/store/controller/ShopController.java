package br.paulocezar.microservice.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.paulocezar.microservice.store.controller.dto.ShopDTO;
import br.paulocezar.microservice.store.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void doShopping(@RequestBody ShopDTO shop) {
		
	}

}
