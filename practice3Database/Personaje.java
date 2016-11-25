package practice3Database;

import practice3Database.Item;
import practice3Database.Item.Tipo;

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
		Item item = new Item();
	}
	
	
	public Personaje(String newNombre, int identificador, Raza nuevaRaza){	
		nombre = newNombre;
		id = identificador;
		raza = nuevaRaza;
		String itemName = "Brisingr";
		int itemId = 299;
		Tipo itemTipo = Tipo.ARMADURA;
		Item item = new Item(itemName, itemId, itemTipo);
	}
	
	public String toString(){
		String result = new String("Nombre: " + this.nombre + " Id: " + this.id +  " Raza: " + this.raza);
		return result;
	}
}
