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
		this.losProyectos.put(unProyectos.getCodigo(), unProyectos);
		return true;
	}

	public Proyectos retirar(String unCodigo) {
		if (this.losProyectos != null && unCodigo.trim() != "") {
			Proyectos elProyectosABorrar = this.losProyectos.get(unCodigo);
			this.losProyectos.remove(unCodigo);
			return elProyectosABorrar;
		} else
			return null;
	}

	public void muestraLosCosmeticos() {
		for(Map.Entry m : this.losProyectos.entrySet() ){
			System.out.println(m.getKey()+" /�"+ m.getValue() +"�/ "+ ((Proyectos)m.getValue()).getMarca() );
		}
	}



}
