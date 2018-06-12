package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Diccionrio Multiple
 * @definition: Coleccion de elementos, los cuales se agrupan segun una clave y un valor.
 * En este caso, a cada clave le corresponden uno o mas valores. Las claves son unicas y solo existen
 * si tienen asociado al menos un valor.
 */
public interface DiccionarioMultipleTDA {

	/**
	 * @#InicializarDiccionario
	 * @Tarea: Inicializar un diccionario.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene un diccionario inicilizado
	 */	
	void InicializarDiccionario();

	/**
	 * @#Agregar
	 * @Tarea: Agregar un valor asociado a una clave del diccionario
	 * @Parametros: Recibe dos enteros: uno con la clave identificatoria y otro con el valor a agregar
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: La clave tiene un valor mas que antes, si ya existia, o el diccionario tiene una 
	 * nueva clave con el valor dado
	 */	
	void Agregar(int clave, int valor);
	
	/**
	 * @#Eliminar
	 * @Tarea: Elimina un elemento del diccionario
	 * @Parametros: Recibe un entero correspondiente a la clave del elemento que se quiere eliminar
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado y la clave debe existir
	 * @Postcondicion: El diccionario tiene un elemento menos que antes
	 */	
	void Eliminar(int clave);

	/**
	 * @#EliminarValor
	 * @Tarea: Eliminar un valor asociado a una clave dada del diccionario
	 * @Parametros: Recibe un entero correspondiente a la clave y un entero correspondiente al valor que se 
	 * quiere eliminar
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: El diccionario tiene un elemento menos que antes si la clave solo poseia un valor; 
	 * si no, la clave tiene un valor menos asociado a ella
	 */	
	void EliminarValor(int clave, int valor);

	/**
	 * @#Recuperar
	 * @Tarea: Devolver todos los valores asociados a una clave
	 * @Parametros: Recibe un entero correspondiente a la clave de los valores que se quiere recuperar
	 * @Devuelve: Si la clave existe devuelve el conjunto; si no, devuelve un conjunto vacio
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: -
	 */	
	ConjuntoTDA Recuperar(int clave);

	/**
	 * @#Claves
	 * @Tarea: Devolver todas las claves en un diccionario
	 * @Parametros: -
	 * @Devuelve: Un conjunto conteniendo todas las claves en el diccionario
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: -
	 */	
	ConjuntoTDA Claves();
	
}
