package ocjp.colecciones.mapas;

import java.util.Map;
import java.util.TreeMap;

public class EjercicioTreeMap {

	public static void main(String[] args) 
	{
		Map <String,Integer> mapa= new TreeMap<String,Integer>();
		mapa.put("uno", 40);
		mapa.put("tres", 50);
		mapa.put("B", 30);
		mapa.put("A", 10);
		mapa.put("C", 20);
		mapa.put("C", null);
		
		
		System.out.println(mapa);
		int x=mapa.get("A");
		System.out.println(x);

	}

}
