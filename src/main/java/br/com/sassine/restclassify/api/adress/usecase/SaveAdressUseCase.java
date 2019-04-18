package br.com.sassine.restclassify.api.adress.usecase;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.service.SaveAdressService;
import br.com.sassine.restclassify.api.adress.translator.AdressTranslator;

@Component
public class SaveAdressUseCase {
	
	@Autowired
	private SaveAdressService saveAdressService;
	
	@Autowired
	private AdressTranslator adressTranslator;

	public Map<String, Object> execute(Map<String,Object> adressMap) {
		AdressEntity adress = this.adressTranslator.translate(adressMap);
		this.saveAdressService.save(adress);
		return this.adressTranslator.translate(Arrays.asList(adress));
	}
}
