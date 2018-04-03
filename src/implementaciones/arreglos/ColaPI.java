package implementaciones.arreglos;

import api.ColaTDA;

/**
 * @author Grupo N
 * ColaPI significa que el primero es el primero.
 */
public class ColaPI implements ColaTDA {
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
			//ACOLO AL FINAL
			a[indice] = x;
			indice++;
		}

		/* (non-Javadoc)
		 * @see api.ColaTDA#Desencolar()
		 */
		public void Desencolar() {
			for(int i=0;i<indice-1;i++) {
				a[i] = a[i+1];
			}
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
			return a[0];
		}

}
