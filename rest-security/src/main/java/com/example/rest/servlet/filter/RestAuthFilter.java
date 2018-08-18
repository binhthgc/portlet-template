/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.example.rest.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Binhth
 */
@Component(
	immediate = true, 
	property = { 
		"servlet-context-name=", 
		"servlet-filter-name=Rest Auth Filter",
		"url-pattern=/o/rest/*" 
	},
	service = Filter.class
)
public class RestAuthFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		// START case 1 kiem tra header neu co Authorization
		// truong hop neu block api khong cho he thong khac goi thi remove doan nay di
		HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
		Enumeration<String> headerNames = httpRequest.getHeaderNames();

		boolean isBasic = false;
		String strBasic = StringPool.BLANK;
		
		if (headerNames != null) {
			while (headerNames.hasMoreElements()) {
	            String key = (String) headerNames.nextElement();
	            String value = httpRequest.getHeader(key);
	            if (key.trim().equalsIgnoreCase("Authorization")) {
	            	strBasic = value;
	            	isBasic = true;
	            	break;
	            }
	        }
		}

		if (isBasic) {

			try {
				// Get encoded user and password, comes after "BASIC "  
		        String userpassEncoded = strBasic.substring(6);  
		        String decodetoken = new String(Base64.decode(userpassEncoded),
		                StringPool.UTF8);

		        String account[] = decodetoken.split(":");
		        
		        String email = account[0];
		        String password = account[1];
	        
				AuthenticatedSessionManagerUtil.getAuthenticatedUserId(httpRequest, email, password, CompanyConstants.AUTH_TYPE_EA);
			
				authOK(servletRequest, servletResponse, filterChain);
				
			} catch (PortalException e) {
				authFailure(servletResponse);
			}
	    // END case 1
		} else {
			// START case 2: kiem tra user da dang nhap tren he thong.
			Object user = servletRequest.getAttribute("USER");
			if (Validator.isNotNull(user)) {
				authOK(servletRequest, servletResponse, filterChain);
			} else {
				authFailure(servletResponse);
			}
			
		}

	}

	private void authOK(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		filterChain.doFilter(servletRequest, servletResponse);
	}

	private void authFailure(ServletResponse servletResponse) throws IOException {
		servletResponse.setCharacterEncoding("UTF-8");
		servletResponse.setContentType("application/json; charset=utf-8");
		PrintWriter out = servletResponse.getWriter();
		out.println("{\"code\":403,\"error\":\"permission denied\"}");
		out.flush();
		out.close();
	}

	@Override
	public void init(FilterConfig filterConfig) {
	}

	
}