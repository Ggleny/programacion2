package implementaciones.arreglos;

import api.PilaTDA;


/**
 * @author Grupo N
 *
 */
public class PilaTF implements PilaTDA {
	int [] a;
	int indice;

	/* (non-Javadoc)
	 * @see api.PilaTDA#InicializarPila()
	 */
	public void InicializarPila() {
		// TODO Auto-generated method stub
		a = new int[100];
		indice = 0;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Apilar(int)
	 */
	public void Apilar(int x) {
		// TODO Auto-generated method stub
		a[indice] = x;
		indice++;
	

	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Desapilar()
	 */
	public void Desapilar() {
		// TODO Auto-generated method stub
		indice--;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#PilaVacia()
	 */
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return indice == 0;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Tope()
	 */
	public int Tope() {
		// TODO Auto-generated method stub
		return a[indice-1];
	}

}
