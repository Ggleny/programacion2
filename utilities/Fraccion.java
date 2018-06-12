package utilities;

import utilities.Fraccion;

/**
 * @author: Leto, Marcelo; Godoy Parise, Andres; Rodriguez Cachuan, Gleny
 * @definition: Clase encargada de trabajar con fracciones
 */
public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	/**
	 * @#setFraccion
	 * @Tarea: Asigna el numerador y denominador a una fraccion
	 * @Parametros: Dos enteros correspondientes al numerador y denominador, respectivamente
	 * @Devuelve: -
	 * @Precondicion: -
	 * @Postcondicion: Se tiene una fraccion definida
	 */	
	public void setFraccion (int x , int y){
		numerador = x;
		denominador = y;
	}
	
	/**
	 * @#getNumerador
	 * @Tarea: Permite saber cual es el valor del numerador
	 * @Parametros: -
	 * @Devuelve: un entero correspondiente al numerador
	 * @Precondicion: la fraccion debe estar definida
	 * @Postcondicion: -
	 */	
	public int getNumerador (){
		return numerador;
	}
	
	/**
	 * @#getDenominador
	 * @Tarea: Permite saber cual es el valor del denominador
	 * @Parametros: -
	 * @Devuelve: un entero correspondiente al denominador
	 * @Precondicion: la fraccion debe estar definida
	 * @Postcondicion: -
	 */	
	public int getDenominador (){
		return denominador;
	}
	
	/**
	 * @#Comparar
	 * @Tarea: compara dos fraccion
	 * @Parametros: recibe un elemento de tipo Fraccion para comparar
	 * @Devuelve: verdadero si son iguales; falso si no. (son iguales si sus numeradores 
	 * y sus denominadores son iguales, respectivamente)
	 * @Precondicion: ambas fracciones deben estar definidas
	 * @Postcondicion: -
	 */	
	public boolean Comparar (Fraccion otra){
		return ((this.numerador == otra.getNumerador())&&(this.denominador == otra.getDenominador()));
	}
	
	/**
	 * @#GetCadena
	 * @Tarea: expresar la fraccion como cadena
	 * @Parametros: -
	 * @Devuelve: un elemento de tipo string representando la fraccion
	 * @Precondicion: la fraccion debe estar definida
	 * @Postcondicion: -
	 */	
	public String GetCadena (){
		return (numerador + "/" + denominador);
	}
	
	/**
	 * @#sumar
	 * @Tarea: suma una fraccion a si misma
	 * @Parametros: un elemento de tipo fraccion
	 * @Devuelve: devuelve un elemento de tipo fraccion que es la suma de ambas fracciones
	 * @Precondicion: las fracciones deben estar definidas
	 * @Postcondicion: la fraccion habra modificado sus valores para contener el resultado de la suma
	 */	
	public Fraccion sumar (Fraccion otra){
		Fraccion resultado= new Fraccion();
		resultado.setFraccion((this.numerador * otra.denominador)+(this.denominador * otra.numerador), this.denominador * otra.denominador);
		return resultado;
	}
	
	/**
	 * @#Simplificar
	 * @Tarea: Simplifica una fraccion
	 * @Parametros: -
	 * @Devuelve: -
	 * @Precondicion: la fraccion debe estar definida
	 * @Postcondicion: se tiene la fraccion equivalente mas simplificada
	 */	
	public void Simplificar (){
		int i, max, min;
		if (numerador > denominador){
			for(i=denominador,max=numerador,min=denominador; i>1;i--){
				if (((max%i)==0)&&((min%i)==0)){
					max=max/i;
					min=min/i;
				}
			}
			numerador=max;
			denominador=min;
		}else{
			for(i=numerador,max=denominador,min=numerador; i>1;i--){
				if (((max%i)==0)&&((min%i)==0)){
					max=max/i;
					min=min/i;
				}
			}
			numerador=min;
			denominador=max;
		}
	}
	
}
