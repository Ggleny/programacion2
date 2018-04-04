package utilidades;

import api.ColaTDA;
import api.PilaTDA;
import implementaciones.arreglos.PilaTF;

public class Metodos {
	/**
	 * @#PasarPila
	 * @Tarea: Pasa los datos de la pila origen a la pila destino.
	 * @Parametros: Se reciben dos pilas de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: Las pilas deben estar inicializadas
	 * @Postcondicion: La pila destino tiene los elementos de la pila origen
	 */
	public static void PasarPila(PilaTDA origen, PilaTDA destino){
		while(!origen.PilaVacia()){
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}
	
	/**
	 * @#CopiarPila
	 * @Tarea: Copia los datos de la pila origen a la pila destino, sin vaciar la pila origen.
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
	 * @Tarea: Invierte la posición de los elementos de la pila.
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
			c.Desencolar();
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
	 * @Tarea: Invierte la posición de los elementos de la cola.
	 * @Parametros: Se recibe una cola de tipo ColaTDA.
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada.
	 * @Postcondicion: Las posiciones de los elementos de la cola estan invertidos.
	 */
	public static void InvertirCola(ColaTDA c) {
		int x;
		x = c.Primero();
		c.Desencolar();
		if(!c.ColaVacia()) {
			InvertirCola(c);
		}
		c.Acolar(x);
	}
	
	
	
	
	/*public static void PasarCola(ColaTDA o,ColaTDA d) {
		ColaTDA aux = new Cola
		aux
	}*/
}
