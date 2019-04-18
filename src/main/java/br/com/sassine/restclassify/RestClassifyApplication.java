package br.com.sassine.restclassify;

import javax.servlet.Filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class RestClassifyApplication extends SpringBootServletInitializer {
	private static final Logger logger = LogManager.getLogger(RestClassifyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestClassifyApplication.class, args);
	}

	@Bean
	public Filter getCharacterEncodingFilter() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return encodingFilter;
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RestClassifyApplication.class);
	}

}
