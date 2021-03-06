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
		
		if( misession.getAttribute("sessionUserId")!=null ){
			
			
			if( misession.getAttribute("sessionUserId").equals("Ricardo")){
				Proyecto[] listaDeProyectosRicardo = {
					new Proyecto(1, "Proyecto 1", new Usuario("Ricardo", "Gere"), parseDate("2017-06-01"), "En Progreso", "activo"),
					new Proyecto(2, "Proyecto 2", new Usuario("Ricardo", "Gere"), parseDate("2017-09-17"), "Pendiente hacer", "inactivo"),
					new Proyecto(3, "Proyecto 3", new Usuario("Ricardo", "Gere"), parseDate("2017-06-01"), "En progreso", "activo")
				};
				request.setAttribute("listaProyectosAMostrar", listaDeProyectosRicardo);
			}
			if( misession.getAttribute("sessionUserId").equals("Juana")){
				Proyecto[] listaDeProyectosJuana = {
					new Proyecto(4, "Proyecto 4", new Usuario("Juana", "Arco"), parseDate("2017-07-01"), "En Progreso", "activo"),
					new Proyecto(5, "Proyecto 5", new Usuario("Juana", "Arco"), parseDate("2017-10-17"), "Pendiente hacer", "inactivo"),
					new Proyecto(6, "Proyecto 6", new Usuario("Juana", "Arco"), parseDate("2017-03-01"), "Pendiente hacer","inactivo")
				};
				request.setAttribute("listaProyectosAMostrar", listaDeProyectosJuana);
			}
			if( misession.getAttribute("sessionUserId").equals("Luis")){
				Proyecto[] listaDeProyectosLuis = {
					new Proyecto(7, "Proyecto 7", new Usuario( "Luis", "Fonzi"), parseDate("2017-11-01"), "Pendiente hacer", "inactivo"),
					new Proyecto(8, "Proyecto 8", new Usuario( "Luis", "Fonzi"), parseDate("2017-02-17"), "En Progreso","activo"),
					new Proyecto(9, "Proyecto 9", new Usuario( "Luis", "Fonzi"), parseDate("2017-08-01"), "En Progreso", "activo")
				};
					request.setAttribute("listaProyectosAMostrar", listaDeProyectosLuis);
			}
		
			
			

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
