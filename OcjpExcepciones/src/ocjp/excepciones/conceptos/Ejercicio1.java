package ocjp.excepciones.conceptos;

import javax.print.DocFlavor.STRING;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		System.out.println("Inicio");
		//String b=null;
		//b.toString();
		try 
		{
			String a=null;
			a.toString();
			System.out.println("Linea 1");
		} 
		/*catch (Exception e) 
		{
			System.out.println("ENTRO AL CATCH");
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("ENTRO AL FINALLY");
		}
		
		System.out.println("Fin");
		
	}

}
