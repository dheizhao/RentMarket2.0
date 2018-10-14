package com.etc.RentMarket.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 小白
 * 后台过滤器
 * 判断用户是否登录
 */
@WebFilter("/*")
public class AdminFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String uri = req.getRequestURI();
		System.out.println("uri:"+uri);
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("adm")!=null) {//如果有登录就放行
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}else {//将登陆界面所要用到的相关文件放行
			if(uri.endsWith("login1.html")||uri.endsWith("admin.do")||uri.endsWith(".js")||uri.endsWith(".css")||uri.endsWith(".png")||uri.endsWith(".jpg")) {
				chain.doFilter(request, response);
			}else {//没登陆的话就去登陆界面
				res.sendRedirect("login1.html");
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
