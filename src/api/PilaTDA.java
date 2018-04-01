package api;

public interface PilaTDA {
	/**
	 * @#InicializarPila
	 * @Tarea: crea un vector de 100 enteros y setea la cantidad de elementos a 0
	 * @Parametros: 
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una pila inicilizada
	 */
	void InicializarPila();
	

	/**
	 * @#Apilar
	 * @Tarea: Agrega un numero entero a la pila
	 * @Parametros: Se recibe un numero entero que será agregado en la pila
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada
	 * @Postcondicion: La pila tiene un elemento más que antes
	 */
	
	void Apilar(int x);
	
	/**
	 * @#Desapilar
	 * @Tarea: Elimina un numero entero de la pila
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada y tener al menos un elemento
	 * @Postcondicion: La pila tiene un elemento menos que antes
	 */
	void Desapilar();
	
	/**
	 * @#PilaVacia
	 * @Tarea: Verifica si la pila tiene elementos o no
	 * @Parametros: -
	 * @Devuelve: Verdadero si la pila no tiene elementos; Falso en caso contrario
	 * @Precondicion: La pila debe estar inicializada
	 * @Postcondicion: -
	 */
	boolean PilaVacia();
	
	/**
	 * @#Tope
	 * @Tarea: Devuelve el numero entero que haya sido agregado ultimo a la pila
	 * @Parametros: -
	 * @Devuelve: Un numero entero correspondiente al ultimo elemento agregado a la pila
	 * @Precondicion: La pila debe estar inicializada y no estar vacia
	 * @Postcondicion: -
	 */
	int Tope ();
}
