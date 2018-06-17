package api;

public interface ABBTDA {
	void InicializarArbol();
	void AgregarElemento(int x);
	void EliminarElemento(int x);
	boolean ArbolVacio();
	int Raiz();
	ABBTDA HijoIzq();
	ABBTDA HijoDer();
}

/*El objeto arbol debe esta creado, y la raiz es null
 *  El objeto nodo, raiz aun esta en null
 *  2- Tengo que en la raiz crear el elemento, ya que es null cuando se inicializa
 *   Pregunto Raiz es null, entonces, agrego en raiz
 *   AgregarElemento (){
 *    if(raiz ==null){ //Si raiz es null, agrego en raiz
 *    	NODOABB raiz = new NodoABB();
 *    	raiz.info = x;
 *   	raiz.HijoDer = new ABB();
 *   	raiz.HijoDer.InicializarArbol();
 *    	raiz.hijoIzq = new ABB();
 *    	raiz.HijoIzq.InicializarArbol();
 *   }else{
 *   
 *   
 *   }
 * 
 * */
