package br.com.sassine.restclassify.api.adress.translator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.sassine.restclassify.api.adress.constants.AdressConstants;
import br.com.sassine.restclassify.api.adress.constants.AdressType;
import br.com.sassine.restclassify.api.adress.entity.AdressEntity;

@Component
public class AdressTranslator {

	public Map<String, Object> translate(List<AdressEntity> adress) {
		return this.buildFinallyMap(adress);
	}

	public AdressEntity translate(Map<String, Object> adressMap) {
		return new AdressEntity(AdressType.convertToEnum(adressMap.get(AdressConstants.TYPE).toString()),
				adressMap.get(AdressConstants.URL).toString());
	}

	private Map<String, Object> buildFinallyMap(List<AdressEntity> adress) {
		Map<String, Object> adressMap = new HashMap<>();
		List<Map<String, Object>> adressList = new ArrayList<>();
		adress.forEach(adressObj -> {
			adressList.add(this.toMap(adressObj));
		});
		adressMap.put(AdressConstants.CONTENT, adressList);
		return adressMap;
	}

	private Map<String, Object> toMap(AdressEntity adress) {
		Map<String, Object> adressMap = new HashMap<>();
		adressMap.put(AdressConstants.ID, adress.getId());
		adressMap.put(AdressConstants.TYPE, AdressType.convertToString(adress.getType()));
		adressMap.put(AdressConstants.URL, adress.getUrl());
		return adressMap;
	}

}
