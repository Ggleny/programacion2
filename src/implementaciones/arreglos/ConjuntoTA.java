package implementaciones.arreglos;

import api.ConjuntoTDA;

public class ConjuntoTA implements ConjuntoTDA{
	int [] array;
	int cantidad;
	
	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#InicializarConjunto()
	 */
	public void Inicializar() {
		array = new int[100];
		cantidad = 0;
		
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#ConjuntoVacio()
	 */
	public boolean ConjuntoVacio() {
		return cantidad == 0;
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Agregar()
	 */
	public void Agregar(int elemento) {
		if(!this.Pertenece(elemento)) {
			array[cantidad] = elemento;
			cantidad++;
		}
		
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Elegir()
	 */
	public int Elegir() {
		return array[cantidad-1];
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Sacar()
	 */
	public void Sacar(int elemento) {
		boolean pertenece = false;
		int pos = 0;
		while(pos<cantidad && !pertenece) {
			if(array[pos]==elemento)
				pertenece = true;
			else
				pos++;
		}
		if(pertenece && pos < cantidad) {
			// array[cantidad] queda con basura. 
			cantidad --;
			while(pos<cantidad) {
				array[pos] = array[pos+1];
				pos++;
			}
			
		}//Sino pertenece entonces no hago nada.
		
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Pertenece()
	 */
	public boolean Pertenece(int elemento) {
		boolean pertenece = false;
		int pos = 0;
		while(pos<cantidad && !pertenece) {
			if(array[pos]==elemento)
				pertenece = true;
			pos++;
		}
		return pertenece;
	}

}
