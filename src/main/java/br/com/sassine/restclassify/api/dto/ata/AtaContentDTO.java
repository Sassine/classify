package br.com.sassine.restclassify.api.dto.ata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AtaContentDTO {
	Long IdSolicitacao;
	List<ArquivoDTO> Arquivos;

	public Long getIdSolicitacao() {
		return IdSolicitacao;
	}

	public void setIdSolicitacao(Long idSolicitacao) {
		this.IdSolicitacao = idSolicitacao;
	}

	public List<ArquivoDTO> getArquivos() {
		return Arquivos;
	}

	public void setArquivos(List<ArquivoDTO> arquivos) {
		this.Arquivos = arquivos;
	}
}
