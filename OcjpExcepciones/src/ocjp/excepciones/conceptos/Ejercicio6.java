package ocjp.excepciones.conceptos;


public class Ejercicio6 
{
	public static void main(String args [])
	{
		try 
		{
			/*String a=null;
			a.toString();*/
			int[]a = new int[2];
			a[5]=10;
			
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println("NPE");
		}
		catch (RuntimeException e) 
		{
			System.out.println("RTE");
		}
		catch (Exception e) 
		{
			System.out.println("EXCEPTION");
		}
		
		finally
		{
			System.out.println("FINALLY");
		}
		

	}

}
