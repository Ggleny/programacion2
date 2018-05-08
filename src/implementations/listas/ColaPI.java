package implementations.listas;

import api.ColaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Cola, utilizando arreglos, de forma tal que el primer elemento siempre 
 * se encontrara al inicio de arreglo. Resulta mas costoso desacolar pero menos costoso acolar.
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
		for(int i = 0; i<cantidad;i++)
			vector[i]=vector[i+1];
		cantidad--;
	}

	public boolean ColaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Primero() {
		return vector[0];
	}

}
