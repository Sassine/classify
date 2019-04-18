package br.com.sassine.restclassify.api.adress.usecase;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.facade.FindAdressFacade;
import br.com.sassine.restclassify.api.adress.translator.AdressTranslator;

@Component
public class FindAdressUseCase {
	@Autowired
	private FindAdressFacade adressFacede;
	
	@Autowired
	private AdressTranslator adressTranslator;

	public Map<String, Object> execute(Long id) {
		return this.adressTranslator.translate(this.adressFacede.execute(id));
	}
}
