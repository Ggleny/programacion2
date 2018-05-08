package implementations.listas;

import api.PilaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Pila, utilizando arreglos, de forma tal que el tope siempre 
 * se encontrara al principio del arreglo. Resulta mas costoso tanto apilar como desapilar.
 */
public class PilaTI implements PilaTDA {

	int[] vector;
	int cantidad;
	
	public void InicializarPila() {
		vector = new int [100];
		cantidad = 0;
	}

	public void Apilar(int x) {		
		for(int i = cantidad; i>0;i--)
			vector[i]=vector[i-1];
		vector[0]=x;
		cantidad++;
	}

	public void Desapilar() {
		for(int i = 0; i<cantidad;i++)
			vector[i]=vector[i+1];
		cantidad--;
	}

	public boolean PilaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Tope() {
		return vector[0];
	}

}
