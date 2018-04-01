import api.PilaTDA;
import implementaciones.arreglos.PilaTF;

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
	public static int  main (String[] args) {
		System.out.print("Hola Test :)");
		PilaTDA p = new PilaTF();
		p.InicializarPila();
		p.Apilar(5);
		p.Apilar(34);
		while(!p.PilaVacia()) {
			System.out.println(p.Tope());
			p.Desapilar();
		}
		return 0;
	}
}
