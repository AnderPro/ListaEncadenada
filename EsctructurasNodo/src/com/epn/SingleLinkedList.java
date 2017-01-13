package com.epn;


public class SingleLinkedList {
	 protected Nodo primerNodo;
	protected long longitud;
	
	public SingleLinkedList() {
		//crea lista vacía
		this.primerNodo= null;
		this.longitud=0;
	}
	
	public long getlongitud(){
		return longitud;
	}
	public boolean estaVacia(){
		return (primerNodo== null);
	}
	
	public void insertarNodoInicio(Nodo nodo){
		nodo.setEnlace(primerNodo);
		primerNodo= nodo;
		longitud++;
		
	}
	
	public void insertarNodoFinal(String dato){
		Nodo p=new Nodo(dato);//este va hacer el ultimo nodo null
		
		Nodo q=this.primerNodo;
		
		if(estaVacia()){
			primerNodo= new Nodo(dato);
			longitud++;
		}else{
			while(q.enlace!=null){
				q=q.enlace;
				
			}
			q.enlace=p;
			longitud++;
		}
		
		
}
	public Nodo buscarDato(String dato){
	 Nodo p;
		
	 for (p=primerNodo; p!=null; p=p.getEnlace()){
		if(dato.compareToIgnoreCase(p.getDato())==0){
			return p;
		}}
			return null;
		}
	
	//Método toString
	public String listar(){
		String salida="";
		if(estaVacia()){
			return "Lista vacia";
		}else{
			salida+="\n la lista es:\n";
			Nodo p= primerNodo;
			while(p!=null){
				salida+=p.dato+"\n";
				p=p.enlace;
				
			}
			
		}
		return salida;
			
	}
}
