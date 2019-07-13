package ocjp.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class TestProductorConsumidor {

	public static void main(String[] args) 
	{
		List <String> mensajes=new ArrayList<String>();
		Productor p1 = new Productor(mensajes);
		Consumidor c1= new Consumidor(mensajes);;
		p1.start();
		c1.start();

	}

}
