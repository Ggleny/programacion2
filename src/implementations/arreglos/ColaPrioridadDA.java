package implementations.arreglos;

import api.ColaPrioridadTDA;

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
public class ColaPrioridadDA implements ColaPrioridadTDA {

	int[] elementos;
	int[] prioridades;
	int cantidad;
	
	public void InicializarCola() {
		cantidad = 0;
		elementos = new int[100];
		prioridades = new int[100];
	}

	public void AcolarPrioridad(int x, int prioridad) {
		int j = cantidad;
		for(; j>0 && prioridades[j-1]==prioridad; j--){
			elementos[j]=elementos[j-1];
			prioridades[j]=prioridades[j-1];
		}
		elementos[j]=x;
		prioridades[j] = prioridad;
		cantidad++;
	}

	public void Desacolar() {
		cantidad--;
	}

	public boolean ColaVacia() {
		return (cantidad==0);
	}

	public int Primero() {
		return elementos[cantidad-1];
	}

	public int Prioridad() {
		return prioridades[cantidad-1];
	}

}
