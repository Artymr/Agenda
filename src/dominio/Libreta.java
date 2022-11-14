package dominio;
import java.util.ArrayList;

public class Libreta{
	private ArrayList<Contacto> lista;
	public Libreta(){
		lista=new ArrayList<Contacto>();
	}
	public Libreta add(Contacto c){
		lista.add(c);
		return this;
	}
	public String toString(){
		String  cadena=""; //tambien podria ser: cadena=new String();
		for(Contacto c:lista);
			cadena+=c+"\n";
		return  cadena;
	}
}
