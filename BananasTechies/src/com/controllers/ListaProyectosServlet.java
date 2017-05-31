package com.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelos.Proyecto;
import com.modelos.Usuario;


@WebServlet("/ListaProyectos")
public class ListaProyectosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		
		if( misession.getAttribute("userId")!=null ){
			Proyecto[] listaDeProyectosRicardo = {
					new Proyecto(1, "titulo", new Usuario(1, "Ricardo", "Gere"), parseDate("2017-06-01"), "En Progreso", true),
					new Proyecto(2, "titulo", new Usuario(2, "Juana", "Arco"), parseDate("2017-09-17"), "activo", true),
					new Proyecto(3, "titulo", new Usuario(1, "Luis", "Miguel"), parseDate("2017-06-01"), "activo", true)
					
			};//crear 3 listas de proyectos
			
			request.setAttribute("listaProyectosAMostrar", listaDeProyectosRicardo);
			
			request.getRequestDispatcher("plantilla_listaProyectos.jsp").forward(request, response);
		}else{
			
			misession.invalidate();
			response.sendRedirect("login");
		}
	}

	
	 private static Date parseDate(String date) {
	     try {
	         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
	     } catch (Exception e) {
	         return null;
	     }
	  }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
