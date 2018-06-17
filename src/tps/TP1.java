/**
 * 
 */
package tps;

import api.PilaTDA;
import implementations.arreglos.ColaPI;
import implementations.arreglos.ColaPU;
import implementations.arreglos.ColaPrioridadAO;
import implementations.arreglos.ColaPrioridadDA;
import implementations.arreglos.PilaTF;
import implementations.arreglos.PilaTI;
import api.ColaTDA;
import api.ColaPrioridadTDA;
import utilities.Metodos;



/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 */
@SuppressWarnings("unused")
public class TP1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PilaTF ptf = new PilaTF(); ptf.InicializarPila();
		PilaTI pti = new PilaTI(); pti.InicializarPila();
		ptf.Apilar(1); ptf.Apilar(2); ptf.Apilar(3); ptf.Apilar(4); ptf.Apilar(5);

		Metodos.CopiarPila(ptf, pti);
		Metodos.MostrarPila(pti);

		Metodos.InvertirPila(pti);
		Metodos.MostrarPila(pti);
		
		System.out.println("La pila contiene " + Metodos.ContarPila(ptf) + " elementos.");
		System.out.println("La suma de dichos elementos es igual a " + Metodos.SumarPila(ptf) + ".");
		System.out.println("El promedio es de " + Metodos.PromedioPila(ptf) + ".");


		ColaPU cpu = new ColaPU(); cpu.InicializarCola();
		ColaPI cpi = new ColaPI(); cpi.InicializarCola();

		Metodos.PasarPilaACola(ptf, cpu);
		Metodos.MostrarCola(cpu);
		
		Metodos.CopiarCola(cpu, cpi);
		Metodos.MostrarCola(cpi);
		
		while(!cpi.ColaVacia()){
			cpi.Desacolar();
		}
		cpi.Acolar(1); cpi.Acolar(2); cpi.Acolar(3); cpi.Acolar(2); cpi.Acolar(1);
		System.out.println("cpi es capicua? " + Metodos.ColaEsCapicua(cpi));
		cpi.Acolar(5); cpi.Acolar(4); cpi.Acolar(3); cpi.Acolar(2); cpi.Acolar(1);
		System.out.println("y ahora? " + Metodos.ColaEsCapicua(cpi));
		
		System.out.println("cpu se haya al final de cpi? " + Metodos.CompararUltimo(cpi, cpu));
		
		while(!cpi.ColaVacia()){
			cpi.Desacolar();
		}
		Metodos.CopiarCola(cpu, cpi);
		Metodos.InvertirColaSP(cpi);
		System.out.println("cpu es la inversa de cpi? " + Metodos.CompararInversion(cpu, cpi));

		
		ColaPrioridadDA cpda = new ColaPrioridadDA(); cpda.InicializarCola();
		ColaPrioridadAO cpao = new ColaPrioridadAO(); cpao.InicializarCola();

		cpda.AcolarPrioridad(10, 1); cpda.AcolarPrioridad(5, 3); cpda.AcolarPrioridad(8, 10);
		cpda.AcolarPrioridad(7, 6); cpda.AcolarPrioridad(10, 2);
		Metodos.MostrarColaConPrioridad(cpda);

		Metodos.CopiarColaConPrioridad(cpda, cpao);
		Metodos.MostrarColaConPrioridad(cpao);

		System.out.println("Son las colas con prioridad iguales? " + Metodos.CompararColasConPrioridad(cpda, cpao));
		
		Metodos.CombinarColasConPrioridad(cpao, cpda);
		Metodos.MostrarColaConPrioridad(cpao);

	}

}
