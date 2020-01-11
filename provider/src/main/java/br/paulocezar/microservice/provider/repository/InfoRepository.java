package br.paulocezar.microservice.provider.repository;

import org.springframework.data.repository.CrudRepository;

import br.paulocezar.microservice.provider.model.InforProvider;

public interface InfoRepository extends CrudRepository<InforProvider, Long> {

	InforProvider findByState(String state);
	
}
