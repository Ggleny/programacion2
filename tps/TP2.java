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
public class TP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PilaLD pld = new PilaLD(); pld.InicializarPila();
		PilaLD paux = new PilaLD(); paux.InicializarPila();
		pld.Apilar(1); pld.Apilar(2); pld.Apilar(3); pld.Apilar(4); pld.Apilar(5);

		Metodos.CopiarPila(pld, paux);
		Metodos.MostrarPila(paux);

		Metodos.InvertirPila(paux);
		Metodos.MostrarPila(paux);
		
		System.out.println("La pila contiene " + Metodos.ContarPila(pld) + " elementos.");
		System.out.println("La suma de dichos elementos es igual a " + Metodos.SumarPila(pld) + ".");
		System.out.println("El promedio es de " + Metodos.PromedioPila(pld) + ".");

		ColaLD cld = new ColaLD(); cld.InicializarCola();
		ColaLD caux = new ColaLD(); caux.InicializarCola();

		Metodos.PasarPilaACola(pld, cld);
		Metodos.MostrarCola(cld);
		
		Metodos.CopiarCola(cld, caux);
		Metodos.MostrarCola(caux);
		
		while(!caux.ColaVacia()){
			caux.Desacolar();
		}
		caux.Acolar(1); caux.Acolar(2); caux.Acolar(3); caux.Acolar(2); caux.Acolar(1);
		System.out.println("caux es capicua? " + Metodos.ColaEsCapicua(caux));
		caux.Acolar(5); caux.Acolar(4); caux.Acolar(3); caux.Acolar(2); caux.Acolar(1);
		System.out.println("y ahora? " + Metodos.ColaEsCapicua(caux));
		
		System.out.println("cld se haya al final de caux? " + Metodos.CompararUltimo(caux, cld));
		
		while(!caux.ColaVacia()){
			caux.Desacolar();
		}
		Metodos.CopiarCola(cld, caux);
		Metodos.InvertirColaSP(caux);
		System.out.println("cld es la inversa de caux? " + Metodos.CompararInversion(cld, caux));

		ColaPrioridadLD cpda = new ColaPrioridadLD(); cpda.InicializarCola();
		ColaPrioridadLD cpao = new ColaPrioridadLD(); cpao.InicializarCola();

		cpda.AcolarPrioridad(10, 1); cpda.AcolarPrioridad(5, 3); cpda.AcolarPrioridad(8, 10);
		cpda.AcolarPrioridad(7, 6); cpda.AcolarPrioridad(10, 2);
		Metodos.MostrarColaConPrioridad(cpda);

		Metodos.CopiarColaConPrioridad(cpda, cpao);
		Metodos.MostrarColaConPrioridad(cpao);

		System.out.println("Son las colas con prioridad iguales? " + Metodos.CompararColasConPrioridad(cpda, cpao));
		
		Metodos.CombinarColasConPrioridad(cpao, cpda);
		Metodos.MostrarColaConPrioridad(cpao);
		
		System.out.println("Inicio de prueba de conjuntos");
		
		ConjuntoTDA conj1ld = new ConjuntoLD(); conj1ld.Inicializar();
		conj1ld.Agregar(2);conj1ld.Agregar(3);conj1ld.Agregar(4);conj1ld.Agregar(5);
		conj1ld.Agregar(8);conj1ld.Agregar(11);conj1ld.Agregar(1);conj1ld.Agregar(5);
		conj1ld.Agregar(9);conj1ld.Agregar(13);conj1ld.Agregar(7);conj1ld.Agregar(7);
		conj1ld.Agregar(15);conj1ld.Agregar(1);conj1ld.Agregar(10);conj1ld.Agregar(8);
		
		System.out.println("Muestro por pantalla el conjunto creado:");
		Metodos.MostrarConjunto(conj1ld);
		System.out.println("Muestro por pantalla el conjunto con 2 elementos menos:");
		conj1ld.Sacar(1);conj1ld.Sacar(2);
		Metodos.MostrarConjunto(conj1ld);
		
		System.out.println("Dejo el conjunto sin elementos y muestro por pantalla:");
		while(!conj1ld.ConjuntoVacio()){
			conj1ld.Sacar(conj1ld.Elegir());
		}
		Metodos.MostrarConjunto(conj1ld);
		
		conj1ld.Agregar(2);conj1ld.Agregar(3);conj1ld.Agregar(4);conj1ld.Agregar(5);
		conj1ld.Agregar(6);conj1ld.Agregar(7);conj1ld.Agregar(8);conj1ld.Agregar(9);
		System.out.println("Creo un nuevo conjunto y lo muestro por pantalla:");
		Metodos.MostrarConjunto(conj1ld);
		
		System.out.println("Muestro algún elemento del conjunto " + conj1ld.Elegir());
		
		ConjuntoTDA conj2ld = new ConjuntoLD(); conj2ld.Inicializar();
		Metodos.CopiarConjunto(conj1ld, conj2ld);
		
		System.out.println("Muestro la copia del conjunto anterior");
		Metodos.MostrarConjunto(conj2ld);
		
		conj1ld.Agregar(20);conj1ld.Agregar(10);conj1ld.Agregar(1);conj1ld.Agregar(13);
		conj1ld.Agregar(21);conj1ld.Agregar(11);conj1ld.Agregar(14);conj1ld.Agregar(12);
		
		System.out.println("Le agrego elementos al primer conjunto");
		Metodos.MostrarConjunto(conj1ld);
		
		System.out.println("Muestro por pantalla la union entre los dos conjuntos");
		ConjuntoTDA conjunionld = new ConjuntoLD(); conjunionld.Inicializar();
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conj1ld);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conj2ld);
		conjunionld = Metodos.Union(conj1ld, conj2ld);
		Metodos.MostrarConjunto(conjunionld);
		
		System.out.println("Muestro por pantalla la interseccion entre los dos conjuntos");
		ConjuntoTDA conjinterseccionld = new ConjuntoLD(); conjinterseccionld.Inicializar();
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conj1ld);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conj2ld);
		conjinterseccionld = Metodos.Interseccion(conj1ld, conj2ld);
		Metodos.MostrarConjunto(conjinterseccionld);
		
		System.out.println("Muestro por pantalla la diferencia entre los dos conjuntos");
		ConjuntoTDA conjdiferenciald = new ConjuntoLD(); conjdiferenciald.Inicializar();
		System.out.print("Conjunto 1: ");Metodos.MostrarConjunto(conj1ld);
		System.out.print("Conjunto 2: ");Metodos.MostrarConjunto(conj2ld);
		conjdiferenciald = Metodos.Diferencia(conj1ld, conj2ld);
		Metodos.MostrarConjunto(conjdiferenciald);
		
		conjdiferenciald = Metodos.Diferencia(conj2ld, conj1ld);
		Metodos.MostrarConjunto(conjdiferenciald);
		
		
		
		
		
	}
}
