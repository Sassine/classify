package br.com.sassine.restclassify.api.adress.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.service.DeleteAdressService;
import br.com.sassine.restclassify.api.adress.service.FindAdressService;
import br.com.sassine.restclassify.api.adress.validator.AdressValidator;

@Component
public class DeleteAdressUseCase {

	@Autowired
	private DeleteAdressService adressService;

	@Autowired
	private FindAdressService findAdressService;

	@Autowired
	private AdressValidator validator;
	
	public void delete(Long id) {
		AdressEntity adress = this.findAdressService.findById(id);
		this.validator.validade(adress);
		this.adressService.execute(adress);
	}
}
