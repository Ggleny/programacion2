package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Arbol Binario 
 * @definition: Implementacion de arbol en el cual cada nodo puede tener como mucho dos hijos.
 */

public interface ABBTDA {

	/**
	 * @#InicializarArbol
	 * @Tarea: Inicializar un arbol binario.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una arbol inicilizado
	 */
	void InicializarArbol();
	
	/**
	 * @#AgregarElemento
	 * @Tarea: Agrega un elemento al arbol.
	 * @Parametros: Un elemento a agregar en el arbol
	 * @Devuelve: -
	 * @Precondicion: El arbol debe estar inicializado.
	 * @Postcondicion: Se tiene un arbol con un elemento mas que antes
	 */
	void AgregarElemento(int x);
	
	/**
	 * @#EliminarElemento
	 * @Tarea: Elimina un elemento del arbol.
	 * @Parametros: Un elemento a eliminar.
	 * @Devuelve: -
	 * @Precondicion: El arbol tiene que estar inicializado.
	 * @Postcondicion: Se tiene un arbol con un elemento menos
	 */
	void EliminarElemento(int x);
	
	/**
	 * @#ArbolVacio
	 * @Tarea: Verificar si el arbol tiene elementos.
	 * @Parametros: -
	 * @Devuelve: Verdadero si no tiene elementos; Falso en caso contrario
	 * @Precondicion: El arbol debe estar inicializado
	 * @Postcondicion: -
	 */
	boolean ArbolVacio();
	
	/**
	 * @#Raiz
	 * @Tarea: Recupero el valor que se encuentra en la raiz.
	 * @Parametros: -
	 * @Devuelve: Un elemento correspondiente al valor de la raiz.
	 * @Precondicion: El arbol debe estar inicializado y poseer al menos un elemento.
	 * @Postcondicion: -
	 */
	int Raiz();
	
	/**
	 * @#HijoIzq
	 * @Tarea: Devuelve el subarbol izquierdo de una raiz
	 * @Parametros: -
	 * @Devuelve: la rama izquierda de un arbol.
	 * @Precondicion: El arbol debe estar inicializado y poseer al menos un elemento.
	 * @Postcondicion: -
	 */
	ABBTDA HijoIzq();
	
	/**
	 * @#HijoDer
	 * @Tarea: Devuelve el subarbol Derecho de una raiz
	 * @Parametros: -
	 * @Devuelve: la rama derecha de un arbol.
	 * @Precondicion: El arbol debe estar inicializado y poseer al menos un elemento.
	 * @Postcondicion: -
	 */
	ABBTDA HijoDer();
}