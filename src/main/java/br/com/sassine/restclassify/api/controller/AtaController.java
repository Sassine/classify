package br.com.sassine.restclassify.api.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.sassine.restclassify.api.dto.ata.Ata;
import br.com.sassine.restclassify.api.usecase.AtaUseCase;

@RestController
public class AtaController {

	@Autowired
	private AtaUseCase usecase;
	
	@PostMapping(path = "/api/v1/ata", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> retrieve(@RequestBody Ata ata) throws JsonProcessingException, IOException {
		return this.usecase.execute(ata);
	}
}
