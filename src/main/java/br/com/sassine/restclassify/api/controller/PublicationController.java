package br.com.sassine.restclassify.api.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.sassine.restclassify.api.dto.publication.Publication;
import br.com.sassine.restclassify.api.usecase.PublicationUseCase;

@RestController
public class PublicationController {

	@Autowired
	private PublicationUseCase publicationUseCase;

	/**
	 * Retrieve IA Publicação
	 * 
	 * @param Publication
	 * @return PublicacaoId
	 * @throws IOException
	 * @throws JsonProcessingException
	 */
	@PostMapping(path = "/api/v1/publication", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> retrieve(@RequestBody Publication pub) throws JsonProcessingException, IOException {
		return this.publicationUseCase.execute(pub);
	}
}
