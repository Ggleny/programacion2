package implementations.listas;

import api.ColaPrioridadTDA;
import utilities.NodoConPrioridad;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarCola: constante
 * AcolarPrioridad: lineal
 * Desacolar: constante
 * ColaVacia: constante
 * Primero: constante
 * Prioridad: constante
 */
public class ColaPrioridadLD implements ColaPrioridadTDA {
	NodoConPrioridad mayorPrioridad ;
	
	public void InicializarCola() {
		mayorPrioridad= null;
	}
	
	public void AcolarPrioridad(int x, int prioridad) {
		NodoConPrioridad nuevo = new NodoConPrioridad();
		nuevo.info = x;
		nuevo.prioridad = prioridad;
		if ( (mayorPrioridad == null) || (prioridad > mayorPrioridad.prioridad) ){
			nuevo.siguiente = mayorPrioridad;
			mayorPrioridad = nuevo;
		}
		else{
			NodoConPrioridad aux = mayorPrioridad;
			while ( (aux.siguiente != null) && (aux.siguiente.prioridad >= prioridad) ){
				aux = aux.siguiente;
			}
			nuevo.siguiente = aux.siguiente;
			aux.siguiente = nuevo;
		}
	}
	
	public void Desacolar() {
		mayorPrioridad = mayorPrioridad.siguiente;
	}

	public int Primero() {
		return mayorPrioridad.info;
	}
	
	public boolean ColaVacia() {
		return (mayorPrioridad == null);
	}

	public int Prioridad() {
		return mayorPrioridad.prioridad;
	}

}
