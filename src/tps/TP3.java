package tps;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import implementations.listas.DicMultipleL;
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
		
	}
}
