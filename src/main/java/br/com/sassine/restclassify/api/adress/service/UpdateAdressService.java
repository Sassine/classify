package br.com.sassine.restclassify.api.adress.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.repository.AdressRepository;

@Component
public class UpdateAdressService {
	@Autowired
	private AdressRepository adressRepository;
	
	@Transactional
	public void execute(AdressEntity adress) {
		this.adressRepository.update(adress);
	}
}
