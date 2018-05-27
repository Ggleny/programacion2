package implementaciones.arreglos;

import api.ConjuntoTDA;

public class ConjuntoUniversal implements ConjuntoTDA {
	int [] array;
	int cantidad;
	int tamanio = 100;
	
	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#InicializarConjunto()
	 */
	public void Inicializar() {
		int i = 0;
		array = new int[tamanio];
		while(i<tamanio) {
			array[i] = 0;
			i++;
		}
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
		if(!this.Pertenece(elemento) && this.ElementoValido(elemento)) {
			array[elemento-1] = 1;
			cantidad++;
		}
		
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Elegir()
	 */
	public int Elegir() {
		if(!this.ConjuntoVacio()) {
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Sacar()
	 */
	public void Sacar(int elemento) {
		if(this.Pertenece(elemento)) {
			array[elemento-1] = 0;
		}
	}

	/* (non-Javadoc)
	 * @see api.ConjuntoTDA#Pertenece()
	 */
	public boolean Pertenece(int elemento) {
		return (array[elemento-1]==1 && this.ElementoValido(elemento));
	}
	
	boolean ElementoValido(int elemento) {
		return (elemento<=tamanio);
	}
	
	/*int BuscarActivo(int inicio){
		if(array[inicio]) {
			return array[inicio] 
		}else {
			if(incio<cantidad) {
				BuscarAc
			}else
				return 0;
		}
	}*/

}