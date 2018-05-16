package implementations.arreglos;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class DicSimpleA implements DiccionarioSimpleTDA {
	class Elemento{
		int clave;
		int valor;
	}
	Elemento[] elementos;
	int cant;
	
private int obtenerIndiceDeClave(int clave) {
		int i = cant - 1;
		while(i>=0 && elementos[i].clave!=clave) {
			i--;
		}
		return i;
			
	}
	
public void InicializarDiccionario() {
		cant=0;
		elementos  = new Elemento[100];

	}

public void Agregar(int clave, int valor) {
		int indice = obtenerIndiceDeClave(clave);
		System.out.println("indice: "+indice);
		if(indice==-1) {
			indice = cant;
			elementos[cant] = new Elemento();
			elementos[cant].clave = clave;
			cant++;
		}
		elementos[indice].valor = valor;
	}

public void Eliminar(int clave) {
		int indice = obtenerIndiceDeClave(clave);
		if(indice!=1) {
			//El ultimo lo corro hacia adelante;
			elementos[indice] = elementos[cant-1];
			cant--;
		}

	}

public int Recuperar(int clave) {
		return elementos[obtenerIndiceDeClave(clave)].valor;
	}

public ConjuntoTDA Claves() {
		ConjuntoTDA conjuntoClaves = new ConjuntoTA();
		conjuntoClaves.Inicializar();
		for(int i=0; i<cant; i++) {
			conjuntoClaves.Agregar(elementos[i].clave);
		}
		return conjuntoClaves;
	}

public void mostrar() {
		for(int i=0; i<cant; i++) {
			System.out.println("Clave: "+elementos[i].clave+" =>Valor: "+elementos[i].valor); 
		}
	}

}