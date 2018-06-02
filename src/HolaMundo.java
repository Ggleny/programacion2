import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import api.PilaTDA;
import implementations.arreglos.PilaTF;

/**
 * Interfaz completa con la documentacion, sino MAL
 * @autor: Gleny
 * @Definicion: HolaMundo
 **/
public class HolaMundo {
	
	/**
	 * @tarea
	 * @param
	 * @return
	 * @preCondition
	 */
	public static void main(String[] args) {
		PilaTDA p = new PilaTF();
		p.InicializarPila();
		p.Apilar(5);
		p.Apilar(34);
		while(!p.PilaVacia()) {
			//System.out.println(p.Tope());
			p.Desapilar();
		}
		
		
		System.out.println("Empieza sorteo de ITEMS Marketing");
		String[] alumnas = new String[5];
		ArrayList<Integer> TemasElegidos = new ArrayList<Integer>();   
		alumnas[0] = "Johana";
		alumnas[1] = "Maribel";
		alumnas[2] = "Maylen";
		alumnas[3] = "Sabrina";
		alumnas[4] = "Gleny";
		
		
		for (String nombre : alumnas) {
			//Seleccionando tema random
			int itemRamdom =  seleccionarTemasRandom(TemasElegidos);
			System.out.println("Alumna "+nombre +" TEMA: "+itemRamdom);
		}
		
	}
	private static int seleccionarTemasRandom(ArrayList<Integer> temas){
		Random randomGenerator = new Random();
		int random = 0;
		while (random==0) {
		    int aux = randomGenerator .nextInt(6);
		    if (!temas.contains(aux)) {
		    	random = aux;
		        temas.add(random);
		    }
		}
		return random;
	}
}


