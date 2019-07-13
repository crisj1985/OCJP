package ocjp.colecciones.sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class EjercicioTreeSet {

	public static void main(String[] args) 
	{
		Set <String> lista= new TreeSet<String>();
		lista.add("a");
		lista.add("A");
		lista.add(".");
		lista.add("1");
		lista.add("uno");
		lista.add("a");
//		lista.add(null);
		
		System.out.println(lista);//.add("uno") +" "+ lista.add("dos")+" "+lista.add("tres"));
//		System.out.println(lista.get(1));

	}

}
