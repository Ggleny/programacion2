package implementaciones.arreglos;

import api.PilaTDA;

public class PilaTI  implements PilaTDA{

	int [] a;
	int indice;
	
	/* (non-Javadoc)
	 * @see api.PilaTDA#InicializarPila()
	 */
	public void InicializarPila() {
		// TODO Auto-generated method stub
		a = new  int[100];
		indice = 0;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Apilar(int)
	 */
	public void Apilar(int x) {
		for(int i= indice -1;i>=0;i--)
			a[i+1] = a[i];
		a[0] = x;
		indice++;
		
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Desapilar()
	 */
	public void Desapilar() {
		for(int i=0;i<indice;i++)
			a[i]=a[i+1];
		indice--;
		
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#PilaVacia()
	 */
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return indice ==0;
	}

	/* (non-Javadoc)
	 * @see api.PilaTDA#Tope()
	 */
	public int Tope() {
		// TODO Auto-generated method stub
		return a[0];
	}
	
}
