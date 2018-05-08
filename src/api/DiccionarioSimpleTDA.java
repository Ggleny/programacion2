package api;

public interface DiccionarioSimpleTDA {
	/**
	 * @#InicializarDiccionario
	 * @Tarea: permite inicializar la estructura del diccionario
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: El diccionario se encuentra inicializado
	 */
	void InicializarDiccionario ();
	/**
	 * @#Agregar
	 * @Tarea: : dada una clave y un valor, agrega al diccionario el valor quedando asociado a la clave
	 * @Parametros: Se recibe una clave que será agregado en el diccionario
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: El diccionario tiene un elemento más.
	 */
	void Agregar(int clave,int valor);
	
	/**
	 * @#Eliminar
	 * @Tarea: dada una clave elimina el valor asociado a la clave
	 * @Parametros: Se recibe una clave
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado.
	 * @Postcondicion: El diccionario tiene un elemento menos.
	 */
	void Eliminar( int clave);
	/**
	 * @#Recuperar
	 * @Tarea: dada una clave devuelve el valor asociado a la clave
	 * @Parametros: Se recibe una clave
	 * @Devuelve: valor asociado a la clave.
	 * @Precondicion: El diccionario debe estar inicializado y la clave debe existir en el diccionario
	 * @Postcondicion: -
	 */
	int Recuperar( int clave);
	
	/**
	 * @#Claves
	 * @Tarea: Coonjunto de claves pertenecientes al diccionario
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado.
	 * @Postcondicion: -
	 */
	ConjuntoTDA Claves();
}
