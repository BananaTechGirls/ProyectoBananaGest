package com.modelos;

import java.util.Date;
import com.modelos.Proyecto;;

public class Tarea extends Proyecto {
	private int idTarea;
	private String tituloT;
	private Proyecto titulo;
	private String progresoT ;
	private boolean statusT;
	private Date fechaDeInicioT;
	private Date fechaEstimadaFinT;
	private Date fechaDeFinT;
	private String descripcionT;
	private String notasT;
	private Usuario responsableT;
	
	//para el detalle de la tarea
	public Tarea(int idTarea, String tituloT,String progresoT, boolean statusT, Date fechaDeInicioT, Date fechaEstimadaFinT, Date fechaDeFinT, String descripcionT, String notasT) {
		this.idTarea=idTarea;
		this.tituloT=tituloT;
		this.statusT=statusT;
		this.progresoT=progresoT;
		this.fechaDeInicioT=fechaDeInicioT;
		this.fechaEstimadaFinT=fechaEstimadaFinT;
		this.fechaDeFinT=fechaDeFinT;
		this.descripcionT=descripcionT;
		this.notasT=notasT;
		
		
	}
	
	public Tarea(){
		
	};
	//para la lista de tareas
	public Tarea(int idTarea, String tituloT,String progresoT, boolean statusT, Date fechaDeInicioT, String descripcionT) {
		this.idTarea=idTarea;
		this.tituloT=tituloT;
		this.statusT=statusT;
		this.progresoT=progresoT;
		this.fechaDeInicioT=fechaDeInicioT;
		this.descripcionT=descripcionT;
		
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

	public boolean isStatusT() {
		return statusT;
	}

	public void setStatusT(boolean statusT) {
		this.statusT = statusT;
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

	public Usuario getResponsableT() {
		return responsableT;
	}

	public void setResponsableT(Usuario responsableT) {
		this.responsableT = responsableT;
	}

	public Proyecto getTitulo() {
		return titulo;
	}

	public void setTitulo(Proyecto titulo) {
		this.titulo = titulo;
	}

}
