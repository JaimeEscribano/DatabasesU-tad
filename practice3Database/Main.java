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