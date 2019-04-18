package br.com.sassine.restclassify.api.service;

import java.nio.charset.Charset;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.sassine.restclassify.api.dto.ata.Ata;

@Service
public class RestTemplateService {

	public String execute(Object contentBody, String url) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Gson convert = new Gson();
		HttpEntity<?> requestBody = new HttpEntity<>(convert.toJson(contentBody).toString(), headers);
		return restTemplate.postForObject(url, requestBody, String.class);
	}

}
