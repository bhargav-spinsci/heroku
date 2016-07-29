package com.spinsci.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.websocket.Session;

import com.sun.jersey.spi.dispatch.RequestDispatcher;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String un = request.getParameter("un");
		session.setAttribute("username", un);
		System.out.println(session.getAttribute("username"));
		String pwd = request.getParameter("pwd");
		System.out.println(un);
		System.out.println(pwd);
		request.setAttribute("username", un);
		request.setAttribute("password", pwd);
		if ("spinsci".equalsIgnoreCase(un) && "hyd".equalsIgnoreCase(pwd)
				&& !"".equalsIgnoreCase(un) && !"".equalsIgnoreCase(pwd)) {
			// RequestDispatcher rd= (RequestDispatcher)
			// request.getRequestDispatcher("/EmpolyeeServlet");
			response.sendRedirect("/FirstServletExample/EmpolyeeServlet");
		}

	}

}
