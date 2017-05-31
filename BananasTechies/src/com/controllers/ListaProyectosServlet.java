package com.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelos.Proyectos;
import com.modelos.Usuarios;


@WebServlet("/ListaProyectos")
public class ListaProyectosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		
		if( misession.getAttribute("idUsuario")!=null ){
			Proyectos[] listaDeProyectos = {
					new Proyectos(String idProyectos,String titulo,Usuarios responsable,Date fechaDeInicio,String status, boolean progreso),
					new Proyectos(String idProyectos,String titulo,Usuarios responsable,Date fechaDeInicio,String status, boolean progreso),
					new Proyectos(String idProyectos,String titulo,Usuarios responsable,Date fechaDeInicio,String status, boolean progreso)
			};
			
			request.setAttribute("listaProyectosAMostrar", listaDeProyectos);
			
			request.getRequestDispatcher("plantilla_listaProyectos.jsp").forward(request, response);
		}else{
			misession.invalidate();
			response.sendRedirect("login");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
