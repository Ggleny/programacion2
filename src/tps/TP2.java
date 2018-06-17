package tps;

import api.ConjuntoTDA;
import implementations.arreglos.ConjuntoUniversal;
import implementations.listas.ConjuntoUniversalLD;


/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 */
@SuppressWarnings("unused")

public class TP2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Prueba Conjunto universal Array*/
		System.out.println("ConjuntoUniversal Arreglos");
		ConjuntoTDA conjuntoUniversal = new ConjuntoUniversal();
		conjuntoUniversal.Inicializar();
		//conjuntoUniversal.Agregar(2);
		conjuntoUniversal.Agregar(80);
		conjuntoUniversal.Agregar(10);
		conjuntoUniversal.Agregar(35);
		conjuntoUniversal.Sacar(10);
		System.out.println("Conjunto Vacio? "+conjuntoUniversal.ConjuntoVacio());
		System.out.println("80 pertenece ? "+conjuntoUniversal.Pertenece(80));
		System.out.println("82 pertenece ? "+conjuntoUniversal.Pertenece(82));
		System.out.println("Se elije: "+conjuntoUniversal.Elegir());
		
		/*Prueba Conjunto Universal Lista*/
		System.out.println("\n\nConjuntoUniversal Lista Dinamica");
		ConjuntoTDA conjuntoUniversalLD = new ConjuntoUniversalLD();
		conjuntoUniversalLD.Inicializar();
		//conjuntoUniversal.Agregar(2);
		conjuntoUniversalLD.Agregar(80);
		conjuntoUniversalLD.Agregar(10);
		conjuntoUniversalLD.Agregar(35);
		conjuntoUniversalLD.Sacar(10);
		System.out.println("Conjunto Vacio? "+conjuntoUniversalLD.ConjuntoVacio());
		System.out.println("80 pertenece ? "+conjuntoUniversalLD.Pertenece(80));
		System.out.println("82 pertenece ? "+conjuntoUniversalLD.Pertenece(82));
		System.out.println("Se elije: "+conjuntoUniversalLD.Elegir());
		
		/* */
		
	}
}
