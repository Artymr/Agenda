package interfaz;

public class Interfaz{
	public void procesarPeticion(String peticion, Libreta l){
		String[] p=peticion.split(" ");
		if(p[0].equal("add"))
			l.add(new Contacto(p[1],p[2]));
	}
}
