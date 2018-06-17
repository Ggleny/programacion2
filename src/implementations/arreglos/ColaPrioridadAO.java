package implementations.arreglos;

import api.ColaPrioridadTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Cola con Prioridad, utilizando un arreglo de objetos, de forma tal que el tope siempre 
 * se encontrara al final del arreglo. Resulta menos costoso desacolar que acolar.
 */
public class ColaPrioridadAO implements ColaPrioridadTDA {

	class Elemento{
		int valor;
		int prioridad;
	}
	
	Elemento[] elementos;
	int cantidad;
	
	public void InicializarCola() {
		cantidad = 0;
		elementos = new Elemento[100];
	}

	public void AcolarPrioridad(int x, int prioridad) {
		int j = cantidad;
		for(; j>0 && elementos[j-1].prioridad>=prioridad; j--){
			elementos[j]=elementos[j-1];
		}
		elementos[j] = new Elemento();
		elementos[j].valor = x;
		elementos[j].prioridad = prioridad;
		cantidad++;
	}

	public void Desacolar() {
		cantidad--;
	}

	public boolean ColaVacia() {
		return (cantidad==0);
	}

	public int Primero() {
		return elementos[cantidad-1].valor;
	}

	public int Prioridad() {
		return elementos[cantidad-1].prioridad;
	}

}
