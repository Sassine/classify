package br.com.sassine.restclassify.api.usecase;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.sassine.restclassify.api.adress.constants.AdressType;
import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.service.FindAdressService;
import br.com.sassine.restclassify.api.adress.validator.AdressValidator;
import br.com.sassine.restclassify.api.dto.publication.Publication;
import br.com.sassine.restclassify.api.service.RestTemplateService;
import br.com.sassine.restclassify.api.translator.ResultTranslator;

@Component
public class PublicationUseCase {
	@Autowired
	private RestTemplateService service;
	@Autowired
	private ResultTranslator translator;
	@Autowired
	private FindAdressService adressService;
	@Autowired
	private AdressValidator validator;

	public Map<String, Object> execute(Publication pub) throws JsonProcessingException, IOException {
		AdressEntity adress = this.adressService.findByType(AdressType.PUBLICATION.toString());
		this.validator.validade(adress);
		return this.translator.translate(this.service.execute(pub, adress.getUrl()));
	}
}
