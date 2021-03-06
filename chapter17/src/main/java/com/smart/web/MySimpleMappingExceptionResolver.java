package com.smart.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySimpleMappingExceptionResolver extends SimpleMappingExceptionResolver{

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		System.out.println(ex.getMessage());
		return super.doResolveException(request, response, handler, ex);
	}	  
}
