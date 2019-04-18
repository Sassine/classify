package br.com.sassine.restclassify.api.adress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sassine.restclassify.api.adress.constants.AdressType;

@Entity
@Table(name = "Rest_Adress")
public class AdressEntity {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private AdressType type;

	@Column(name = "url")
	private String url;

	public AdressEntity() {
		super();
	}

	public AdressEntity(AdressType type, String url) {
		super();
		this.type = type;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public AdressType getType() {
		return type;
	}

	public String getUrl() {
		return url;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setType(AdressType type) {
		this.type = type;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
