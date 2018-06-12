package api;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @ADT: TDA Conjunto
 * @definition: Coleccion de datos sin un orden definido, el cual no cuenta con repeticiones. 
 */
public interface ConjuntoTDA {

	/**
	 * @#Inicializar
	 * @Tarea: Inicializar un conjunto.
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene un conjunto inicilizado
	 */	
	void Inicializar();

	/**
	 * @#Agregar
	 * @Tarea: Agregar un elemento al conjunto
	 * @Parametros: Se recibe un numero entero a ser agregado en el conjunto
	 * @Devuelve: -
	 * @Precondicion: El conjunto debe estar inicializado
	 * @Postcondicion: El conjunto tiene un elemento mas que antes
	 */
	 void Agregar(int x);

	/**
	 * @#Sacar
	 * @Tarea: Eliminar un elemento del conjunto
	 * @Parametros: Un elemento de tipo entero correspondiente al elemento que se quiere sacar
	 * @Devuelve: -
	 * @Precondicion: El conjunto debe estar inicializado y tener al menos un elemento
	 * @Postcondicion: El conjunto tiene un elemento menos que antes
	 */
	 void Sacar(int x);

	/**
	 * @#Elegir
	 * @Tarea: Elige un elemento del conjunto
	 * @Parametros: -
	 * @Devuelve: Un entero correspondiente al ultimo elemento del conjunto
	 * @Precondicion: El conjunto debe estar inicializado
	 * @Postcondicion: -
	 */
	 int Elegir();

	/**
	 * @#Pertenece
	 * @Tarea: Verifica si un elemento esta contenido en el conjunto
	 * @Parametros: Un elemento de tipo entero a ser verificado
	 * @Devuelve: Verdadero si el elemento existe en el conjunto; falso si no
	 * @Precondicion: El conjunto debe estar inicializado y no estar vacio
	 * @Postcondicion: -
	 */
	boolean Pertenece(int x);

	/**
	 * @#ConjuntoVacio
	 * @Tarea: Permite saber si hay o no elementos en un conjunto
	 * @Parametros: -
	 * @Devuelve: Verdadero si el conjunto esta vacio; falso si no
	 * @Precondicion: El conjunto debe estar inicializado
	 * @Postcondicion: -
	 */
	boolean ConjuntoVacio();

}
