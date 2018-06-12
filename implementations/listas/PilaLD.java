package implementations.listas;

import api.PilaTDA;
import utilities.Nodo;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarPila: constante
 * Apilar: constante
 * Desapilar: costante
 * PilaVacia: constante
 * Tope: constante
 */
public class PilaLD implements PilaTDA {
	
	Nodo primero;

	public void InicializarPila() {
		primero = null;

	}

	public void Apilar(int valor) {
		Nodo aux = new Nodo();
		aux.info = valor;
		aux.siguiente = primero;
		primero  = aux;
	}
	
	public void Desapilar() {
		primero = primero.siguiente;
	}
	
	public boolean PilaVacia() {
		return primero==null;
	}

	public int Tope() {
		return primero.info;
	}

}
