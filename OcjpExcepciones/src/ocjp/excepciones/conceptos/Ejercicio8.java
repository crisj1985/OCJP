package ocjp.excepciones.conceptos;

import java.io.IOException;

public class Ejercicio8 
{
	public static void main(String[] args)  
	{
			try{
			new Ejercicio8().go();
			}
			catch (Error e)
			{System.out.println("ouch");}
			
	

		//new Ejercicio8().go();
	}

	void go() 
	{
		go();
	}
}
