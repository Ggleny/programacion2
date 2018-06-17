package implementations.arreglos;

import api.PilaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarPila: constante
 * Apilar: constante
 * Desapilar: constante
 * PilaVacia: constante
 * Tope: constante
 */
public class PilaTF implements PilaTDA {

	int[] vector;
	int cantidad;
	
	public void InicializarPila() {
		vector = new int [100];
		cantidad = 0;
	}

	public void Apilar(int x) {		
		vector[cantidad] = x;
		cantidad++;
	}

	public void Desapilar() {
		if(cantidad>0){
			cantidad--;
		}
	}

	public boolean PilaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Tope() {
		return vector[cantidad-1];
	}

}
