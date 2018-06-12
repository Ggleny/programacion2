package implementations.arreglos;

import api.ConjuntoTDA;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @group: 16
 * @cost:
 * Inicializar: lineal
 * Agregar: constante
 * Sacar: constante
 * ConjuntoVacio: constante
 * Elegir: lineal
 * Pertenece: constante
 */
public class ConjuntoUA implements ConjuntoTDA {
	
	int [] vector;
	int cantidad;

	public void Inicializar() {
		vector = new int[100];
		cantidad=0;
		for (int i=0;i<100;i++)
			vector[i]=0;
	}

	public void Agregar(int x) {
		if(x<100 && vector[x]==0){
			vector[x]=1;
			cantidad++;
		}
	}

	public void Sacar(int x) {
		if(x<100 && vector[x]==1){
			vector[x]=0;
			cantidad--;
		}
	}

	public int Elegir() {
		int i;
		for(i=0; i<100 && vector[i]==0;i++);
		return i;
	}

	public boolean Pertenece(int x) {
		return (x<100 && vector[x]==1);
	}

	public boolean ConjuntoVacio() {
		return (cantidad==0);
	}

}
