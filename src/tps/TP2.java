package tps;

import api.ConjuntoTDA;
import implementaciones.arreglos.ConjuntoUniversal;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 */
@SuppressWarnings("unused")

public class TP2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConjuntoTDA conjuntoUniversal = new ConjuntoUniversal();
		conjuntoUniversal.Inicializar();
		//conjuntoUniversal.Agregar(2);
		conjuntoUniversal.Agregar(80);
		conjuntoUniversal.Agregar(10);
		conjuntoUniversal.Agregar(35);
		System.out.println("Cantidad "+conjuntoUniversal.ConjuntoVacio());
		System.out.println("80 pertenece ? "+conjuntoUniversal.Pertenece(80));
		System.out.println("82 pertenece ? "+conjuntoUniversal.Pertenece(82));
		System.out.println("Se elije: "+conjuntoUniversal.Elegir());
		
		
	}
}
