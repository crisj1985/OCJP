package ocjp.colecciones.mapas;

import java.util.HashMap;
import java.util.Map;

public class EjercicioHashMap {

	public static void main(String[] args) 
	{
		Map <String,Integer> mapa= new HashMap<String,Integer>();
		mapa.put("tres", 50);
		mapa.put("B", 30);
		mapa.put("A", 10);
		mapa.put("C", 20);
		mapa.put("C", null);
		
		mapa.put("uno", 40);
		
		System.out.println(mapa);
		int x=mapa.get("A");
		System.out.println(x);

	}

}
