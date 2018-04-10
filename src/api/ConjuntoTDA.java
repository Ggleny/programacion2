package api;

public interface ConjuntoTDA {
	/**
	 * @#InicializarConjunto
	 * @Tarea: permite inicializar la estructura del conjunto
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: El conjunto se encuentra inicializado
	 */
	void InicializarConjunto ();
	
	/**
	 * @#ConjuntoVacio
	 * @Tarea: indica si el conjunto contiene elementos o no.
	 * @Parametros: -
	 * @Devuelve: Verdadero si el conjunto no tiene elementos; Falso en caso contrario
	 * @Precondicion: El conjunto debe  estar inicializado
	 * @Postcondicion: -
	 */
	boolean ConjuntoVacio() ;
	
	/**
	 * @#Agregar
	 * @Tarea: Permite agregar un elemento al conjunto
	 * @Parametros: Se recibe un  entero que será agregado en el conjunto
	 * @Devuelve: -
	 * @Precondicion: El conjunto debe estar inicializado
	 * @Postcondicion: El conjunto tiene un elemento más que antes
	 */
	void Agregar( int x);
	
	/**
	 * @#Elegir
	 * @Tarea: devuelve un elemento cualquiera del conjunto.
	 * @Parametros: -
	 * @Devuelve: Un elemento cualquiera del conjunto.
	 * @Precondicion: El conjunto debe estar inicializado y no debe ser vacio.
	 * @Postcondicion: -
	 */
	int Elegir();
	
	/**
	 * @#Sacar
	 * @Tarea: permite eliminar del conjunto un elemento dado.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: El conjunto debe estar inicializado y no debe ser vacio.
	 * @Postcondicion: -
	 */
	void Sacar( int x);
	/**
	 * @#Pertenece
	 * @Tarea:  permite conocer si un elemento dado se encuentra en el conjunto.
	 * @Parametros: Se recibe un entero
	 * @Devuelve: Un Booleano que indica si se encuentra el elemento en el conjunto.
	 * @Precondicion: El conjunto debe estar inicializado.
	 * @Postcondicion: -
	 */
	boolean Pertenece( int x);
}
