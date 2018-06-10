package tps;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.DiccionarioSimpleTDA;
import implementations.listas.DicMultipleL;
import implementations.listas.DicSimpleL;
import utilities.Metodos;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 */
@SuppressWarnings("unused")

public class TP3 {
	
	public static void main(String[] args) {
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
		Metodos.mostrarClaveValor(unionDic);
		
		System.out.println("Claves del Diccionario 1");
		Metodos.mostrarClaveValor(dic1);
		System.out.println("Claves del Diccionario 2");
		Metodos.mostrarClaveValor(dic2);
		
		/* Prueba Union Diccionario Multiple  5.1  b)*/
		System.out.println();System.out.println("Ejercicio 5.1 b"); System.out.println();
		unionDic =  Metodos.UnionClavesDic(dic1,dic2);
		System.out.println("Valores y claves del Diccionario UnionClavesDic");
		Metodos.mostrarClaveValor(unionDic);
		System.out.println();
		/*System.out.println("Claves del Diccionario 1");
		Metodos.mostrarClaveValor(dic1);
		System.out.println("Claves del Diccionario 2");
		Metodos.mostrarClaveValor(dic2);*/
		

		/* Prueba Union Diccionario Multiple  5.1  c)*/
		System.out.println();System.out.println("Ejercicio 5.1 c"); System.out.println();
		unionDic =  Metodos.InterseccionClaves(dic1,dic2);
		System.out.println("Valores y claves del Diccionario InterseccionClaves");
		Metodos.mostrarClaveValor(unionDic);
		System.out.println();
		
		/* Prueba Union Diccionario Multiple  5.1  d)*/
		System.out.println();System.out.println("Ejercicio 5.1 d"); System.out.println();
		unionDic =  Metodos.InterseccionClavesValores(dic1,dic2);
		System.out.println("Valores y claves del Diccionario InterseccionClavesValores");
		Metodos.mostrarClaveValor(unionDic);
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
		unionDic =  Metodos.diccionarioDeSinonimos(dicSimple);
		System.out.println("Valores y claves del Diccionario Sinonimo");
		Metodos.mostrarClaveValor(unionDic);
		System.out.println();
		
		
		
		
	}
}