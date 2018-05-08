package api;

public interface ColaTDA {
	/**
	 * @#InicializarCola
	 * @Tarea: crea un vector de enteros
	 * @Parametros: 
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una cola inicilizada
	 */
	void InicializarCola();
	/**
	 * @#Acolar
	 * @Tarea:permite agregar un elemento a la cola.
	 * @Parametros: Se recibe un numero entero que será agregado en la cola
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada
	 * @Postcondicion: La cola tiene un elemento más que antes
	 */
	void Acolar(int x);
	
	/**
	 * @#Desacolar
	 * @Tarea: Elimina un numero entero de la cola
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada y tener al menos un elemento
	 * @Postcondicion: La cola tiene un elemento menos que antes
	 */
	void Desencolar();
	
	/**
	 * @#colaVacia
	 * @Tarea: Verifica si la cola tiene elementos o no
	 * @Parametros: -
	 * @Devuelve: Verdadero si la cola no tiene elementos; Falso en caso contrario
	 * @Precondicion: La cola debe estar inicializada
	 * @Postcondicion: -
	 */
	boolean ColaVacia();
	/**
	 * @#Primero
	 * @Tarea: Devuelve el numero entero que haya sido agregado primero a la cola
	 * @Parametros: -
	 * @Devuelve: Un numero entero correspondiente al primer elemento agregado a la cola
	 * @Precondicion: La cola debe estar inicializada y no estar vacia
	 * @Postcondicion: -
	 */
	int Primero();

}
