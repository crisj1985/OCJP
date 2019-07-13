package ocjp.colecciones.listas;

import java.util.ArrayList;
import java.util.List;

public class EjercicioArrayList {

	public static void main(String[] args) 
	{
		List <String> lista= new ArrayList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("uno");
		lista.add(null);
//		System.out.println(lista);//.add("uno") +" "+ lista.add("dos")+" "+lista.add("tres"));
		System.out.println(lista.get(1));

	}

}
