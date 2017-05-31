package com.modelos;

import java.util.Date;

public class Tarea {
	String idTarea;
	String titulo;
	String status;
	boolean activo;
	Date fechaDeInicio;
	Date fechaEstimadaFin;
	Date fechaDeFin;
	String descripcion;
	String notas;
	String prioridad;
	Usuario responsable;
	
	public Tarea(String idTarea, String titulo, String status, boolean activo, Date fechaDeInicio, Date fechaEstimadaFin, Date fechaDeFin, String descripcion, String notas, String prioridad, Usuario responsable) {
		this.idTarea=""+Math.random();
		this.titulo=titulo;
		this.status=status;
		this.activo=activo;
		this.fechaDeInicio=fechaDeInicio;
		this.fechaEstimadaFin=fechaEstimadaFin;
		this.fechaDeFin=fechaDeFin;
		this.descripcion=descripcion;
		this.notas=notas;
		this.prioridad=prioridad;
		this.responsable=responsable;
		
	}

}
