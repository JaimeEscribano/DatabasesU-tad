//Main from the practice3Database

package practice3Database;

import practice3Database.Personaje.Raza;

public class Main {
	static void main(){
	Raza raza = Raza.ORCO;
	Personaje jaime = new Personaje("Jaime", 21, raza);
	
	Personaje isidoro = new Personaje();
	String paImprimir;
	
	paImprimir = new String(jaime.toString());
	
	System.out.println(paImprimir);
	
	paImprimir = isidoro.toString();
	
	System.out.println(paImprimir);
}
}

//Class Personaje for the exercise (Must be executed on a diferent document
package practice3Database;

public class Personaje {
	enum Raza {HUMANO,ELFO,ORCO,ENANO}
	String nombre;
	int id;
	int puntuacion;
	Raza raza;
	
	//Default constructor
	public Personaje(){
		nombre = new String("Isidoro");
		id = 0;
		puntuacion = 0;
		raza = Raza.HUMANO;
	}
	
	
	public Personaje(String newNombre, int identificador, Raza nuevaRaza){	
		nombre = newNombre;
		id = identificador;
		raza = nuevaRaza;
	}
	
	public String toString(){
		String result = new String("Nombre: " + this.nombre + " Id: " + this.id +  " Raza: " + this.raza);
		return result;
	}
}
