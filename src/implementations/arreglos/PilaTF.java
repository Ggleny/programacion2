package implementations.arreglos;

import api.PilaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Pila, utilizando arreglos, de forma tal que el tope siempre 
 * se encontrara al final del arreglo. Resulta menos costoso tanto apilar como desapilar.
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
