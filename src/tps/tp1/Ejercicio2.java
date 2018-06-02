package tps.tp1;

import api.PilaTDA;
import implementations.arreglos.PilaTF;
import utilidades.Metodos;

public class Ejercicio2 {
	public static void main(String[] args) {
		PilaTDA o = new PilaTF(), d = new PilaTF(),copia =  new PilaTF();
		o.InicializarPila();
		d.InicializarPila();
		copia.InicializarPila();
		o.Apilar(1);
		o.Apilar(2);
		o.Apilar(3);
		Metodos.CopiarPila(o,copia);
		Metodos.PasarPila(copia,o);
		Metodos.ContarPila(o);
		/*while(!d.PilaVacia()) {
			System.out.println();		
		}*/
	}
}
