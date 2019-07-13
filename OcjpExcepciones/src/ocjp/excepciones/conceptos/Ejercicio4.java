package ocjp.excepciones.conceptos;


public class Ejercicio4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	public void metodo1(int x) throws Exception   
	{
		if(x<0)
			throw new Exception("Valor Incorrecto");
	}
	public void metodo2(int x)  
	{
		if(x<0)
			throw new IllegalArgumentException ("Valor Incorrecto");
	}
	public void metodo3(int x)   
	{
		try 
		{
			if(x<0)
				throw new Exception("Valor Incorrecto");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
