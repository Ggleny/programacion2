package implementations.listas;

import api.ColaTDA;
import utilities.Nodo;

public class ColaLD implements ColaTDA {
	Nodo primero;
	Nodo ultimo;
	/* (non-Javadoc)
	 * @see api.ColaTDA#InicializarCola()
	 */
	public void InicializarCola() {
		primero = null;
		ultimo = null;
				

	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Acolar()
	 */
	public void Acolar(int valor) {
		Nodo aux = new Nodo();
		aux.siguiente = null;
		aux.info = valor;
		//si hay al menos un elemento
		if(ultimo!=null){
			ultimo.siguiente = aux; //No se entiende
		}
		ultimo = aux;
		//Si no hay primero, hay un solo elemento que es primero y ultimo a la vez.
		if(primero==null) {
			primero = ultimo;
		}


	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Desacolar()
	 */
	public void Desencolar() {
		//Consumo la cola, saco el primero.
		primero = primero.siguiente;
		//Si primer es null, entonces entonces, era el ultimo valor el q se desacolo
		if (primero==null) {
			ultimo = null;
		}

	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#ColaVacia()
	 */
	public boolean ColaVacia() {
		
		return primero==null;
	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Primero()
	 */
	public int Primero() {
		return primero.info;
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		
	}

}
