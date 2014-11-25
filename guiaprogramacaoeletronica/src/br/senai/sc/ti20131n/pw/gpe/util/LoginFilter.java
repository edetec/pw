package br.senai.sc.ti20131n.pw.gpe.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.catalina.manager.util.SessionUtils;

import br.senai.sc.ti20131n.pw.gpe.mb.SessaoUsuarioMb;

@WebFilter(urlPatterns="/admin/*")
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		SessaoUsuarioMb sessaoUsuarioMb = (SessaoUsuarioMb) httpServletRequest
				.getSession().getAttribute("sessaoUsuarioMb");
		
		if(sessaoUsuarioMb == null || !sessaoUsuarioMb.isLogado()){
			((HttpServletResponse)response).sendRedirect(
					httpServletRequest.getContextPath().concat("/loginform.xhtml"));		
		}
		
		filterChain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {}

	@Override
	public void init(FilterConfig arg0) throws ServletException {}

}
