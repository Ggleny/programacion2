package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Cola con Prioridad
 * @definition: Coleccion de datos tal que el primero en entrar es el primero en salir, salvo
 * cuando algun elemento tenga prioridad sobre otro.
 */
public interface ColaPrioridadTDA {

	/**
	 * @#InicializarCola
	 * @Tarea: Inicializar una cola con prioridad.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una cola inicilizada
	 */	
	void InicializarCola();

	/**
	 * @#AcolarPrioridad
	 * @Tarea: Agrega un elemento a la cola, dependiendo de su prioridad
	 * @Parametros: Se recibe un numero entero a ser agregado en la cola asi como tambien la prioridad 
	 * que le corresponde
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada
	 * @Postcondicion: La cola tiene un elemento mas que antes
	 */
	 void AcolarPrioridad( int x, int prioridad);

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

	/**
	 * @#Prioridad
	 * @Tarea: Permite conocer la prioridad del primer elemento en la cola
	 * @Parametros: -
	 * @Devuelve: Un numero entero correspondiente a la prioridad del primer elemento de la cola
	 * @Precondicion: La cola debe estar inicializada y no estar vacia
	 * @Postcondicion: -
	 */
	int Prioridad();

}
