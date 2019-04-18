package br.com.sassine.restclassify.api.dto.publication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicationContentDTO {
	Long IdPublicacao;
	String TextoPublicacao;
	String uf;
	String sistema;

	public Long getIdPublicacao() {
		return IdPublicacao;
	}

	public void setIdPublicacao(Long idPublicacao) {
		this.IdPublicacao = idPublicacao;
	}

	public String getTextoPublicacao() {
		return TextoPublicacao;
	}

	public void setTextoPublicacao(String textoPublicacao) {
		this.TextoPublicacao = textoPublicacao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf.toUpperCase();
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema.toLowerCase();
	}

}
