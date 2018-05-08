package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Coleccion de datos tal que el primero en entrar es el primero en salir
 */
public interface ColaTDA {

	/**
	 * @#InicializarCola
	 * @Tarea: Inicializar una cola
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una cola inicilizada
	 */	
	void InicializarCola();

	/**
	 * @#Acolar
	 * @Tarea: Agrega un elemento a la cola
	 * @Parametros: Se recibe un numero entero a ser agregado en la cola
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada
	 * @Postcondicion: La cola tiene un elemento más que antes
	 */
	 void Acolar( int x);

	/**
	 * @#Desacolar
	 * @Tarea: Elimina un elemento de la cola
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada y tener al menos un elemento
	 * @Postcondicion: La cola tiene un elemento menos que antes
	 */
	 void Desacolar();

	/**
	 * @#ColaVacia
	 * @Tarea: Verifica si la cola tiene elementos o no
	 * @Parametros: -
	 * @Devuelve: Verdadero si la cola no tiene elementos; Falso en caso contrario
	 * @Precondicion: La cola debe estar inicializada
	 * @Postcondicion: -
	 */
	 boolean ColaVacia();

	/**
	 * @#Primero
	 * @Tarea: Devuelve el numero entero que se encuentre en la 1er posicion de la cola
	 * @Parametros: -
	 * @Devuelve: Un numero entero correspondiente al primer elemento de la cola
	 * @Precondicion: La cola debe estar inicializada y no estar vacia
	 * @Postcondicion: -
	 */
	int Primero();

}
