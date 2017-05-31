package com.controllers;

import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		if (misession.getAttribute("userId") != null) {
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
				
		if( email.equals("ricardo@r.es") && password.equals("ricardo") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "ricardo@r.es");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
			Cookie loginCookie = new Cookie("userId", "ricardo@r.es");
			response.addCookie(loginCookie);
			response.sendRedirect("plantilla_listaProyectos.jsp");
			
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
			rd.include(request, response);
		}
		
		if( email.equals("juana@j.es") && password.equals("juana") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "juana@j.es");
			request.getRequestDispatcher("/ListaProyectoss").forward(request, response);
			Cookie loginCookie = new Cookie("userId", "juana@j.es");
			
			response.addCookie(loginCookie);
			response.sendRedirect("LoginSuccess.jsp");
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
			rd.include(request, response);
		}
		
		if( email.equals("luis@l.es") && password.equals("luis") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "luis@l.es");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
			Cookie loginCookie = new Cookie("userId", "luis@l.es");
			response.addCookie(loginCookie);
			response.sendRedirect("LoginSuccess.jsp");
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
			rd.include(request, response);
		}
		

		
		
		Cookie [] cookies = request.getCookies();

		for(int i=0; i<cookies.length; i++)
		{
		    Cookie cookieActual = cookies[i];

		    String identificador = cookieActual.getName();
		    String valor = cookieActual.getValue();

		    if(identificador.equals("userId")){
		    // tratamiento específico para ese usuario, como por ejemplo mostrar una web
		    // personalizada con los últimos artículos que estuvo consultando.
		    }
		}
		
	}

}
