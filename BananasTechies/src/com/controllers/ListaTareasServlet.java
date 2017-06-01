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

//import com.modelos.Proyecto;
import com.modelos.Tarea;
//import com.modelos.Usuario;
import com.modelos.Usuario;

@WebServlet("/ListaTareasServlet")
public class ListaTareasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		
		if( misession.getAttribute("userId")!=null ){
			
			if( misession.getAttribute("userId").equals("ricardo@r.es")){
			Tarea[] listaDeTareasRicardo = {
					new	Tarea(1, "Tarea 1","En Progreso","activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario (1, "Ricardo", "Gere")),
					new	Tarea(2, "Tarea 2","En Progreso","inactivo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario (1, "Ricardo", "Gere")),
					new	Tarea(3, "Tarea 3","En Progreso", "activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario (1, "Ricardo", "Gere"))
				};
				request.setAttribute("listaTareasAMostrar", listaDeTareasRicardo);
			}
			else if( misession.getAttribute("userId").equals("juana@j.es")){
			Tarea[] listaDeTareasJuana = {	
					new	Tarea(4, "Tarea 4","En Progreso", "activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(2, "Juana", "Arco")),
					new	Tarea(5, "Tarea 5","En Progreso", "inactivo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(2, "Juana", "Arco")),
					new	Tarea(6, "Tarea 6","En Progreso", "activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(2, "Juana", "Arco")),
				};	
				request.setAttribute("listaTareasAMostrar", listaDeTareasJuana);
			}
			
			
			else if( misession.getAttribute("userId").equals("luis@l.es")){
			Tarea[] listaDeTareasLuis = {	
					new	Tarea(7, "Tarea 7","En Progreso", "activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(3, "Luis", "Fonzi")),
					new	Tarea(8, "Tarea 8","En Progreso", "inactivo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(3, "Luis", "Fonzi")),
					new	Tarea(9, "Tarea 9","En Progreso", "activo", parseDate("2017-06-01"), "Lorem Ipsum es simplemente el texto de relleno de las imprentas",new Usuario(3, "Luis", "Fonzi")),
				
				};	
				request.setAttribute("listaTareasAMostrar", listaDeTareasLuis);
			}
				

			
			
			request.getRequestDispatcher("Tareas.jsp").forward(request, response);
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
