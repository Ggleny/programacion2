package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Pila
 * @definition: Coleccion de datos tal que el primero en entrar es el ultimo en salir. 
 */
public interface PilaTDA {
	
	/**
	 * @#InicializarPila
	 * @Tarea: Inicializa la pila
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una pila inicilizada
	 */
	void InicializarPila () ;

	/**
	 * @#Apilar
	 * @Tarea: Agrega un elemento a la pila
	 * @Parametros: Se recibe un numero entero a ser agregado en la pila
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada
	 * @Postcondicion: La pila tiene un elemento más que antes
	 */
	void Apilar(int x);


	/**
	 * @#Desapilar
	 * @Tarea: Elimina un elemento de la pila
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada y tener al menos un elemento
	 * @Postcondicion: La pila tiene un elemento menos que antes
	 */
	void Desapilar() ;

	/**
	 * @#PilaVacia
	 * @Tarea: Verifica si la pila tiene elementos o no
	 * @Parametros: -
	 * @Devuelve: Verdadero si la pila no tiene elementos; Falso en caso contrario
	 * @Precondicion: La pila debe estar inicializada
	 * @Postcondicion: -
	 */
	boolean PilaVacia ();

	/**
	 * @#Tope
	 * @Tarea: Devuelve el numero entero que haya sido agregado ultimo a la pila
	 * @Parametros: -
	 * @Devuelve: Un numero entero correspondiente al ultimo elemento agregado a la pila
	 * @Precondicion: La pila debe estar inicializada y no estar vacia
	 * @Postcondicion: -
	 */
	int Tope () ;

	
}