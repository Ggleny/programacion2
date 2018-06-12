package implementations.listas;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarDiccionario: constante
 * Agregar: lineal
 * Eliminar: lineal
 * Recuperar: lineal
 * Claves: lineal
 */
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
			origen = nodoClave;
		}
		nodoClave.valor = valor;
	}
	
	private NodoClave Clave2NodoClave(int clave){
		NodoClave auxiliar = origen;
		while( auxiliar!=null && auxiliar.clave!=clave){
			auxiliar = auxiliar.siguiente;
		}
		return auxiliar;
	} 

	public void Eliminar(int clave) {
		if(origen!=null){
			if(origen.clave == clave){
				origen = origen.siguiente;
			}else{
				NodoClave auxiliar = origen;
				while( auxiliar!=null && auxiliar.siguiente.clave!=clave ){
					auxiliar = auxiliar.siguiente;
				}
			}
		}
	}

	public int Recuperar(int clave) {
		NodoClave nodo = Clave2NodoClave(clave);
		return nodo.valor;
	}

	public ConjuntoTDA Claves() {
		ConjuntoTDA conj = new ConjuntoLD();
		conj.Inicializar();
		NodoClave nodoaux = origen;
		while (nodoaux != null){
			conj.Agregar(nodoaux.clave);
			nodoaux = nodoaux.siguiente;
		}
		return conj;
	}

}
