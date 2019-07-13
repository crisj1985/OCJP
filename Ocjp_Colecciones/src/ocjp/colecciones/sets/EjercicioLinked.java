package ocjp.colecciones.sets;

import java.util.LinkedHashSet;
import java.util.Set;


public class EjercicioLinked {

	public static void main(String[] args) 
	{
		Set <String> lista= new LinkedHashSet<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("cuatro");
		lista.add("uno");
		lista.add("a");
		lista.add(null);
		
		System.out.println(lista);//.add("uno") +" "+ lista.add("dos")+" "+lista.add("tres"));
//		System.out.println(lista.get(1));

	}

}
