package practice3Database;

public class Item {
	String nombre;
	int id;
	enum Tipo{ARMA, ARMADURA, POCION, NINGUNO}
	Tipo tipo;
	public Item()
	{
		nombre = new String("Vara de hemorroides");
		id = 289;
		tipo = Tipo.ARMA;
	}
	
	public Item(String name, int identifier, Tipo type)
	{
		nombre = name;
		id = identifier;
		tipo = type;
	}
	
	public String toString(){
		String result = new String("Nombre: " + this.nombre + " Id: " + this.id +  " Tipo: " + this.tipo);
		return result;
	}
}
