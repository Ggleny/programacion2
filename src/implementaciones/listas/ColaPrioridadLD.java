package implementaciones.listas;

import api.ColaPrioridadTDA;
import api.NodoConPrioridad;

public class ColaPrioridadLD implements ColaPrioridadTDA {
	NodoConPrioridad mayorPrioridad ;
	
	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#InicializarCola()
	 */
	public void InicializarCola() {
		
	}

	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#AcolarPrioridad()
	 */
	public void AcolarPrioridad(int x, int prioridad) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#Desacolar()
	 */
	public void Desacolar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#ColaVacia()
	 */
	public int Primero() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#ColaVacia()
	 */
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see api.ColaPrioridadTDA#Prioridad()
	 */
	public int Prioridad() {
		return 0;
	}

}
