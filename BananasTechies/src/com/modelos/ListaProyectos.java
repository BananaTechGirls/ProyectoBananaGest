package com.modelos;


import java.util.HashMap;
import java.util.Map;
import com.modelos.Proyectos;
import com.modelos.Usuarios;

public class ListaProyectos {
	Map<String, Proyectos> losProyectos;

	public ListaProyectos() {
		this.losProyectos = new HashMap<String, Proyectos>();
	}

	public boolean almacenarProyectos(Proyectos unProyectos) {
		this.losProyectos.put(unProyectos.getIdProyectos(), unProyectos);
		return true;
	}

	public Proyectos borrar(String idProyectos) {
		if (this.losProyectos != null && idProyectos.trim() != "") {
			Proyectos elProyectosABorrar = this.losProyectos.get(idProyectos);
			this.losProyectos.remove(idProyectos);
			return elProyectosABorrar;
		} else
			return null;
	}

	public void muestraLosProyectos() {
		for(Map.Entry p : this.losProyectos.entrySet() ){
			System.out.println(p.getKey()+" /�"+ p.getValue() +"�/ "+ ((Proyectos)p.getValue()).getTitulo() );
		}
	}



}
