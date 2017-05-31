package com.modelos;

import java.util.List;


public class Usuario {
	private int userId;
	private String nombre;
	private String apellido;
	private String email;
	private String pass;
	private List<Proyecto> proyectoAsignado;
	private List<Tarea> tareasAsignados;
	
	public Usuario(){
		
	}
	
	public Usuario(int userId, String nombre, String apellido, String email, String pass, List<Proyecto> proyectoAsignado, List<Tarea> tareasAsignados) {
		this.setUserId(userId);
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.pass = pass;
		
		this.proyectoAsignado = proyectoAsignado;
		this.tareasAsignados = tareasAsignados;
		
	}

	public Usuario(int userId, String nombre, String apellido) {
		this.setUserId(userId);
		this.nombre=nombre;
		this.apellido=apellido;
			
		
	}
	
	
	//getters y setters
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public List<Proyecto> getProyectoAsignado() {
		return proyectoAsignado;
	}

	public void setProyectoAsignado(List<Proyecto> proyectoAsignado) {
		this.proyectoAsignado = proyectoAsignado;
	}

	public List<Tarea> getTareasAsignados() {
		return tareasAsignados;
	}

	public void setTareasAsignados(List<Tarea> tareasAsignados) {
		this.tareasAsignados = tareasAsignados;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}
