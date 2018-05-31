package implementations.listas;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import implementations.listas.DicSimpleL.NodoClave;

public class DicMultipleL implements DiccionarioMultipleTDA {

	class NodoClave {
		int clave;
		NodoValor valores;
		NodoClave siguiente;
	}
	class NodoValor {
		int valor;
		NodoValor siguienteValor;
	}
	NodoClave origen;
	
	public void InicializarDiccionario() {
		origen = null;
	}
	
	//Declaro funcion privada para obtener el nodo que corresponda a la clave;
	private NodoClave Clave2NodoClave( int clave){
		NodoClave auxiliar = origen;
		// iterar mientras haya algun elemento(auxiliar!=null) 
		//( si es auxiliar es null, es porque origen es null, por ende no hay elementos)
		// e itera mientras no se haya encontrado la clave buscada, si se encontro el nodo con esa clave termina iteracion
		while( auxiliar!=null && auxiliar.clave!=clave){
			auxiliar = auxiliar.siguiente;
		}
		return auxiliar;
	}
	@Override
	public void Agregar(int clave, int valor) {
		NodoClave nodoConClave = Clave2NodoClave ( clave );
		if(nodoConClave==null) { // Es porque no existe el nodo con esa clave asociada.
			nodoConClave = new NodoClave();
			nodoConClave.clave = clave;
			nodoConClave.siguiente = origen;
			origen = nodoConClave;
		}
		NodoValor auxiliarValores = nodoConClave.valores;
		//Verifico que el valor no exista asi lo agrego.
		while ( auxiliarValores != null && auxiliarValores.valor!= valor) {
			auxiliarValores = auxiliarValores.siguienteValor;
		}
		//Si el valor no existe entonces 
		if(auxiliarValores==null) { // Si no tiene ningun valor
			NodoValor nuevoValor = new NodoValor();
			nuevoValor.valor = valor;
			nuevoValor.siguienteValor = nodoConClave.valores;
			nodoConClave.valores = nuevoValor;
		}
		
	}

	private void EliminarValorEnNodo ( NodoClave nodo , int valor) {
		if( nodo.valores!= null) {
			if( nodo.valores.valor == valor){
				nodo.valores = nodo.valores.siguienteValor;
			}else{
				NodoValor aux = nodo.valores;
				while( aux.siguienteValor!= null && aux.siguienteValor.valor!= valor) {
					aux = aux.siguienteValor;
				}
				if( aux.siguienteValor!= null ) {
					aux.siguienteValor= aux.siguienteValor.siguienteValor;
				}
			}
		}
	}
	
	public void EliminarValor(int clave, int valor) {
		if(origen!=null) {
			if(origen.clave == clave) {
				EliminarValorEnNodo(origen,valor);
			}
		}

	}
	public void Eliminar(int clave) {
		if(origen!=null) {
			if(origen.clave == clave) {
				origen = origen.siguiente;
			}
		}else {
			NodoClave aux = origen;
			while(aux.siguiente!=null && aux.siguiente.clave != clave) {
				aux = aux.siguiente;
			}
			// Si aux no es null osea que se encontro
			if(aux!=null) {
				//Siempre existe el siguiente de siguiente ? 
				aux.siguiente = aux.siguiente.siguiente;
			}
			
		}
	}

	


	@Override
	public ConjuntoTDA Recuperar(int clave) {
		NodoClave nodo = Clave2NodoClave(clave);
		ConjuntoTDA conjuntoClaves = new ConjuntoLD();
		return conjuntoClaves;
	}

	@Override
	public ConjuntoTDA Claves() {
		// TODO Auto-generated method stub
		return null;
	}

}
