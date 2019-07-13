package ocjp.excepciones.conceptos;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		

	}
	public void metodo1() //throws IOException 
	{
			try 
			{
				File f = new File("Archivo1.txt");
				f.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
	public void metodo2() throws IOException 
	{
			
				File f = new File("Archivo1.txt");
				f.createNewFile();
			
	}

}
