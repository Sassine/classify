package br.com.sassine.restclassify.api.adress.facade;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;
import br.com.sassine.restclassify.api.adress.service.FindAdressService;

@Component
public class FindAdressFacade {

	@Autowired
	private FindAdressService adressService;

	public List<AdressEntity> execute(Long id) {
		if (Objects.nonNull(id)) {
			return Arrays.asList(this.adressService.findById(id));
		} else {
			return this.adressService.findAll();
		}
	}
}
