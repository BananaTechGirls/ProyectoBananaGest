package com.modelos;

import java.util.List;


import javafx.scene.media.VideoTrack;
import sun.net.www.content.image.jpeg;

public class Usuarios {
	private String userId;
	private String nombre;
	private String apellido;
	private String email;
	private String pass;
	private jpeg imagen;
	private VideoTrack video;
	private List<Proyectos> proyectosAsignados;
	private List<Tareas> tareasAsignados;
	
	
	public Usuarios(String userId, String nombre, String apellido, String email, String pass, jpeg imagen, VideoTrack video, List<Proyectos> proyectosAsignados, List<Tareas> tareasAsignados) {
		this.userId=""+Math.random();
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.pass = pass;
		this.imagen = imagen;
		this.video = video;
		this.proyectosAsignados = proyectosAsignados;
		this.tareasAsignados = tareasAsignados;
		
	}
	
	
	
	//getters y setters
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public jpeg getImagen() {
		return imagen;
	}

	public void setImagen(jpeg imagen) {
		this.imagen = imagen;
	}

	public VideoTrack getVideo() {
		return video;
	}

	public void setVideo(VideoTrack video) {
		this.video = video;
	}

	public List<Proyectos> getProyectosAsignados() {
		return proyectosAsignados;
	}

	public void setProyectosAsignados(List<Proyectos> proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}

	public List<Tareas> getTareasAsignados() {
		return tareasAsignados;
	}

	public void setTareasAsignados(List<Tareas> tareasAsignados) {
		this.tareasAsignados = tareasAsignados;
	}


}
