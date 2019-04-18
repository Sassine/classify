package br.com.sassine.restclassify.api.adress.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.repository.AdressRepository;

@Service
public class DeleteAdressService {
	@Autowired
	private AdressRepository adressRepository;

	@Transactional
	public void execute(AdressEntity adress) {
		this.adressRepository.delete(adress);
	}
}
