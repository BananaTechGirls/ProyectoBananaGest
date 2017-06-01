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

@WebServlet("/ListaTareasServlet")
public class ListaTareasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession)request.getSession();
		if( misession.getAttribute("userId")!=null ){
			Tarea[] listaDeTareasRicardo = {
					new	Tarea(),
					new	Tarea(),
					new	Tarea(),
			};
		}
	}

	/*private static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (Exception e) {
			return null;
		}
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
