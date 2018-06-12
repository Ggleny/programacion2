package implementations.listas;

import api.ABBTDA;
import utilities.NodoABB;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost: N/A
 */
public class ABB implements ABBTDA {
	NodoABB raiz;
	
	public void InicializarArbol() {
		raiz = null;
	}

	public void AgregarElemento(int x) {
		if(raiz ==null){
			raiz = new NodoABB();
			raiz.info = x;
			//ABB en los hijos porque cada hijo a la ves es un arbol o podria ser uno
			raiz.HijoDer = new ABB();
			raiz.HijoDer.InicializarArbol();
			raiz.HijoIzq = new ABB();
			raiz.HijoIzq.InicializarArbol();
		}else if(raiz.info > x ){
			raiz.HijoIzq.AgregarElemento(x);
		}else{
			raiz.HijoDer.AgregarElemento(x);
		}

	}
	
	public void EliminarElemento(int x) {
		if(raiz!=null){
			//El siguiente if es verdadero si solo se agrego un elemento o si solo hay uno solo y es arbol. 
			if(raiz.info==x && raiz.HijoIzq.ArbolVacio() && raiz.HijoDer.ArbolVacio()){
				raiz = null; // Porque elimine el unico valor que habia
			}else if (raiz.info == x && !raiz.HijoIzq.ArbolVacio()){ //Encontre en la raiz el valor pero tiene un hijoIzquierdo.
				
			}
		}
	}

	public boolean ArbolVacio() {
		return raiz ==null ;
	}
	
	public int Raiz() {
		return raiz.info;
	}
	
	public ABBTDA HijoIzq() {
		return raiz.HijoIzq;
	}
	
	public ABBTDA HijoDer() {
		return raiz.HijoDer;
	}
	
}
