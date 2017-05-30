package com.modelos;

import java.util.Date;

public class Tareas {
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
	Usuarios responsable;
	
	public Tareas(String idTarea, String titulo, String status, boolean activo, Date fechaDeInicio, Date fechaEstimadaFin, Date fechaDeFin, String descripcion, String notas, String prioridad, Usuarios responsable) {
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
