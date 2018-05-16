package implementations.listas;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class DicSimpleL implements DiccionarioSimpleTDA {

	class NodoClave {
		int clave;
		int valor;
		NodoClave siguiente;
	}
	NodoClave origen;
	public void InicializarDiccionario() {
		origen = null;

	}

	
	public void Agregar(int clave, int valor) {
		NodoClave nodoClave = Clave2NodoClave(clave);
		if(nodoClave==null){
			nodoClave = new NodoClave();
			nodoClave.clave = clave;
			nodoClave.siguiente = origen;
			//Origen ultimo elemento agregado. 
			origen = nodoClave;
		}
		nodoClave.valor = valor;

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

	public void Eliminar(int clave) {
		//Si la lista no esta vacia
		if(origen!=null){
			//Si el ultimo elemento agegado es el buscado 
			if(origen.clave == clave){
				//Elimino la cabeza de la lista, y lo desliso uno a la izquierda
				origen = origen.siguiente;
			}else{
				//BUSCO
				//Inicio por el origen(donde el origen no es la clave buscada)
				//Y del origen verifico que su siguiente que es otro nodoClave, tenga esa clave, e itera mientras no la encuentre.
				NodoClave auxiliar = origen;
				while( auxiliar!=null && auxiliar.siguiente.clave!=clave ){
					auxiliar = auxiliar.siguiente;
				}
			}
		}

	}

	@Override
	public int Recuperar(int clave) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ConjuntoTDA Claves() {
		// TODO Auto-generated method stub
		return null;
	}

}
