package com.controllers;

import java.io.IOException;
//import javax.servlet.http.Cookie;
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
		String password = request.getParameter("pass");
				
		if( email.equals("ricardo@r.es") && password.equals("ricardogere") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "ricardo@r.es");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
		}else if( email.equals("juana@j.es") && password.equals("juanaarco") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "juana@j.es");
			request.getRequestDispatcher("/ListaProyectoss").forward(request, response);
		}else if( email.equals("luis@l.es") && password.equals("luisfonzi") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("userId", "luis@l.es");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
			
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
			rd.include(request, response);
		}

	}

}
