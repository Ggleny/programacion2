package implementations.listas;

import api.PilaTDA;
import utilities.Nodo;

public class PilaLD implements PilaTDA {
	
	Nodo primero;
	/* (non-Javadoc)
	 * @see api.PilaTDA#InicializarPila()
	 */
	public void InicializarPila() {
		primero = null;

	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Apilar(int)
	 */
	public void Apilar(int valor) {
		Nodo aux = new Nodo();
		aux.info = valor;
		aux.siguiente = primero;
		primero  = aux;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Desapilar()
	 */
	public void Desapilar() {
		primero = primero.siguiente;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#PilaVacia()
	 */
	public boolean PilaVacia() {
		return primero==null;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Tope()
	 */
	public int Tope() {
		return primero.info;
	}

}
