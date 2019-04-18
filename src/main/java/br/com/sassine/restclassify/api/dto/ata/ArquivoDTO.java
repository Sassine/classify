package br.com.sassine.restclassify.api.dto.ata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArquivoDTO {
	String Arquivo;

	public String getArquivo() {
		return Arquivo;
	}

	public void setArquivo(String arquivo) {
		this.Arquivo = arquivo;
	}

}
