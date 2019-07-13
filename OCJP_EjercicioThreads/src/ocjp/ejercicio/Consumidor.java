package ocjp.ejercicio;

import java.util.List;

public class Consumidor extends Thread 
{
	List<String> mensajes;
	
	public Consumidor(List <String> msj)
	{
		mensajes=msj;
		
	}
	public void run ()
	{
		
		for (int i=1;i<21;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(mensajes.size()>0)
			{
				mensajes.remove(0);
				System.out.println("Se retira un mensaje");
			}
			else
				System.out.println("No existen mensajes");
		}
	}
}
