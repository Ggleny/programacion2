package implementaciones.arreglos;

import api.ColaTDA;

/**
 * @author Grupo N
 * ColaPU significa que el primero es el ultimo.
 */
public class ColaPU implements ColaTDA {
	
	int [] a;
	int indice;
	/* (non-Javadoc)
	 * @see api.ColaTDA#InicializarPila()
	 */
	public void InicializarCola() {
		a = new int[100];
		indice =0;
	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Acolar()
	 */
	public void Acolar(int x) {
		for(int i= indice - 1; i>=0;i--)
				a[i+1]=  a[i];
		a[0] = x; //El primero es el ultimo de la cola
		indice++;
	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Desencolar()
	 */
	public void Desacolar() {
		indice--;
	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#ColaVacia()
	 */
	public boolean ColaVacia() {
		return indice ==0;
	}

	/* (non-Javadoc)
	 * @see api.ColaTDA#Primero()
	 */
	public int Primero() {
		return a[indice-1];
	}

}
