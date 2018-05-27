package utilidades;

import api.ColaTDA;
import api.PilaTDA;
import implementaciones.arreglos.ColaPI;
import implementaciones.arreglos.ColaPU;
import implementaciones.arreglos.PilaTF;

public class Metodos {
	/**
	 * @#PasarPila
	 * @Tarea: Pasa los elementos de la pila origen a la pila destino.
	 * @Parametros: Se reciben dos pilas de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: Las pilas deben estar inicializadas
	 * @Postcondicion: La pila destino tiene los elementos de la pila origen y la pila origen queda vacia
	 */
	public static void PasarPila(PilaTDA origen, PilaTDA destino){
		while(!origen.PilaVacia()){
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}
	
	/**
	 * @#CopiarPila
	 * @Tarea: Copia los elementos de la pila origen a la pila destino, sin modificar la pila origen.
	 * @Parametros: Se reciben dos pilas de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: Las pilas deben estar inicializadas
	 * @Postcondicion: Las dos pilas tienen los mismos elementos.
	 */
	public static void CopiarPila(PilaTDA origen, PilaTDA destino){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		PasarPila(origen, auxiliar);
		while(!auxiliar.PilaVacia()){
			origen.Apilar(auxiliar.Tope());
			destino.Apilar(auxiliar.Tope());
			auxiliar.Desapilar();
		}
	}
	
	/**
	 * @#InvertirPila
	 * @Tarea: Invierte la posici�n de los elementos de la pila.
	 * @Parametros: Se recibe una pila de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada.
	 * @Postcondicion: Las posiciones de los elementos de la pila estan invertidos.
	 */
	public static void InvertirPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		PilaTDA auxiliar2 = new PilaTF();
		auxiliar.InicializarPila();
		auxiliar2.InicializarPila();
		PasarPila(origen,auxiliar);
		PasarPila(auxiliar,auxiliar2);
		PasarPila(auxiliar2,origen);		
	}
	
	/**
	 * @#ContarPila
	 * @Tarea: Cuenta la cantidad de elementos de una pila.
	 * @Parametros: Se recibe una pila de tipo PilaTDA.
	 * @Devuelve: Se devuelve la cantidad de elementos de la pila
	 * @Precondicion: La pila debe estar inicializada.
	 * @Postcondicion: -.
	 */
	public static int ContarPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		CopiarPila(origen, auxiliar);
		int contador = 0;
		while(!auxiliar.PilaVacia()){
			auxiliar.Desapilar();
			contador++;
		}
		return contador; 
	}
	
	
	/**
	 * @#SumarPila
	 * @Tarea: Suma todos los elementos de la pila.
	 * @Parametros: Se recibe una pila de tipo PilaTDA.
	 * @Devuelve: Se devuelve el resultado de la suma de todos los elementos de la pila.
	 * @Precondicion: La pila debe estar inicializada.
	 * @Postcondicion: -.
	 */
	public static int SumarPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		CopiarPila(origen,auxiliar);
		int sumador = 0;
		while(!auxiliar.PilaVacia()){
			sumador += auxiliar.Tope();
			auxiliar.Desapilar();
		}
		return sumador;
	}
	
	/**
	 * @#PromedioPila
	 * @Tarea: Realizar el promedio todos los elementos de la pila.
	 * @Parametros: Se recibe una pila de tipo PilaTDA.
	 * @Devuelve: Se devuelve el resultado del promedio de  los elementos de la pila.
	 * @Precondicion: La pila debe estar inicializada.
	 * @Postcondicion: -.
	 */
	public static float PromedioPila(PilaTDA origen){
		return (float)SumarPila(origen)/ContarPila(origen);
	}
	
	public static void PasarColaAPila(ColaTDA c,PilaTDA p) {
		while(!c.ColaVacia()) {
			p.Apilar(c.Primero());
			c.Desacolar();
		}
		
	}
	
	
	public static void PasarPilaACola(PilaTDA p, ColaTDA c) {
		while (!p.PilaVacia()) {
			c.Acolar(p.Tope());
			p.Desapilar();
		}
	}
	
	/**
	 * @#InvertirCola
	 * @Tarea: Invierte la posici�n de los elementos de la cola.
	 * @Parametros: Se recibe una cola de tipo ColaTDA.
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada.
	 * @Postcondicion: Las posiciones de los elementos de la cola estan invertidos.
	 */
	public static void InvertirCola(ColaTDA c) {
		int x;
		x = c.Primero();
		c.Desacolar();
		if(!c.ColaVacia()) {
			InvertirCola(c);
		}
		c.Acolar(x);
	}
	
	/**
	 * @#PasarCola
	 * @Tarea: Pasa los elementos de la cola origen a la cola destino.
	 * @Parametros: Se reciben dos pilas de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: Las colas deben estar inicializadas
	 * @Postcondicion: La cola destino tiene los elementos de la cola origen y la cola origen queda vacia.
	 */
	public static void PasarCola(ColaTDA origen, ColaTDA destino) {
		while(!origen.ColaVacia()) {
			destino.Acolar(origen.Primero());
			destino.Desacolar();
		}
	}
	
	/**
	 * @#CopiarCola
	 * @Tarea: Copia los elementos de la cola origen a la cola destino, manteniendo la cola origen sin cambios.
	 * @Parametros: Se reciben dos pilas de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: Las pilas deben estar inicializadas
	 * @Postcondicion: Las dos pilas tienen los mismos elementos.
	 */
	public static void CopiarCola(ColaTDA origen, ColaTDA destino){
		ColaTDA auxiliar = new ColaPI();
		auxiliar.InicializarCola();
		PasarCola(origen, destino);
		while(!auxiliar.ColaVacia()){
			origen.Acolar(auxiliar.Primero());
			destino.Acolar(auxiliar.Primero());
			auxiliar.Desacolar();
		}
	}
	
	/**
	 * @#ColaInversa
	 * @Tarea: Determinar si la Cola cola1 es inversa de la cola2 
	 * 		   es decir que tengan los mismos elementos pero en orden inverso.
	 * @Parametros: Se reciben dos colas de tipo ColaTDA.
	 * @Devuelve: un boleano que determina si cola1 es inversa de cola2.
	 * @Precondicion: Las colas deben estar inicializadas
	 * @Postcondicion: -.
	 */
	public static boolean ColaInversa(ColaTDA cola1, ColaTDA cola2){
		ColaTDA auxiliarCola1, auxiliarCola2;
		auxiliarCola1 = new ColaPU();
		auxiliarCola2 = new ColaPU();
		auxiliarCola1.InicializarCola();
		auxiliarCola2.InicializarCola();
		CopiarCola(cola1, auxiliarCola1);
		CopiarCola(cola2, auxiliarCola2);
		InvertirCola(auxiliarCola2);
		boolean resultado = true;
		
		while(resultado && !auxiliarCola1.ColaVacia() && !auxiliarCola2.ColaVacia()) {
			if(auxiliarCola1.Primero()!=auxiliarCola2.Primero()) {
				resultado = false;
			}
			auxiliarCola1.Desacolar();
			auxiliarCola2.Desacolar();
		}
		return (auxiliarCola1.ColaVacia()  && auxiliarCola2.ColaVacia() && resultado);
	}
}
