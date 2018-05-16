package implementations.listas;

import api.ConjuntoTDA;
import utilities.Nodo;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Conjunto utilizando estructuras dinamicas.
 */

public class ConjuntoLD implements ConjuntoTDA {
	Nodo conjunto;
	
	public void Inicializar() {
		conjunto = null;
	}

	public void Agregar(int x) {
		if (!this.Pertenece(x)){
			Nodo auxiliar = new Nodo();
			auxiliar.info = x;
			auxiliar.siguiente = conjunto;
			conjunto = auxiliar;
		}
	}

	
	public void Sacar(int x) {
		if (conjunto != null){
			if (conjunto.info == x){
				conjunto = conjunto.siguiente;
		    }
		    else{
			    Nodo auxiliar = conjunto;
			    while ((auxiliar.siguiente != null) && (auxiliar.siguiente.info != x))
				     auxiliar = auxiliar.siguiente;
			    if (auxiliar.siguiente != null)
				     auxiliar.siguiente = auxiliar.siguiente.siguiente;
		   }
		}
	}
	
	public int Elegir() {
		return conjunto.info;
	}
	
	public boolean Pertenece(int x) {
		Nodo auxiliar = conjunto;
		while((auxiliar != null) && (auxiliar.info != x))
			auxiliar=auxiliar.siguiente;
		return (auxiliar != null);
	}
	
	public boolean ConjuntoVacio() {
		return ( conjunto == null );
	}

}
