package br.com.sassine.restclassify.api.adress.validator;

import java.util.Objects;

import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;

@Component
public class AdressValidator {
	public void validade(AdressEntity adress) {
		if(Objects.isNull(adress)) throw new RuntimeException("Error AdressEntity not valid");
	}
}
