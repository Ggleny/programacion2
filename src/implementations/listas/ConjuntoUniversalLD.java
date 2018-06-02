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
				this.CrearNodo(i,false);
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
			}
		}

		
		public int Elegir() {
			NodoUniversal auxiliar = new NodoUniversal();
			while((auxiliar != null) && (auxiliar.activo != true))
				auxiliar=auxiliar.siguiente;
			return auxiliar.clave+1;
		}

		
		public void Sacar(int elemento) {
			if(this.Pertenece(elemento)) {
				this.SeleccionarNodo(elemento).activo=false;
			}
		}

		public boolean Pertenece(int elemento) {
			int clave = elemento -1;
			if(this.ElementoValido(clave)) {
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
			int clave = elemento-1;
			NodoUniversal auxiliar = new NodoUniversal();
			while((auxiliar != null) && (auxiliar.clave != clave))
				auxiliar=auxiliar.siguiente;
			return auxiliar;
		}
		/*private NodoUniversal SeleccionarActivo() {
			NodoUniversal auxiliar = new NodoUniversal();
			while((auxiliar != null) && (auxiliar.activo != true))
				auxiliar=auxiliar.siguiente;
			return auxiliar;
		}*/
		private boolean ElementoValido(int elemento) {
			return (elemento>0 && elemento<=tamanio);
		}
		
}
