package br.com.sassine.restclassify.api.adress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.repository.AdressRepository;

@Service
public class FindAdressService {
	@Autowired
	private AdressRepository adressRepository;

	public List<AdressEntity> findAll() {
		return this.adressRepository.findAll();
	}

	public AdressEntity findById(Long id) {
		return this.adressRepository.findById(id);
	}

	public AdressEntity findByType(String type) {
		return this.adressRepository.findByType(type);
	}
}
