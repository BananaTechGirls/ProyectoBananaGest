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

		if (misession.getAttribute("sessionUserId") != null) {
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
				
		if( email.equals("ricardo@r.es") && password.equals("ricardo") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("sessionUserId", "Ricardo");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
		}else if( email.equals("juana@j.es") && password.equals("juana") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("sessionUserId", "Juana");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
		}else if( email.equals("luis@l.es") && password.equals("luis") ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("sessionUserId", "Luis");
			request.getRequestDispatcher("/ListaProyectos").forward(request, response);
			
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
			rd.include(request, response);
		}

	}

}
