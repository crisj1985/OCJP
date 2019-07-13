package ocjp.ejercicio;

import java.util.List;

public class Productor extends Thread
{
	List <String> mensajes;
	
	public Productor(List <String> msj)
	{
		mensajes=msj;
		
	}
	
	public void run ()
	{
		for(int i=1;i<11;i++)
		{
			mensajes.add("Mensaje "+i);
			System.out.println("Se agrega un mensaje");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
