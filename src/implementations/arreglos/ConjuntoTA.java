package implementations.arreglos;

import api.ConjuntoTDA;


public class ConjuntoTA implements ConjuntoTDA {
	
	int [] vector;
	int cantidad;
	
	public void Inicializar() {
		vector = new int[100];
		cantidad=0;
	}

	public void Agregar(int x) {
		boolean existe = false;
		for(int i = 0; i<cantidad && !existe; i++)
			existe = (vector[cantidad]==x);
		if(!existe){
			vector[cantidad]=x;
			cantidad++;
		}
	}

	public void Sacar(int x) {
		boolean encontrado = false;
		for(int i = 0;i<cantidad && !encontrado; i++){
			if (vector[i]==x){
				vector[i]=vector[cantidad-1];
				cantidad--;
				encontrado=true;
			}
		}
	}

	public int Elegir() {
		return vector[0];
	}

	public boolean Pertenece(int x) {
		boolean encontrado = false;
		for(int i = 0;i<cantidad && !encontrado; i++)
			encontrado = (vector[i]==x);
		return encontrado;
	}

	public boolean ConjuntoVacio() {
		return (cantidad == 0);
	}

}
