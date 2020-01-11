package br.paulocezar.microservice.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paulocezar.microservice.provider.model.InforProvider;
import br.paulocezar.microservice.provider.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{state}")
	public InforProvider getInfoByState(@PathVariable String state) {
		return infoService.getInfoByState(state);
	}

}
