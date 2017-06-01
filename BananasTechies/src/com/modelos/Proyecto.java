package com.modelos;

import java.util.Date;

public class Proyecto {
	private int idProyecto;
	private String titulo;
	private Usuario responsable;
	private Date fechaDeInicio;
	private Date fechaEstimadaFin;
	private Date fechaDeFin;
	private boolean status;
	private String progreso;
	private Tarea[] tareas;
	private String descripcion;
	private String notas;

	public Proyecto(int idProyecto, String titulo, Usuario responsable, Date fechaDeInicio, Date fechaEstimadaFin,
			Date fechaDeFin, boolean status, String progreso, Tarea[] tareas, String descripcion, String notas) {
		this.idProyecto = idProyecto;
		this.titulo = titulo;
		this.responsable = responsable;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaEstimadaFin = fechaEstimadaFin;
		this.fechaDeFin = fechaDeFin;
		this.status = status;
		this.progreso = progreso;
		this.tareas = tareas;
		this.descripcion = descripcion;
		this.notas = notas;

	}

	public Proyecto(int idProyecto, String titulo, Usuario responsable, Date fechaDeInicio, String progreso,boolean status) {
		this.idProyecto = idProyecto;
		this.titulo = titulo;
		this.responsable = responsable;
		this.fechaDeInicio = fechaDeInicio;
		this.status = status;
		this.progreso = progreso;
	}
	
	public Proyecto(String titulo,Usuario responsable){
		this.titulo = titulo;
		this.responsable = responsable;
	}

	// getters y setters

	

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Usuario getResponsable() {
		return responsable;
	}

	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String isProgreso() {
		return progreso;
	}

	public void setProgreso(String progreso) {
		this.progreso = progreso;
	}

	public Tarea[] getTareas() {
		return tareas;
	}

	public void setTareas(Tarea[] tareas) {
		this.tareas = tareas;
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

}
