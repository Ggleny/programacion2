package implementations.arreglos;

import api.ColaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarCola: constante
 * Acolar: constante
 * Desacolar: lineal
 * ColaVacia: constante
 * Primero: constante
 */
public class ColaPI implements ColaTDA {

	int[] vector;
	int cantidad;

	public void InicializarCola() {
		vector = new int [100];
		cantidad = 0;
	}

	public void Acolar(int x) {
		vector[cantidad] = x;
		cantidad++;
	}

	public void Desacolar() {
		cantidad--;
		for(int i = 0; i<cantidad;i++)
			vector[i]=vector[i+1];
	}

	public boolean ColaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Primero() {
		return vector[0];
	}

}
