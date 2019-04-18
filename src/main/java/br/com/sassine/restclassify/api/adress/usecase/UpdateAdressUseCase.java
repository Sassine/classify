package br.com.sassine.restclassify.api.adress.usecase;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.service.FindAdressService;
import br.com.sassine.restclassify.api.adress.service.UpdateAdressService;
import br.com.sassine.restclassify.api.adress.translator.AdressTranslator;
import br.com.sassine.restclassify.api.adress.validator.AdressValidator;

@Component
public class UpdateAdressUseCase {

	@Autowired
	private UpdateAdressService adressService;

	@Autowired
	private FindAdressService findAdressService;

	@Autowired
	private AdressTranslator adressTranslator;

	@Autowired
	private AdressValidator validator;

	public void update(Long id, Map<String, Object> adressMap) {
		AdressEntity adress = this.findAdressService.findById(id);
		this.validator.validade(adress);
		AdressEntity adressNew = this.adressTranslator.translate(adressMap);
		adress.setUrl(adressNew.getUrl());
		this.adressService.execute(adress);
	}

}
