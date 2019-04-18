package br.com.sassine.restclassify.security.filter;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import br.com.sassine.restclassify.security.service.AuthenticationService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AuthenticationFilter extends GenericFilterBean {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		Authentication authentication = AuthenticationService.getAuthentication((HttpServletRequest) request);

		SecurityContextHolder.getContext().setAuthentication(authentication);

		filterChain.doFilter(request, response);
	}

}
