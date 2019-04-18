package br.com.sassine.restclassify.api.dto.ata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ata {
	AtaContentDTO Ata;

	public AtaContentDTO getAta() {
		return Ata;
	}

	public void setAta(AtaContentDTO ata) {
		this.Ata = ata;
	}
	
	@Override
	public String toString() {
		return "Id:"+this.Ata.getIdSolicitacao()+"\n Arquivos Size:"+this.getAta().getArquivos().size();
	}
}
