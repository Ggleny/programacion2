package implementaciones.arreglos;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class DicSimpleA implements DiccionarioSimpleTDA {
	class Elemento{
		int clave;
		int valor;
	}
	Elemento[] elementos;
	int cant;
	/* (non-Javadoc)
	 * Se recorren las claves del diccionario de atras para adelante
	 * @retorna: la posicion del clave si existe y sino existe retorna -1;
	 * @preCondicion: El diccionario debe estar inicializado
	 */
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

	/* (non-Javadoc)
	 * @see api.DiccionarioSimpleTDA#Agregar()
	 */
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

	/* (non-Javadoc)
	 * @see api.DiccionarioSimpleTDA#Eliminar()
	 */
	public void Eliminar(int clave) {
		int indice = obtenerIndiceDeClave(clave);
		if(indice!=1) {
			//El ultimo lo corro hacia adelante;
			elementos[indice] = elementos[cant-1];
			cant--;
		}

	}

	/* (non-Javadoc)
	 * @see api.DiccionarioSimpleTDA#Recuperar()
	 */
	public int Recuperar(int clave) {
		return elementos[obtenerIndiceDeClave(clave)].valor;
	}

	/* (non-Javadoc)
	 * @see api.DiccionarioSimpleTDA#Claves()
	 */
	public ConjuntoTDA Claves() {
		ConjuntoTDA conjuntoClaves = new ConjuntoTA();
		conjuntoClaves.InicializarConjunto();
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
