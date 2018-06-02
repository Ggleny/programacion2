package utilidades;

import implementations.arreglos.DicSimpleA;

public class PruebaDiccionario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicSimpleA diccionario = new DicSimpleA();
		diccionario.InicializarDiccionario();
		diccionario.Agregar(22, 33);
		diccionario.Agregar(1, 11);
		diccionario.Agregar(34, 11);
		diccionario.Agregar(22, 5);
		
		diccionario.mostrar();
		diccionario.Eliminar(1);
		System.out.println("Recupero: "+diccionario.Recuperar(34));
		diccionario.mostrar();
	}
} 

//PruebaDiccionario.run();


