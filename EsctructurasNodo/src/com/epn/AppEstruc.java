package com.epn;

public class AppEstruc {

	public static void main(String[] args) {
		
		SingleLinkedList lista = new SingleLinkedList();
		
		System.out.println("¿La lista está vacía?"+lista.estaVacia());
		
		lista.insertarNodoFinal("Anderson");
		lista.insertarNodoFinal("Daniela");
		lista.insertarNodoFinal("jose");
		
		System.out.println(lista.listar());
		
		System.out.println("¿La lista está vacía?"+lista.estaVacia());
		
		
		System.out.println("Longitud de la lista:"+lista.longitud);
		
		Nodo m1= new Nodo("Javier");
	   lista.insertarNodoInicio(m1);
	   System.out.println(lista.listar()+"\nLongitud de la lista:"+lista.longitud);
	   
	   String datoBuscar="Anderson";
	   
	   if(lista.buscarDato(datoBuscar)==null){
		   System.out.println("El dato no exite en la lista");
	   }else{
		   System.out.println(lista.buscarDato(datoBuscar).toString());
	   }
	}

}
