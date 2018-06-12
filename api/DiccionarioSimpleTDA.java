package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Diccionrio Simple
 * @definition: Coleccion de elementos, los cuales se agrupan segun una clave y un valor.
 * Las claves deben ser unicas.
 */
public interface DiccionarioSimpleTDA {

	/**
	 * @#InicializarDiccionario
	 * @Tarea: Inicializa un Diccionario.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene un diccionario inicilizado
	 */	
	void InicializarDiccionario();

	/**
	 * @#Agregar
	 * @Tarea: Agrega un elemento al diccionario si éste no existe, o lo modifica si ya existe
	 * @Parametros: Recibe dos elementos: uno con la clave identificatoria y otro con el valor correspondiente
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: El diccionario tiene un elemento mas que antes
	 */	
	void Agregar(int clave, int valor);
	
	/**
	 * @#Eliminar
	 * @Tarea: Elimina un elemento del diccionario
	 * @Parametros: Recibe un elemento correspondiente a la clave del elemento que se quiere eliminar
	 * @Devuelve: -
	 * @Precondicion: El diccionario debe estar inicializado y tener, al menos, un elemento
	 * @Postcondicion: El diccionario tiene un elemento menos que antes
	 */	
	void Eliminar(int clave);

	/**
	 * @#Recuperar
	 * @Tarea: Devuelve el valor asociado a una clave dada
	 * @Parametros: Recibe un entero correspondiente a la clave del elemento que se quiere recuperar
	 * @Devuelve: Un entero correspondiente al valor asociado a la clave buscada
	 * @Precondicion: El diccionario debe estar inicializado y la clave debe existir dentro de éste
	 * @Postcondicion: -
	 */	
	int Recuperar(int clave);

	/**
	 * @#Claves
	 * @Tarea: Devuelve un conjunto con todas las claves en un diccionario
	 * @Parametros: -
	 * @Devuelve: Un conjunto conteniendo todas las claves en el diccionario
	 * @Precondicion: El diccionario debe estar inicializado
	 * @Postcondicion: -
	 */	
	ConjuntoTDA Claves();

}
