package implementations.arreglos;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Implementacion de Diccionario, utilizando un arreglo de elementos donde 
 * cada uno de estos contiene una clave y un arreglo de valores.
 */

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * InicializarDiccionario: constante
 * Agregar: lineal
 * Eliminar: lineal
 * EliminarValor: lineal
 * Recuperar: lineal
 * Claves: lineal
 */
public class DicMultipleA implements DiccionarioMultipleTDA {
	
	class Elemento{
		int clave;
		int[] valores;
		int CantValores;
	}
	
	Elemento[] elementos;
	int cantClaves;

	public void InicializarDiccionario() {
		elementos = new Elemento[100];
		cantClaves=0;
	}

	public void Agregar(int clave, int valor) {
		int posicion = Clave2Indice(clave);
		if (posicion == 1) {
			posicion=cantClaves;
			elementos[posicion]= new Elemento();
			elementos[posicion].clave=clave;
			elementos[posicion].CantValores=0;
			elementos[posicion].valores= new int[100];
			cantClaves++;
		}
		Elemento elemen= elementos[posicion];
		int posV = Valor2Indice(elemen, valor);
		if (posV==-1) {
			elemen.valores[elemen.CantValores]=valor;
			elemen.CantValores++;
		}
	}

	private int Clave2Indice(int clave) {
		int i = cantClaves-1;
		while((i>0) &&(elementos[i].clave != clave))
			i--;
		return i;
	}
	
	public void Eliminar(int clave) {
		int pos = Clave2Indice(clave);
		if (pos!=-1) {
			elementos[pos]=elementos[cantClaves-1];
			cantClaves--;
		}
	}

	public void EliminarValor(int clave, int valor) {
		int posClave = Clave2Indice(clave);
		if (posClave != -1) {
			Elemento elementoE = elementos[posClave];
			int posV = Valor2Indice(elementoE,valor);
			if (posV != -1) {
				elementoE.valores[posV]=elementoE.valores[elementoE.CantValores-1];
				elementoE.CantValores--;
				if (elementoE.CantValores == 0)
					Eliminar(clave);
			}
		}

	}

	private int Valor2Indice(Elemento elemento, int valor) {
		int i =elemento.CantValores-1;
		while ((i>0) && (elemento.valores[i]!=valor))
			i--;
		return i;
	}
	
	public ConjuntoTDA Recuperar(int clave) {
		ConjuntoTDA conjunto = new ConjuntoTA ();
		conjunto.Inicializar();
		int posicion = Clave2Indice(clave);
		if ( posicion!= -1 ) {
			Elemento elemento = elementos[posicion];
			for(int i=0; i < elemento.CantValores;i++)
				conjunto.Agregar(elemento.valores[i]);
		}
		return conjunto;
	}

	public ConjuntoTDA Claves() {
		ConjuntoTDA conjunto= new ConjuntoTA();
		conjunto.Inicializar();
		for(int i=0; i< cantClaves;i++)
			conjunto.Agregar(elementos[i].clave);
		return conjunto;
	}

}
