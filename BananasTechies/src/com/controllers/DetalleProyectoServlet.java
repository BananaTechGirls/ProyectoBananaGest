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
import com.modelos.Tarea;
import com.modelos.Usuario;


@WebServlet("/DetalleProyectoServlet")
public class DetalleProyectoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		
		if( misession.getAttribute("sessionUserId")!=null ){
			
			
			if( misession.getAttribute("sessionUserId").equals("ricardo@r.es")){
				Proyecto[] detalleDeProyectosRicardo = {
					new Proyecto(1, "Proyecto 1", new Usuario("Ricardo", "Gere"), parseDate("2017-06-01"),parseDate("2017-08-01"),null,"activo", "En Progreso",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
					new Proyecto(2, "Proyecto 2", new Usuario("Ricardo", "Gere"), parseDate("2017-09-17"),parseDate("2017-08-01"),null,"inactivo", "Pendiente hacer",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
					new Proyecto(3, "Proyecto 3", new Usuario("Ricardo", "Gere"), parseDate("2017-06-01"),parseDate("2017-08-01"),null,"activo", "En Progreso",new Tarea[7],"descripcion del Proyecto","Notas del proyecto")
				};
				request.setAttribute("detalleProyectosAMostrar", detalleDeProyectosRicardo);
			}else if( misession.getAttribute("sessionUserId").equals("juana@j.es")){
				Proyecto[] detalleDeProyectosJuana = {
					new Proyecto(4, "Proyecto 4", new Usuario( "Juana", "Arco"), parseDate("2017-07-01"),parseDate("2017-08-01"),null,"activo", "En Progreso",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
					new Proyecto(5, "Proyecto 5", new Usuario("Juana", "Arco"), parseDate("2017-10-17"),parseDate("2017-08-01"),null,"inactivo", "Pendiente hacer",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
					new Proyecto(6, "Proyecto 6", new Usuario( "Juana", "Arco"), parseDate("2017-03-01"),parseDate("2017-08-01"),null,"inactivo", "Pendiente hacer",new Tarea[7],"descripcion del Proyecto","Notas del proyecto")
				};
				request.setAttribute("detalleProyectosAMostrar", detalleDeProyectosJuana);
			}else{
				if( misession.getAttribute("sessionUserId").equals("luis@l.es")){
					Proyecto[] detalleDeProyectosLuis = {
							new Proyecto(7, "Proyecto 7", new Usuario( "Luis", "Fonzi"), parseDate("2017-11-01"),parseDate("2017-08-01"),null,"inactivo", "Pendiente hacer",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
							new Proyecto(8, "Proyecto 8", new Usuario( "Luis", "Fonzi"), parseDate("2017-02-17"),parseDate("2017-08-01"),null,"activo", "En Progreso",new Tarea[7],"descripcion del Proyecto","Notas del proyecto"),
							new Proyecto(9, "Proyecto 9", new Usuario( "Luis", "Fonzi"), parseDate("2017-08-01"),parseDate("2017-08-01"),null,"activo", "En Progreso",new Tarea[7],"descripcion del Proyecto","Notas del proyecto")
					
					};
					request.setAttribute("detalleProyectosAMostrar", detalleDeProyectosLuis);
				}
			}	
			//int idProyecto, String titulo, Usuario responsable, Date fechaDeInicio, Date fechaEstimadaFin,
			//Date fechaDeFin, String status, String progreso, Tarea[] tareas, String descripcion, String notas)
			

			request.getRequestDispatcher("plantilla_DetalleProyectos.jsp").forward(request, response);
			
			
		}else{
			
			misession.invalidate();
			response.sendRedirect("ListaProyectos");
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
