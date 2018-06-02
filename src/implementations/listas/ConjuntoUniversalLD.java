package implementations.listas;

import api.ConjuntoTDA;
import utilities.Nodo;

public class ConjuntoUniversalLD implements ConjuntoTDA {
	public class NodoUniversal {
		public boolean activo;
		public int clave;
		public NodoUniversal siguiente;
	}
		NodoUniversal conjunto;
		int cantidad;
		int tamanio = 100;
		
		/* (non-Javadoc)
		 * @see api.ConjuntoTDA#InicializarConjunto()
		 */
		public void Inicializar() {
			conjunto = null;
			cantidad = 0;
			int i = 0;
			while(i<tamanio) {
				this.CrearNodo(i+1,false);
				i++;
			}
		}

		/* (non-Javadoc)
		 * @see api.ConjuntoTDA#ConjuntoVacio()
		 */
		public boolean ConjuntoVacio() {
			return cantidad == 0;
		}

		
		public void Agregar(int elemento) {
			if(!this.Pertenece(elemento) && this.ElementoValido(elemento)) {
				this.SeleccionarNodo(elemento).activo=true;
				cantidad++;
			}
		}

		
		public int Elegir() {
			if(!this.ConjuntoVacio()) {
				NodoUniversal auxiliar = conjunto;
				while((auxiliar != null) && (auxiliar.activo != true))
					auxiliar=auxiliar.siguiente;
				return auxiliar.clave;
			}else {
				return 0;
			}
		}

		
		public void Sacar(int elemento) {
			if(this.Pertenece(elemento)) {
				this.SeleccionarNodo(elemento).activo=false;
				cantidad--;
			}
		}

		public boolean Pertenece(int elemento) {
			//System.out.println("pertenece "+elemento+" "+this.ElementoValido(elemento));
			if(this.ElementoValido(elemento)) {
				return SeleccionarNodo(elemento).activo;
			}else {
				//No pertenece porque no es un elemento valido
				return false;
			}
		}
		
		private void CrearNodo(int clave,boolean activo) {
			NodoUniversal auxiliar = new NodoUniversal();
			auxiliar.clave = clave;
			auxiliar.activo = activo;
			auxiliar.siguiente = conjunto;
			conjunto = auxiliar;
		}
		private NodoUniversal SeleccionarNodo(int elemento) {
			int clave = elemento;
			NodoUniversal auxiliar = conjunto;
			while((auxiliar != null) && (auxiliar.clave != clave)) {
				auxiliar=auxiliar.siguiente;
			}
			return auxiliar;
		}
		
		private boolean ElementoValido(int elemento) {
			return (elemento>0 && elemento<=tamanio);
		}
		
}
