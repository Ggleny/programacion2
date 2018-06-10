/**
 * 
 */
package utilities;

import api.PilaTDA;
import implementations.arreglos.ColaPI;
import implementations.arreglos.ColaPU;
import implementations.arreglos.ColaPrioridadAO;
import implementations.arreglos.ColaPrioridadDA;
import implementations.arreglos.PilaTF;
import implementations.arreglos.PilaTI;
import implementations.listas.ConjuntoLD;
import implementations.listas.DicMultipleL;
import api.ColaTDA;

import javax.lang.model.element.Element;

import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.DiccionarioSimpleTDA;
import implementations.arreglos.ConjuntoTA;


@SuppressWarnings("unused")
/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 */
public class Metodos {

	/**
	 * @#PasarPila
	 * @Tarea: Pasa todos los elementos de una pila a otra
	 * @Parametros: Dos objetos de tipo PilaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se pasaron
	 * @Precondicion: Ambas pilas deben estar inicializadas y la 1ra debe tener, 
	 * al menos, un elemento
	 * @Postcondicion: La 1er pila quedara vacia y la 2da tendra sus elementos pero en
	 * orden inverso
	 * @Costo: lineal pues tiene una iteracion
	 */	
	public static int PasarPila(PilaTDA origen, PilaTDA destino){
		int i = 0;
		while(!origen.PilaVacia()){
			destino.Apilar(origen.Tope());
			origen.Desapilar();
			i++;
		}
		return i;
	}
	
	/**
	 * @#CopiarPila
	 * @Tarea: Copia los elementos de una pila a otra
	 * @Parametros: Dos elementos de tipo PilaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se copiaron
	 * @Precondicion: Ambas pilas deben estar inicializadas y la 1ra debe tener, al menos, 
	 * un elemento
	 * @Postcondicion: Ambas pilas tendran los mismo elementos, en el mismo orden
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int CopiarPila(PilaTDA origen, PilaTDA destino){
		PilaTDA paux = new PilaTF();
		paux.InicializarPila();
		int i = PasarPila(origen, paux);
		while(!paux.PilaVacia()){
			origen.Apilar(paux.Tope());
			destino.Apilar(paux.Tope());
			paux.Desapilar();
		}
		return i;
	}
	
	/**
	 * @#InvertirPila
	 * @Tarea: Invierte el orden de los elementos de una pila
	 * @Parametros: Un elemento de tipo PilaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que habia para invertir
	 * @Precondicion: La pila debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: La pila tendra los mismos elementos que antes pero en orden inverso
	 * @Costo: lineal, pues tiene tres iteraciones consecutivas mas no anidadas
	 */	
	public static int InvertirPila(PilaTDA origen){
		PilaTDA paux = new PilaTF();
		PilaTDA paux2 = new PilaTF();
		paux.InicializarPila();
		paux2.InicializarPila();
		PasarPila(origen,paux);
		PasarPila(paux,paux2);
		return PasarPila(paux2,origen);		
	}
	
	/**
	 * @#ContarPila
	 * @Tarea: Cuenta la cantidad de elementos en una pila
	 * @Parametros: Un elemento de tipo PilaTDA
	 * @Devuelve: Un numero entero correspondiente a la cantidad de elementos
	 * @Precondicion: La lista debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int ContarPila(PilaTDA origen){
		PilaTDA paux = new PilaTF();
		paux.InicializarPila();
		CopiarPila(origen, paux);
		int contador = 0;
		while(!paux.PilaVacia()){
			paux.Desapilar();
			contador++;
		}
		return contador; 
	}
	
	/**
	 * @#SumarPila
	 * @Tarea: Suma todos los elementos que hay en una pila
	 * @Parametros: Un elemento de tipo PilaTDA
	 * @Devuelve: Un numero entero correspondiente a la sumatoria de todos los 
	 * elementos en la pila
	 * @Precondicion: La pila debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int SumarPila(PilaTDA origen){
		PilaTDA paux = new PilaTF();
		paux.InicializarPila();
		CopiarPila(origen,paux);
		int sumador = 0;
		while(!paux.PilaVacia()){
			sumador += paux.Tope();
			paux.Desapilar();
		}
		return sumador;
	}
	
	/**
	 * @#PromedioPila
	 * @Tarea: Calcular el promedio de los valores contenidos en una pila
	 * @Parametros: Un elemento de tipo PilaTDA
	 * @Devuelve: Un numero de punto flotante correspondiente al promedio de los elementos 
	 * contenidos en la pila
	 * @Precondicion: La pila debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static float PromedioPila(PilaTDA origen){
		return (float)SumarPila(origen)/ContarPila(origen);
	}

	/**
	 * @#PasarCola
	 * @Tarea: Pasa los elementos de una cola a otra
	 * @Parametros: Dos elementos de tipo ColaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se pasaron
	 * @Precondicion: Ambas colas deben estar inicializadas y la 1ra debe tener, al menos, 
	 * un elemento
	 * @Postcondicion: La 1er cola quedara vacia y sus elementos estaran contenidos en la 2da 
	 * cola, en el mismo orden en que estaban
	 * @Costo: lineal, pues se tiene solo una iteracion
	 */	
	public static int PasarCola(ColaTDA origen, ColaTDA destino){
		int i = 0;
		while(!origen.ColaVacia()){
			destino.Acolar(origen.Primero());
			origen.Desacolar();
			i++;
		}
		return i;
	}

	/**
	 * @#CopiarCola
	 * @Tarea: Copia los elementos de una cola a otra
	 * @Parametros: Dos elementos de tipo ColaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se copiaron
	 * @Precondicion: Ambas colas tienen que estar inicializadas y la 1ra debe tener, al
	 * menos, un elementos
	 * @Postcondicion: Ambas colas tendran los mismos elementos, en el mismo orden
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int CopiarCola(ColaTDA origen, ColaTDA destino){
		ColaTDA caux = new ColaPU();
		caux.InicializarCola();
		int i = PasarCola(origen,caux);
		while(!caux.ColaVacia()){
			origen.Acolar(caux.Primero());
			destino.Acolar(caux.Primero());
			caux.Desacolar();
		}
		return i;
	}

	/**
	 * @#InvertirColaCP
	 * @Tarea: Invierte los elementos en una cola, mediante el uso de Pilas
	 * @Parametros: Un unico elemento de tipo ColaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que habia para invertir
	 * @Precondicion: La cola debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: La cola tendra los mismos elementos que antes pero en orden inverso
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int InvertirColaCP(ColaTDA origen){
		PilaTDA paux = new PilaTF();
		paux.InicializarPila();
		PasarColaAPila(origen,paux);
		return PasarPilaACola(paux,origen);
	}

	/**
	 * @#InvertirColaSP
	 * @Tarea: Invierte los elementos en una cola, sin el uso de Pilas
	 * @Parametros: Un unico elemento de tipo ColaTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que habia para invertir
	 * @Precondicion: La cola debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: La cola tendra los mismos elementos que antes pero en orden inverso
	 * @Costo: N/A pues se usa recursividad
	 */
	public static int InvertirColaSP(ColaTDA origen){
		int x = origen.Primero();
		int i = 0;
		origen.Desacolar();
		if(!origen.ColaVacia())
			i = InvertirColaSP(origen);
		origen.Acolar(x);
		return 1 + i;
	}

	/**
	 * @#CompararUltimo
	 * @Tarea: Compara si la 2da cola es igual a todos los elementos al final de la 1ra.
	 * @Parametros: Recibe dos elementos de tipo ColaTDA
	 * @Devuelve: Verdadero si los ultimos elementos son iguales; falso en caso contrario
	 * @Precondicion: Ambas colas deben estar inicializadas y tener al menos un elemento.
	 * @Postcondicion: -
	 * @Costo: lineal, pues se tienen varias iteraciones consecutivas mas no anidadas
	 */	
	public static boolean CompararUltimo(ColaTDA cola1, ColaTDA cola2){
		ColaTDA caux = new ColaPU();
		caux.InicializarCola();
		PilaTDA paux1 = new PilaTF();
		paux1.InicializarPila();
		PilaTDA paux2 = new PilaTF();
		paux2.InicializarPila();
		CopiarCola(cola1,caux);
		int len1 = PasarColaAPila(caux,paux1);
		CopiarCola(cola2,caux);
		int len2 = PasarColaAPila(caux,paux2);
		boolean iguales = true;
		if(len2>len1){
			iguales = false;
		}else{
			while(!paux2.PilaVacia() && iguales){
				iguales = (paux1.Tope()==paux2.Tope())?true:false;
				paux1.Desapilar();
				paux2.Desapilar();
			}
		}
		return iguales;
	}

	/**
	 * @#ColaEsCapicua
	 * @Tarea: Verifica si una cola es capicua, es decir, que el primer elemento sea igual al ultimo,
	 * el segundo sea igual al penultimo, etc.
	 * @Parametros: Recibe un elemento de tipo ColaTDA
	 * @Devuelve: Verdadero si es capicua; falso si no lo es
	 * @Precondicion: La cola debe estar inicializada y tener, al menos, un elemento
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static boolean ColaEsCapicua(ColaTDA origen){
		ColaTDA caux1 = new ColaPU();
		caux1.InicializarCola();
		ColaTDA caux2 = new ColaPU();
		caux2.InicializarCola();
		CopiarCola(origen,caux1);
		CopiarCola(origen,caux2);
		int elementos = InvertirColaSP(caux2);
		boolean iguales = true;
		for(int i = 0; (i < (elementos/2)) && iguales; i++){
			iguales = (caux1.Primero()==caux2.Primero())?true:false;
			caux1.Desacolar();
			caux2.Desacolar();
		}
		return iguales;
	}

	/**
	 * @#CompararInversion
	 * @Tarea: Compara que una cola sea igual al inverso de otra.
	 * @Parametros: Dos colas del tipo ColaTDA.
	 * @Devuelve: Verdadero si una cola es la inversa de la otra; falso si no lo es.
	 * @Precondicion: Las colas deben estar inicializadas y contener, al menos, un elemento cada una.
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static boolean CompararInversion(ColaTDA cola1, ColaTDA cola2){
		ColaTDA caux1 = new ColaPU();
		caux1.InicializarCola();
		ColaTDA caux2 = new ColaPU();
		caux2.InicializarCola();
		CopiarCola(cola1,caux1);
		CopiarCola(cola2,caux2);
		InvertirColaSP(caux2);
		boolean iguales = true;
		while(!caux1.ColaVacia() && !caux2.ColaVacia() && iguales){
			iguales = (caux1.Primero()==caux2.Primero())?true:false;
			caux1.Desacolar();
			caux2.Desacolar();
		}
		return (caux1.ColaVacia() && caux2.ColaVacia() && iguales);
	}
	
	/**
	 * @#PasarPilaACola
	 * @Tarea: Pasa los elementos de una pila a una cola.
	 * @Parametros: Un elemento del tipo PilaTDA y un elemento del tipo ColaTDA.
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que habia se pasaron
	 * @Precondicion: Ambos elementos deben estar inicializados y la pila debe contener, al menos, un elemento.
	 * @Postcondicion: La pila queda vacia y su elementos quedan contenidos en la cola.
	 * @Costo: lineal, pues se tiene solo una iteracion
	 */	
	public static int PasarPilaACola(PilaTDA origen, ColaTDA destino){
		int i = 0;
		while(!origen.PilaVacia()){
			destino.Acolar(origen.Tope());
			origen.Desapilar();
			i++;
		}
		return i;
	}

	/**
	 * @#PasarColaAPila
	 * @Tarea: Pasa los elementos de una cola a una pila.
	 * @Parametros: Un elemento del tipo PilaTDA y un elemento del tipo ColaTDA.
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se pasaron
	 * @Precondicion: Ambos elementos deben estar inicializados y la cola debe contener, al menos, un elemento.
	 * @Postcondicion: La cola queda vacia y su elementos quedan contenidos en la pila.
	 * @Costo: lineal, pues se tiene solo una iteracion
	 */	
	public static int PasarColaAPila(ColaTDA origen, PilaTDA destino){
		int i = 0;
		while(!origen.ColaVacia()){
			destino.Apilar(origen.Primero());
			origen.Desacolar();
			i++;
		}
		return i;
	}

	/**
	 * @#PasarColaConPrioridad
	 * @Tarea: Pasa los elementos de una cola a otra
	 * @Parametros: Dos elementos de tipo ColaPrioridadTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se copiaron
	 * @Precondicion: Ambas colas tienen que estar inicializadas y la 1ra debe tener, al
	 * menos, un elemento
	 * @Postcondicion: Los elementos de la cola origen pasaran a la cola destin, y la primera 
	 * quedara vacia.
	 * @Costo: lineal, pues se tiene solo una iteracion
	 */	
	public static int PasarColaConPrioridad(ColaPrioridadTDA origen, ColaPrioridadTDA destino){
		int i = 0;
		while(!origen.ColaVacia()){
			destino.AcolarPrioridad(origen.Primero(), origen.Prioridad());
			origen.Desacolar();
			i++;
		}
		return i;
	}

	
	/**
	 * @#CopiarColaConPrioridad
	 * @Tarea: Copia los elementos de una cola a otra, manteniendo sus prioridades
	 * @Parametros: Dos elementos de tipo ColaPrioridadTDA
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se copiaron
	 * @Precondicion: Ambas colas tienen que estar inicializadas y la 1ra debe tener, al
	 * menos, un elemento
	 * @Postcondicion: Ambas colas tendran los mismos elementos, con las mismas prioridades
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static int CopiarColaConPrioridad(ColaPrioridadTDA origen, ColaPrioridadTDA destino){
		ColaPrioridadTDA cpaux = new ColaPrioridadAO();
		cpaux.InicializarCola();
		int i = PasarColaConPrioridad(origen,cpaux);
		while(!cpaux.ColaVacia()){
			origen.AcolarPrioridad(cpaux.Primero(), cpaux.Prioridad());
			destino.AcolarPrioridad(cpaux.Primero(), cpaux.Prioridad());
			cpaux.Desacolar();
		}
		return i;
	}
		
	/**
	 * @#CombinarColasConPrioridad
	 * @Tarea: Pasa los elementos de una cola a otra cola, ordenados por prioridad. Si dos elementos tienen la misma prioridad,
	 * se priorizan los elementos ya existentes en la cola destino.
	 * @Parametros: Se reciben dos elementos de tipo ColaPrioridadTDA.
	 * @Devuelve: La cantidad de elementos que se pasaron de una cola a la otra.
	 * @Precondicion: Ambos elementos deben estar inicializados.
	 * @Postcondicion: La cola origen queda vacia y su elementos quedan contenidos en la cola destino.
	 * @Costo: lineal, pues se tiene solo una iteracion
	 */	
	public static int CombinarColasConPrioridad(ColaPrioridadTDA destino, ColaPrioridadTDA origen){
		int i = 0;
		while(!origen.ColaVacia()){
			destino.AcolarPrioridad(origen.Primero(), origen.Prioridad());
			origen.Desacolar();
			i++;
		}
		return i;
	}

	/**
	 * @#CompararColasConPrioridad
	 * @Tarea: Verificar si dos colas con prioridad son iguales. Para esto, ambas deben tener los mismos elementos 
	 * con las mismas prioridades.
	 * @Parametros: Se reciben dos elementos de tipo ColaPrioridadTDA.
	 * @Devuelve: Verdadero si todos los elementos son iguales; Falso si no lo son.
	 * @Precondicion: Ambos elementos deben estar inicializados.
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static boolean CompararColasConPrioridad(ColaPrioridadTDA colap1, ColaPrioridadTDA colap2){
		ColaPrioridadTDA cpaux1 = new ColaPrioridadAO();
		cpaux1.InicializarCola();
		ColaPrioridadTDA cpaux2 = new ColaPrioridadAO();
		cpaux2.InicializarCola();
		int i = CopiarColaConPrioridad(colap1,cpaux1);
		int j = CopiarColaConPrioridad(colap2,cpaux2);
		boolean iguales = true;
		if(i!=j){
			iguales = false;
		}else{
			while(!cpaux1.ColaVacia() && iguales){
				iguales = ((cpaux1.Primero()==cpaux2.Primero()) && (cpaux1.Prioridad()==cpaux2.Prioridad()));
				cpaux1.Desacolar();
				cpaux2.Desacolar();
			}
		}
		return iguales;
	}
	
	/**
	 * @#MostrarPila
	 * @Tarea: Muestra todos los elementos contenidos en una pila.
	 * @Parametros: Se reciben un elemento de tipo PilaTDA.
	 * @Devuelve: -
	 * @Precondicion: La pila debe estar inicializada.
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static void MostrarPila(PilaTDA pila){
		PilaTDA paux = new PilaTF();
		paux.InicializarPila();
		Metodos.CopiarPila(pila, paux);
		while(!paux.PilaVacia()){
			System.out.print(paux.Tope() + " ");
			paux.Desapilar();
		}
		System.out.println();
	}
	
	/**
	 * @#MostrarCola
	 * @Tarea: Muestra todos los elementos contenidos en una cola.
	 * @Parametros: Se reciben un elemento de tipo ColaTDA.
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada.
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static void MostrarCola(ColaTDA cola){
		ColaTDA caux = new ColaPU();
		caux.InicializarCola();
		Metodos.CopiarCola(cola, caux);
		while(!caux.ColaVacia()){
			System.out.print(caux.Primero() + " ");
			caux.Desacolar();
		}
		System.out.println();
	}

	/**
	 * @#MostrarColaConPrioridad
	 * @Tarea: Muestra todos los elementos contenidos en una cola.
	 * @Parametros: Se reciben un elemento de tipo ColaTDA.
	 * @Devuelve: -
	 * @Precondicion: La cola debe estar inicializada.
	 * @Postcondicion: -
	 * @Costo: lineal, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static void MostrarColaConPrioridad(ColaPrioridadTDA cola){
		ColaPrioridadTDA cpaux = new ColaPrioridadAO();
		cpaux.InicializarCola();
		Metodos.CopiarColaConPrioridad(cola, cpaux);
		while(!cpaux.ColaVacia()){
			System.out.println(cpaux.Primero() + " " + cpaux.Prioridad());
			cpaux.Desacolar();
		}
		System.out.println();
	}
	
	/**
	 * @#CopiarConjunto
	 * @Tarea: Copia los elementos de un conjunto a otro
	 * @Parametros: Dos elementos de tipo ConjuntoTDA.
	 * @Devuelve: Un entero correspondiente a la cantidad de elementos que se copiaron
	 * @Precondicion: Ambos Conjuntos deben estar inicializadas y el 1ro debe tener, al menos, 
	 * un elemento.
	 * @Postcondicion: Ambos conjuntos tendran los mismo elementos.
	 * @Costo: lineal, pues tiene dos iteraciones consecutivas mas no anidadas
	 */	
	public static int CopiarConjunto(ConjuntoTDA origen, ConjuntoTDA destino){
		ConjuntoTDA caux = new ConjuntoTA();
		caux.Inicializar();
		int i = 0;
		while(!origen.ConjuntoVacio()){
			caux.Agregar(origen.Elegir());
			destino.Agregar(origen.Elegir());
			origen.Sacar(origen.Elegir());
			i++;
		}
		while(!caux.ConjuntoVacio()){
			origen.Agregar(caux.Elegir());
			caux.Sacar(caux.Elegir());
		}
		return i;
	}
	
	/**
	 * @#Interseccion
	 * @Tarea: Encuentra la interseccion de dos conjuntos.
	 * @Parametros: Se reciben dos elemento de tipo ConjuntoTDA.
	 * @Devuelve: El conjunto interseccion.
	 * @Precondicion: Los conjuntos deben estar inicializados.
	 * @Postcondicion: -
	 * @Costo: Polinomica, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static ConjuntoTDA Interseccion(ConjuntoTDA conjunto1,ConjuntoTDA conjunto2){
		ConjuntoTDA cinterseccion = new ConjuntoTA();
		cinterseccion.Inicializar();
		ConjuntoTDA caux = new ConjuntoTA();
		caux.Inicializar();
		CopiarConjunto(conjunto1,caux);
		while(!caux.ConjuntoVacio()){
			if(conjunto2.Pertenece(caux.Elegir())){
				cinterseccion.Agregar(caux.Elegir());
			}
			caux.Sacar(caux.Elegir());
		}
		return cinterseccion;
	}

	/**
	 * @#Union
	 * @Tarea: Crea el conjunto union entre dos conjuntos.
	 * @Parametros: Se reciben dos elemento de tipo ConjuntoTDA.
	 * @Devuelve: El conjunto union.
	 * @Precondicion: Los conjuntos deben estar inicializados.
	 * @Postcondicion: -
	 * @Costo: Polinomica, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static ConjuntoTDA Union(ConjuntoTDA conjunto1,ConjuntoTDA conjunto2){
		ConjuntoTDA conjunion = new ConjuntoTA();
		conjunion.Inicializar();
		ConjuntoTDA caux = new ConjuntoTA();
		caux.Inicializar();
		CopiarConjunto(conjunto1,conjunion);
		CopiarConjunto(conjunto2,caux);
		while (!caux.ConjuntoVacio()){
			if(conjunion.Pertenece(caux.Elegir()))
				conjunion.Agregar(caux.Elegir());
			caux.Sacar(caux.Elegir());
		}
		return conjunion;
	}	
	
	/**
	 * @#Diferencia
	 * @Tarea: Crea el conjunto diferencia entre dos conjuntos.
	 * @Parametros: Se reciben dos elemento de tipo ConjuntoTDA.
	 * @Devuelve: El conjunto Diferencia.
	 * @Precondicion: Los conjuntos deben estar inicializados.
	 * @Postcondicion: -
	 * @Costo: Polinomica, pues tiene varias iteraciones consecutivas mas no anidadas
	 */	
	public static ConjuntoTDA Diferencia(ConjuntoTDA conjunto1,ConjuntoTDA conjunto2){
		ConjuntoTDA conjdiferencia = new ConjuntoTA();
		conjdiferencia.Inicializar();
		ConjuntoTDA caux = new ConjuntoTA();
		caux.Inicializar();
		CopiarConjunto(conjunto1,conjdiferencia);
		CopiarConjunto(conjunto2,caux);
		while (!caux.ConjuntoVacio()){
			if(conjdiferencia.Pertenece(caux.Elegir())){
				conjdiferencia.Sacar(caux.Elegir());
			}
			caux.Sacar(caux.Elegir());
		}
		return conjdiferencia;
		
	}
	
	public static ConjuntoTDA UnionLD(ConjuntoTDA conjunto1,ConjuntoTDA conjunto2){
		ConjuntoTDA conjunion = new ConjuntoLD();
		conjunion.Inicializar();
		ConjuntoTDA caux = new ConjuntoLD();
		caux.Inicializar();
		CopiarConjunto(conjunto1,conjunion);
		CopiarConjunto(conjunto2,caux);
		while (!caux.ConjuntoVacio()){
			if(conjunion.Pertenece(caux.Elegir()))
				conjunion.Agregar(caux.Elegir());
			caux.Sacar(caux.Elegir());
		}
		return conjunion;
	}	
	
	public static ConjuntoTDA InterseccionLD(ConjuntoTDA conjunto1,ConjuntoTDA conjunto2){
		ConjuntoTDA cinterseccion = new ConjuntoLD();
		cinterseccion.Inicializar();
		ConjuntoTDA caux = new ConjuntoLD();
		caux.Inicializar();
		CopiarConjunto(conjunto1,caux);
		while(!caux.ConjuntoVacio()){
			if(conjunto2.Pertenece(caux.Elegir())){
				cinterseccion.Agregar(caux.Elegir());
			}
			caux.Sacar(caux.Elegir());
		}
		return cinterseccion;
	}
	
	/*Metodo para mostrar las claves y valores de una diccionario*/
	public static void mostrarClaveValor (DiccionarioMultipleTDA dic) {
		ConjuntoTDA caux = new ConjuntoLD();
		ConjuntoTDA auxValores;
		caux.Inicializar();
		CopiarConjunto(dic.Claves(),caux);
		while(!caux.ConjuntoVacio()) {
			System.out.println("Clave diccionario: "+caux.Elegir());
			auxValores = dic.Recuperar(caux.Elegir());
			while(!auxValores.ConjuntoVacio()) {
				System.out.println("  Valor: "+auxValores.Elegir());
				auxValores.Sacar(auxValores.Elegir());
			}
			caux.Sacar(caux.Elegir());
		}
	}
	private static void pasarValoresAClave(ConjuntoTDA auxValores,int clave, DiccionarioMultipleTDA dicToConcat) {
		while(!auxValores.ConjuntoVacio()) {
			dicToConcat.Agregar(clave, auxValores.Elegir());
			auxValores.Sacar(auxValores.Elegir());
		}
	}
	
	private static void PasarValoresDic(DiccionarioMultipleTDA dicToConcat,DiccionarioMultipleTDA d1) {
		ConjuntoTDA claves = d1.Claves();
		ConjuntoTDA auxValores;
		while (!claves.ConjuntoVacio()){
			auxValores = d1.Recuperar(claves.Elegir());
			Metodos.pasarValoresAClave(auxValores,claves.Elegir(),d1);
			claves.Sacar(claves.Elegir());
		}
	}
	//Punto 5.1  Con listas a)
	public static DiccionarioMultipleTDA UnionDic(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2) {
		DiccionarioMultipleTDA dicUnion = new DicMultipleL();
		dicUnion.InicializarDiccionario();
		if(!d1.Claves().ConjuntoVacio()) {
			Metodos.PasarValoresDic(dicUnion,d1);
		}
		if(!d2.Claves().ConjuntoVacio()) {
			Metodos.PasarValoresDic(dicUnion,d2);
		}
		return dicUnion;
	}
	
	//Punto 5.1  Con listas b)
		public static DiccionarioMultipleTDA UnionClavesDic(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2) {
			DiccionarioMultipleTDA dicUnion = new DicMultipleL();
			dicUnion.InicializarDiccionario();
			ConjuntoTDA auxValores,auxValores2;
			if(!d1.Claves().ConjuntoVacio() && !d2.Claves().ConjuntoVacio()) {
				ConjuntoTDA claves =  d1.Claves();
				int claveAux,valorAux;
				while (!claves.ConjuntoVacio()){
					claveAux = claves.Elegir();
					auxValores = d1.Recuperar(claveAux); 
					auxValores2 = d2.Recuperar(claveAux);
					ConjuntoTDA interseccionValores = InterseccionLD(auxValores, auxValores2);
					//Si tienen valores en comun.
					if(!interseccionValores.ConjuntoVacio()) {
						Metodos.pasarValoresAClave(interseccionValores,claveAux,dicUnion);

					}else  { 
						//Si no tienen ningun valor en comun, solo agrego la clave
						if(!dicUnion.Claves().Pertenece(claveAux)) {
							dicUnion.Agregar(claveAux, auxValores.Elegir());
							dicUnion.EliminarValor(claveAux, auxValores.Elegir());
						}
						
					}
					claves.Sacar(claveAux);
				}
				auxValores2 = d2.Claves();
				Metodos.agregarClaves(auxValores2,dicUnion);//Agrego las claves de d2

			}else {
				auxValores = d1.Claves();
				auxValores2 = d2.Claves();
				if(!auxValores.ConjuntoVacio()) { //Agrego las claves de d1
					Metodos.agregarClaves(auxValores,dicUnion);
				}else if(!auxValores2.ConjuntoVacio()) { //Agrego las claves de d2
					Metodos.agregarClaves(auxValores2,dicUnion);
				}
				
			}
			return dicUnion;
		}
		//agrega solo la clave al diccionario que se le pase.
		private static void agregarClaves(ConjuntoTDA claves,DiccionarioMultipleTDA dic) {
			int valorAux = 0,claveAux;
			ConjuntoTDA clavesAux = new ConjuntoLD(); clavesAux.Inicializar();
			CopiarConjunto(claves, clavesAux);
			while(!clavesAux.ConjuntoVacio()) {
				claveAux = clavesAux.Elegir();
				if(!dic.Claves().Pertenece(claveAux)) {
					dic.Agregar(claveAux, valorAux);
					dic.EliminarValor(claveAux, valorAux);
					
				}
				clavesAux.Sacar(claveAux);
			}
		}
	// PUnto 5.1 c)
		public static DiccionarioMultipleTDA InterseccionClaves(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2) {
			DiccionarioMultipleTDA dicUnion = new DicMultipleL();
			dicUnion.InicializarDiccionario();
			ConjuntoTDA auxValores,auxValores2;
			if(!d1.Claves().ConjuntoVacio() && !d2.Claves().ConjuntoVacio()) {
				ConjuntoTDA claves =  d1.Claves();
				int claveAux,valorAux;
				while (!claves.ConjuntoVacio()){
					claveAux = claves.Elegir();
					auxValores = d1.Recuperar(claveAux); 
					auxValores2 = d2.Recuperar(claveAux);
					if(!auxValores.ConjuntoVacio() && !auxValores2.ConjuntoVacio()) {
						Metodos.pasarValoresAClave(auxValores,claveAux,dicUnion);
						Metodos.pasarValoresAClave(auxValores2,claveAux,dicUnion);
					}
					claves.Sacar(claveAux);
				}
			}
			return dicUnion;
		}
		// PUnto 5.1 d)
		public static DiccionarioMultipleTDA InterseccionClavesValores(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2) {
			DiccionarioMultipleTDA dicUnion = new DicMultipleL();
			dicUnion.InicializarDiccionario();
			ConjuntoTDA auxValores,auxValores2;
			if(!d1.Claves().ConjuntoVacio() && !d2.Claves().ConjuntoVacio()) {
				ConjuntoTDA claves =  d1.Claves();
				int claveAux,valorAux;
				while (!claves.ConjuntoVacio()){
					claveAux = claves.Elegir();
					auxValores = d1.Recuperar(claveAux); 
					auxValores2 = d2.Recuperar(claveAux);
					ConjuntoTDA interseccionValores = InterseccionLD(auxValores, auxValores2);
					//Si tienen valores en comun.
					if(!interseccionValores.ConjuntoVacio()) {
						Metodos.pasarValoresAClave(interseccionValores,claveAux,dicUnion);
						
					}
					claves.Sacar(claveAux);
				}
			}
			return dicUnion;
		}
		/***
		 * 
		 * @param diccionario
		 * @return Diccionario multiple con sus valores.
		 */
		public static DiccionarioMultipleTDA diccionarioDeSinonimos(DiccionarioSimpleTDA diccionario) {
			DiccionarioMultipleTDA dicSinonimos = new DicMultipleL();
			dicSinonimos.InicializarDiccionario();
			if(!diccionario.Claves().ConjuntoVacio()) {
				ConjuntoTDA claves =  diccionario.Claves();
				int claveAux,significado;//,valorAux;
				while (!claves.ConjuntoVacio()){
					claveAux = claves.Elegir();
					significado = diccionario.Recuperar(claveAux);
					dicSinonimos.Agregar(significado, claveAux);
					claves.Sacar(claveAux);
				}
			}
			return dicSinonimos;
		}
		
}
 
