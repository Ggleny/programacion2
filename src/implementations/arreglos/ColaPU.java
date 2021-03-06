package implementations.arreglos;

import api.ColaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarCola: constante
 * Acolar: lineal
 * Desacolar: constante
 * ColaVacia: constante
 * Primero: constante
 */
public class ColaPU implements ColaTDA {

	int[] vector;
	int cantidad;

	public void InicializarCola() {
		vector = new int [100];
		cantidad = 0;
	}

	public void Acolar(int x) {
		for(int i = cantidad; i>0;i--)
			vector[i]=vector[i-1];
		vector[0]=x;
		cantidad++;
	}

	public void Desacolar() {
		cantidad--;
	}

	public boolean ColaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Primero() {
		return vector[cantidad-1];
	}

}
