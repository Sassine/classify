package br.com.sassine.restclassify.api.translator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.sassine.restclassify.api.adress.constants.AdressConstants;

@Component
public class ResultTranslator {
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> translate(String result) throws JsonProcessingException, IOException {
		Map<String, Object> resultMap = null;
		JsonNode node = new ObjectMapper().readTree(result);
		if (node.isArray()) {
			resultMap = new HashMap<>();
			resultMap.put(AdressConstants.CONTENT, new ObjectMapper().readValue(result, ArrayList.class));
		} else {
			resultMap = new ObjectMapper().readValue(result, HashMap.class);
		}

		return resultMap;
	}
}
