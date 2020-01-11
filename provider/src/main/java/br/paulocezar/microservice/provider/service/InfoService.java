package br.paulocezar.microservice.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.paulocezar.microservice.provider.model.InforProvider;
import br.paulocezar.microservice.provider.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InforProvider getInfoByState(String state) {
		return infoRepository.findByState(state);
	}
	
	

}
