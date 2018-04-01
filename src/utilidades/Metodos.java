package utilidades;

import api.ColaTDA;
import api.PilaTDA;
import implementaciones.arreglos.PilaTF;

public class Metodos {
	public static void PasarPila(PilaTDA origen, PilaTDA destino){
		while(!origen.PilaVacia()){
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}
	
	public static void CopiarPila(PilaTDA origen, PilaTDA destino){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		PasarPila(origen, auxiliar);
		while(!auxiliar.PilaVacia()){
			origen.Apilar(auxiliar.Tope());
			destino.Apilar(auxiliar.Tope());
			auxiliar.Desapilar();
		}
	}
	
	public static void InvertirPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		PilaTDA auxiliar2 = new PilaTF();
		auxiliar.InicializarPila();
		auxiliar2.InicializarPila();
		PasarPila(origen,auxiliar);
		PasarPila(auxiliar,auxiliar2);
		PasarPila(auxiliar2,origen);		
	}
	
	public static int ContarPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		CopiarPila(origen, auxiliar);
		int contador = 0;
		while(!auxiliar.PilaVacia()){
			auxiliar.Desapilar();
			contador++;
		}
		return contador; 
	}
	
	public static int SumarPila(PilaTDA origen){
		PilaTDA auxiliar = new PilaTF();
		auxiliar.InicializarPila();
		CopiarPila(origen,auxiliar);
		int sumador = 0;
		while(!auxiliar.PilaVacia()){
			sumador += auxiliar.Tope();
			auxiliar.Desapilar();
		}
		return sumador;
	}
	
	public static float PromedioPila(PilaTDA origen){
		return (float)SumarPila(origen)/ContarPila(origen);
	}
	
	public static void PasarColaAPila(ColaTDA c,PilaTDA p) {
		while(!c.ColaVacia()) {
			p.Apilar(c.Primero());
			c.Desencolar();
		}
		
	}
	
	public static void PasarPilaACola(PilaTDA p, ColaTDA c) {
		while (!p.PilaVacia()) {
			c.Acolar(p.Tope());
			p.Desapilar();
		}
	}
	
	public static void InvertirCola(ColaTDA c) {
		int x;
		x = c.Primero();
		c.Desencolar();
		if(!c.ColaVacia()) {
			InvertirCola(c);
		}
		c.Acolar(x);
	}
}
