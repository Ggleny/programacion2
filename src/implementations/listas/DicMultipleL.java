package implementations.listas;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;


/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarDiccionario: constante
 * Agregar: lineal
 * Eliminar: lineal
 * EliminarValor: lineal
 * Recuperar: lineal
 * Claves: lineal
 */
public class DicMultipleL implements DiccionarioMultipleTDA {
	
	class NodoClave {
		int clave;
		NodoValor valores;
		NodoClave siguienteclave;
	}
	
	class NodoValor {
		int valor;
		NodoValor siguientevalor;
	}
		
	NodoClave origen;

	public void InicializarDiccionario() {
		origen = null;
	}
	
	public void Agregar(int clave, int nuevovalor) {
		NodoClave nodclave = Clave2NodoClave(clave);
		if (nodclave == null){
			nodclave = new NodoClave();
			nodclave.clave=clave;
			nodclave.siguienteclave=origen;
			origen = nodclave;
		}
		NodoValor aux = nodclave.valores;
		while ((aux!=null)&&(aux.valor!=nuevovalor))
			aux = aux.siguientevalor;
		if (aux==null){
			NodoValor nodvalor = new NodoValor();
			nodvalor.valor = nuevovalor;
			nodvalor.siguientevalor = nodclave.valores;
			nodclave.valores=nodvalor;
		}
	}
	
	private NodoClave Clave2NodoClave(int clave){
		NodoClave auxiliar = origen;
		while( auxiliar!=null && auxiliar.clave!=clave){
			auxiliar = auxiliar.siguienteclave;
		}
		return auxiliar;
	}
	
	public void Eliminar(int clave) {
		if (origen != null){
			if (origen.clave == clave){
				origen = origen.siguienteclave;
			}else{
				NodoClave auxiliar = origen;
				while ( (auxiliar.siguienteclave!= null) && (auxiliar.siguienteclave.clave != clave)){
					auxiliar = auxiliar.siguienteclave;
				}
				if (auxiliar.siguienteclave != null)
					auxiliar.siguienteclave = auxiliar.siguienteclave.siguienteclave;
			}
		}
	}
	
	public void EliminarValor(int clave, int valor) {
		if (origen != null){
			if (origen.clave == clave){
				EliminarValorEnNodo (origen, valor);
				if (origen.valores == null){
					origen = origen.siguienteclave;
				}
			}
		}else{
			NodoClave auxiliar = origen;
			while ((auxiliar.siguienteclave != null) && (auxiliar.siguienteclave.clave != clave))
				auxiliar = auxiliar.siguienteclave;
			if (auxiliar.siguienteclave != null){
				EliminarValorEnNodo (auxiliar.siguienteclave, valor);
				if ( auxiliar.siguienteclave.valores == null)
					auxiliar.siguienteclave= auxiliar.siguienteclave.siguienteclave;
			}
		}
	}
	
	private void EliminarValorEnNodo(NodoClave nodo, int valor){
		if (nodo.valores != null){
			if (nodo.valores.valor == valor)
				nodo.valores = nodo.valores.siguientevalor;
		}else{
			NodoValor auxiliar = nodo.valores;
			while ((auxiliar.siguientevalor != null) && (auxiliar.siguientevalor.valor != valor))
				auxiliar = auxiliar.siguientevalor;
			if (auxiliar.siguientevalor!=null)
				auxiliar.siguientevalor = auxiliar.siguientevalor.siguientevalor;
		}
	}
	
	public ConjuntoTDA Recuperar(int clave) {
		NodoClave nodclave = Clave2NodoClave(clave);
		ConjuntoTDA conjunto = new ConjuntoLD();
		conjunto.Inicializar();
		if (nodclave != null){
			NodoValor auxiliar = nodclave.valores;
			while (auxiliar != null){
				conjunto.Agregar(auxiliar.valor);
				auxiliar = auxiliar.siguientevalor;
			}
		}
		return conjunto;
	}
	
	public ConjuntoTDA Claves() {
		ConjuntoTDA conjunto = new ConjuntoLD();
		conjunto.Inicializar();
		NodoClave auxiliar = origen;
		while ( auxiliar != null){
			conjunto.Agregar(auxiliar.clave);
			auxiliar=auxiliar.siguienteclave;
		}
		return conjunto;
	}

}
