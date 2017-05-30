package com.modelos;

import java.util.Date;

public class Proyectos {
	int id;
	String titulo;
	Tareas[] tareas;
	String status;
	boolean activo;
	Date fechaDeInicio;
	Date fechaEstimadaFin;
	Date fechaDeFin;
	String descripcion;
	String notas;
	String prioridad;
	Usuarios responsable;
	
	public Proyectos(int id, String titulo, Tareas[] tareas, String status, boolean activo, Date fechaDeInicio, Date fechaEstimadaFin, Date fechaDeFin, String descripcion, String notas, String prioridad, Usuarios responsable){
		this.id=id;
		this.titulo=titulo;
		this.tareas=tareas;
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
