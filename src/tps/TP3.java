/**
 * 
 */
package tps;

import api.PilaTDA;
import api.ColaTDA;
import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;
import api.DiccionarioMultipleTDA;
import implementations.arreglos.ConjuntoTA;
import implementations.arreglos.ConjuntoUA;
import implementations.arreglos.DicSimpleA;
import implementations.arreglos.DicMultipleA;
import implementations.listas.PilaLD;
import implementations.listas.ColaLD;
import implementations.listas.ColaPrioridadLD;
import implementations.listas.ConjuntoLD;
import implementations.listas.DicSimpleL;
import implementations.listas.DicMultipleL;
import utilities.Metodos;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 */
@SuppressWarnings("unused")
public class TP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PilaTDA pld = new PilaLD(); pld.InicializarPila();
		
		pld.Apilar(1); pld.Apilar(2); pld.Apilar(3); pld.Apilar(4); pld.Apilar(5);
		Metodos.MostrarPila(pld);
		System.out.println("La pila es capicua?" + Metodos.PilaEsCapicua(pld));
		System.out.println();
		
		pld.Apilar(5); pld.Apilar(4); pld.Apilar(3); pld.Apilar(2); pld.Apilar(1);
		Metodos.MostrarPila(pld);
		System.out.println("La pila es capicua?" + Metodos.PilaEsCapicua(pld));
		System.out.println();

		System.out.println("Muestro la pila sin repeticiones");
		Metodos.EliminarRepeticionesEnPila(pld);
		Metodos.MostrarPila(pld);
		System.out.println();
		
		System.out.println("Parto la pila en dos mitades y muestro sus particiones por pantalla");
		pld.Apilar(5); pld.Apilar(4); pld.Apilar(3); pld.Apilar(2); pld.Apilar(1);
		PilaTDA pmitad1ld = new PilaLD(); pmitad1ld.InicializarPila();
		PilaTDA pmitad2ld = new PilaLD(); pmitad2ld.InicializarPila();
		Metodos.RepartirPilaParEnDosMitades(pld, pmitad1ld, pmitad2ld);
		System.out.println("Pila:");
		Metodos.MostrarPila(pld);
		System.out.println("Mitad 1:");
		Metodos.MostrarPila(pmitad1ld);
		System.out.println("Mitad 2:");
		Metodos.MostrarPila(pmitad2ld);
		System.out.println();
		
		System.out.println("Genero un pila con elementos repetidos y la muestro por pantalla");
		pld.Apilar(8); pld.Apilar(9); pld.Apilar(3); pld.Apilar(2); pld.Apilar(1);
		Metodos.MostrarPila(pld);
		System.out.println("Genero el conjunto con los elementos repetidos de la pila y lo muestro por pantalla");
		ConjuntoTDA conjaux = new ConjuntoLD();conjaux.Inicializar();
		conjaux=Metodos.ConjuntoDeElementosRepetidosEnPila(pld);
		Metodos.MostrarConjunto(conjaux);
		System.out.println();
		
		System.out.println("Genero una cola con elementos repetidos y la muestro por pantalla");
		ColaTDA cld = new ColaLD(); cld.InicializarCola();
		cld.Acolar(1);cld.Acolar(2);cld.Acolar(2);cld.Acolar(3);cld.Acolar(1);cld.Acolar(3);cld.Acolar(4);
		cld.Acolar(1);cld.Acolar(8);cld.Acolar(4);cld.Acolar(5);cld.Acolar(7);cld.Acolar(6);cld.Acolar(5);
		Metodos.MostrarCola(cld);
		System.out.println("Elimino de la cola los elementos repetidos y la muestro por pantalla");
		Metodos.EliminarRepeticionesEnCola(cld);
		Metodos.MostrarCola(cld);
		System.out.println();
		
		ColaTDA cmitad1ld = new ColaLD(); cmitad1ld.InicializarCola();
		ColaTDA cmitad2ld = new ColaLD(); cmitad2ld.InicializarCola();
		System.out.println("Divido la cola en dos mitades y las muestro por pantalla");
		Metodos.RepartirColalaParEnDosMitades(cld, cmitad1ld, cmitad2ld);
		Metodos.MostrarCola(cmitad1ld);
		Metodos.MostrarCola(cmitad2ld);
		System.out.println();
		
		cld.Acolar(1);cld.Acolar(2);cld.Acolar(2);cld.Acolar(3);cld.Acolar(1);cld.Acolar(3);cld.Acolar(4);
		cld.Acolar(1);cld.Acolar(8);cld.Acolar(4);cld.Acolar(5);cld.Acolar(7);cld.Acolar(6);cld.Acolar(5);
		System.out.println("Le agrego elementos repetidos a la cola y la muestro por pantalla");
		Metodos.MostrarCola(cld);
		System.out.println("Muestro por pantalla el conjunto generado con los elementos repetidos de la cola");
		conjaux=Metodos.ConjuntoDeElementosRepetidosEnCola(cld);
		Metodos.MostrarConjunto(conjaux);
		System.out.println();
		
		System.out.println("Muestro dos conjuntos por pantalla y la diferencia simetrica");
		ConjuntoTDA conjaux2 = new ConjuntoLD();conjaux2.Inicializar();
		conjaux2.Agregar(5);conjaux2.Agregar(6);conjaux2.Agregar(7);
		conjaux2.Agregar(12);conjaux2.Agregar(11);conjaux2.Agregar(10);
		ConjuntoTDA conjdifsimetrica = new ConjuntoLD();conjdifsimetrica.Inicializar();
		conjdifsimetrica=Metodos.DiferenciaSimetricaConOperaciones(conjaux2, conjaux);
		System.out.println();
		
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conjaux);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conjaux2);
		System.out.print("Diferencia Simetrica, utilizando, union, interseccion y diferencia : ");Metodos.MostrarConjunto(conjdifsimetrica);
		System.out.println();
		
		conjdifsimetrica = new ConjuntoLD();conjdifsimetrica.Inicializar();
		conjdifsimetrica=Metodos.DiferenciaSimetricaSinOperaciones(conjaux, conjaux2);
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conjaux);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conjaux2);
		System.out.print("Diferencia Simetrica, sin operaciones: ");Metodos.MostrarConjunto(conjdifsimetrica);
		System.out.println();
		
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conjaux);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conjaux2);
		System.out.println("Son iguales los conjutos? " + Metodos.CompararConjuntos(conjaux, conjaux2));
		ConjuntoTDA conjaux3 = new ConjuntoLD(); conjaux3.Inicializar();
		Metodos.CopiarConjunto(conjaux, conjaux3);
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conjaux);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conjaux3);
		System.out.println("Y ahora? " + Metodos.CompararConjuntos(conjaux, conjaux3));
		System.out.println();

		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conjaux);
		System.out.println("El conjunto tiene " + Metodos.CardinalidadDeConjuntos(conjaux) + " elementos." );
		System.out.println();
		
		System.out.print("Pila: ");Metodos.MostrarPila(pld);
		System.out.print("Cola: ");Metodos.MostrarCola(cld);
		conjaux = Metodos.ConjuntoInterseccionEntrePilaYCola(pld, cld);
		System.out.print("Conjunto Interseccion: "); Metodos.MostrarConjunto(conjaux);
		System.out.println();

		System.out.print("Pila: ");Metodos.MostrarPila(pld);
		System.out.print("Cola: ");Metodos.MostrarCola(cld);
		System.out.println("Tienen los mismo elementos? " + Metodos.PilaEsIguaAlCola(pld, cld));
		System.out.println();

		/* Prueba Union Diccionario Multiple  4 */
		ColaPrioridadTDA cpaux = new ColaPrioridadLD();
		cpaux.InicializarCola();
		cpaux.AcolarPrioridad(10, 1);
		cpaux.AcolarPrioridad(10, 2);
		cpaux.AcolarPrioridad(1, 10);
		cpaux.AcolarPrioridad(10, 10);
		cpaux.AcolarPrioridad(1, 3);
		cpaux.AcolarPrioridad(2, 3);
		DiccionarioMultipleTDA dicmaux = new DicMultipleL();
		dicmaux.InicializarDiccionario();
		Metodos.PasarColaConPrioridadADicMul(cpaux, dicmaux);
		Metodos.MostrarClaveValor(dicmaux);
		System.out.println();
		
		/* Prueba Union Diccionario Multiple  5.1  a)*/
		DiccionarioMultipleTDA dic1 = new DicMultipleL();
		dic1.InicializarDiccionario();
		dic1.Agregar(10, 15);
		dic1.Agregar(10, 16);
		dic1.Agregar(10, 17);
		dic1.Agregar(10, 18);
		
		dic1.Agregar(20, 1);
		dic1.Agregar(20, 2);
		dic1.Agregar(20, 3);
		dic1.Agregar(20, 4);
		
		dic1.EliminarValor(20, 4);
		dic1.Agregar(40, 20);
		
		DiccionarioMultipleTDA dic2 = new DicMultipleL();
		dic2.InicializarDiccionario();
		dic2.Agregar(30, 25);
		dic2.Agregar(30, 26);
		dic2.Agregar(30, 27);
		dic2.Agregar(30, 28);
		
		dic2.Agregar(20, 1);
		dic2.Agregar(20, 4);
		dic2.Agregar(20, 5);
		dic2.Agregar(20, 6);
		dic2.Agregar(20, 7);

		dic2.EliminarValor(20, 6);
		
		DiccionarioMultipleTDA unionDic =  Metodos.UnionDic(dic1,dic2);
		System.out.println("Valores y claves del Diccionario Union");
		Metodos.MostrarClaveValor(unionDic);
		System.out.println();
		
//		System.out.println("Claves del Diccionario 1");
//		Metodos.MostrarClaveValor(dic1);
//		System.out.println("Claves del Diccionario 2");
//		Metodos.MostrarClaveValor(dic2);
		
		/* Prueba Union Diccionario Multiple  5.1  b)*/
		System.out.println();System.out.println("Ejercicio 5.1 b"); System.out.println();
		unionDic =  Metodos.UnionClavesDic(dic1,dic2);
		System.out.println("Valores y claves del Diccionario UnionClavesDic");
		Metodos.MostrarClaveValor(unionDic);
		System.out.println();
		/*System.out.println("Claves del Diccionario 1");
		Metodos.mostrarClaveValor(dic1);
		System.out.println("Claves del Diccionario 2");
		Metodos.mostrarClaveValor(dic2);*/
		

		/* Prueba Union Diccionario Multiple  5.1  c)*/
		System.out.println();System.out.println("Ejercicio 5.1 c"); System.out.println();
		unionDic =  Metodos.InterseccionClaves(dic1,dic2);
		System.out.println("Valores y claves del Diccionario InterseccionClaves");
		Metodos.MostrarClaveValor(unionDic);
		System.out.println();
		
		/* Prueba Union Diccionario Multiple  5.1  d)*/
		System.out.println();System.out.println("Ejercicio 5.1 d"); System.out.println();
		unionDic =  Metodos.InterseccionClavesValores(dic1,dic2);
		System.out.println("Valores y claves del Diccionario InterseccionClavesValores");
		Metodos.MostrarClaveValor(unionDic);
		System.out.println();
		
		
		/* Prueba Union Diccionario Sinonimos  5.2 */
		DiccionarioSimpleTDA dicSimple = new DicSimpleL();
		dicSimple.InicializarDiccionario();
		dicSimple.Agregar(20, 2);
		dicSimple.Agregar(40, 2);
		dicSimple.Agregar(80, 2);
		dicSimple.Agregar(10, 1);
		dicSimple.Agregar(1, 1);
		dicSimple.Agregar(100, 1);
		dicSimple.Agregar(200, 2);
		System.out.println();System.out.println("Ejercicio 5.2"); System.out.println();
		unionDic =  Metodos.DiccionarioDeSinonimos(dicSimple);
		System.out.println("Valores y claves del Diccionario Sinonimo");
		Metodos.MostrarClaveValor(unionDic);
		System.out.println();		
	}
}
