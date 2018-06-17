package implementations.arreglos;

import api.PilaTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarPila: constante
 * Apilar: lineal
 * Desapilar: lineal
 * PilaVacia: constante
 * Tope: constante
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
		cantidad--;
		for(int i = 0; i<cantidad;i++)
			vector[i]=vector[i+1];
	}

	public boolean PilaVacia() {
		return (cantidad==0)?true:false;
	}

	public int Tope() {
		return vector[0];
	}

}
