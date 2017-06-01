package com.modelos;

import java.util.Date;


import com.modelos.Proyecto;


public class Tarea {
	private int idTarea;
	private String tituloT;
	private Proyecto titulo;
	private String progresoT ;
	private String statusT;
	private Date fechaDeInicioT;
	private Date fechaEstimadaFinT;
	private Date fechaDeFinT;
	private String descripcionT;
	private String notasT;
	private Usuario responsable;
	
	//para el detalle de la tarea
	public Tarea(int idTarea, String tituloT,String progresoT, String statusT, Date fechaDeInicioT, Date fechaEstimadaFinT, Date fechaDeFinT, String descripcionT, String notasT, Usuario responsable) {
		this.idTarea=idTarea;
		this.tituloT=tituloT;
		this.statusT=statusT;
		this.progresoT=progresoT;
		this.fechaDeInicioT=fechaDeInicioT;
		this.fechaEstimadaFinT=fechaEstimadaFinT;
		this.fechaDeFinT=fechaDeFinT;
		this.descripcionT=descripcionT;
		this.notasT=notasT;
		this.responsable=responsable;
		
		
	}
	
	
	
	
	//para la lista de tareas
	public Tarea(int idTarea, String tituloT,String progresoT, String statusT, Date fechaDeInicioT, String descripcionT, Usuario responsable) {
		this.idTarea=idTarea;
		this.tituloT=tituloT;
		this.statusT=statusT;
		this.progresoT=progresoT;
		this.fechaDeInicioT=fechaDeInicioT;
		this.descripcionT=descripcionT;
		this.responsable=responsable;
		
	}
	

	
	
	//setters y getters

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getTituloT() {
		return tituloT;
	}

	public void setTituloT(String tituloT) {
		this.tituloT = tituloT;
	}

	public String getProgresoT() {
		return progresoT;
	}

	public void setProgresoT(String progresoT) {
		this.progresoT = progresoT;
	}

	public String isStatusT() {
		return statusT;
	}


	public Date getFechaDeInicioT() {
		return fechaDeInicioT;
	}

	public void setFechaDeInicioT(Date fechaDeInicioT) {
		this.fechaDeInicioT = fechaDeInicioT;
	}

	public Date getFechaEstimadaFinT() {
		return fechaEstimadaFinT;
	}

	public void setFechaEstimadaFinT(Date fechaEstimadaFinT) {
		this.fechaEstimadaFinT = fechaEstimadaFinT;
	}

	public Date getFechaDeFinT() {
		return fechaDeFinT;
	}

	public void setFechaDeFinT(Date fechaDeFinT) {
		this.fechaDeFinT = fechaDeFinT;
	}

	public String getDescripcionT() {
		return descripcionT;
	}

	public void setDescripcionT(String descripcionT) {
		this.descripcionT = descripcionT;
	}

	public String getNotasT() {
		return notasT;
	}

	public void setNotasT(String notasT) {
		this.notasT = notasT;
	}

	

	public Proyecto getTitulo() {
		return titulo;
	}

	public void setTitulo(Proyecto titulo) {
		this.titulo = titulo;
	}

	public Usuario getResponsable() {
		return responsable;
	}

	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
	}

}
