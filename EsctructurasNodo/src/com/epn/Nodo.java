package com.epn;

public class Nodo {
	String dato;
	Nodo enlace;
	
	public Nodo(String dato) {
		
		//PRIMER Nodo único
		this.dato=dato;
		enlace=null;
		
	}

	public Nodo(String dato, Nodo enlace) {
		super();
		this.dato = dato;
		this.enlace = enlace;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", enlace=" + enlace + "]";
	}
	
	
	
	
	

}
