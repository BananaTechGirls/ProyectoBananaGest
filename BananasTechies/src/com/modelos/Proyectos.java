package com.modelos;

import java.util.Date;

public class Proyectos {
	private String idProyectos;
	private String titulo;
	private Usuarios responsable;
	private Date fechaDeInicio;
	private Date fechaEstimadaFin;
	private Date fechaDeFin;
	private String status;
	private boolean progreso;
	private Tareas[] tareas;
	private String descripcion;
	private String notas;

	
	public Proyectos(String idProyectos, String titulo, Usuarios responsable,Date fechaDeInicio, Date fechaEstimadaFin, Date fechaDeFin,String status, boolean progreso,Tareas[] tareas, String descripcion, String notas){
		this.idProyectos=idProyectos;
		this.titulo=titulo;
		this.responsable=responsable;
		this.fechaDeInicio=fechaDeInicio;
		this.fechaEstimadaFin=fechaEstimadaFin;
		this.fechaDeFin=fechaDeFin;
		this.status=status;
		this.progreso=progreso;
		this.tareas=tareas;
		this.descripcion=descripcion;
		this.notas=notas;
		
	}

	public Proyectos(String idProyectos,String titulo,Usuarios responsable,Date fechaDeInicio,String status, boolean progreso){
		this.idProyectos=idProyectos;
		this.titulo=titulo;
		this.responsable=responsable;
		this.fechaDeInicio=fechaDeInicio;
		this.status=status;
		this.progreso=progreso;
	}
	
	
	//getters y setters
	public String getIdProyectos() {
		return idProyectos;
	}

	public void setIdProyectos(String idProyectos) {
		this.idProyectos = idProyectos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Tareas[] getTareas() {
		return tareas;
	}

	public void setTareas(Tareas[] tareas) {
		this.tareas = tareas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isProgreso() {
		return progreso;
	}

	public void setProgreso(boolean progreso) {
		this.progreso = progreso;
	}

	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Date getFechaEstimadaFin() {
		return fechaEstimadaFin;
	}

	public void setFechaEstimadaFin(Date fechaEstimadaFin) {
		this.fechaEstimadaFin = fechaEstimadaFin;
	}

	public Date getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(Date fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}


	public Usuarios getResponsable() {
		return responsable;
	}

	public void setResponsable(Usuarios responsable) {
		this.responsable = responsable;
	}
	
	
}
