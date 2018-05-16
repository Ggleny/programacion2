package implementations.listas;

import api.ColaTDA;
import utilities.Nodo;
/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Cola, utilizando estructuras dinamicas, donde la estrategia es mantener un putero
 * al primer elemento de la cola y otro al ultimo.
 */

public class ColaLD implements ColaTDA {
	Nodo primero;
	Nodo ultimo;
	
	public void InicializarCola() {
		primero = null;
		ultimo = null;
	}
	
	public void Acolar(int valor) {
		Nodo aux = new Nodo();
		aux.siguiente = null;
		aux.info = valor;
		if(ultimo!=null){
			ultimo.siguiente = aux; 
		}
		ultimo = aux;
		if(primero==null) {
			primero = ultimo;
		}
	}
	
	public void Desacolar() {
		primero = primero.siguiente;
		if (primero==null) {
			ultimo = null;
		}
	}
	
	public boolean ColaVacia() {
		return primero==null;
	}

	public int Primero() {
		return primero.info;
	}

}
