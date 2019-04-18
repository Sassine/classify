package br.com.sassine.restclassify.api.dto.publication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Publication {
	PublicationContentDTO Publicacao;

	public PublicationContentDTO getPublicacao() {
		return Publicacao;
	}

	public void setPublicacao(PublicationContentDTO publicacao) {
		this.Publicacao = publicacao;
	}
}
