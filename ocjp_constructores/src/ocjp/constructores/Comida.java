package ocjp.constructores;

public class Comida 
{
	public Comida()
	{
		//this("");
		System.out.println("Huele a comida");
		//this("");
	}
	public Comida(String a)
	{
		System.out.println("Sobrecarga");
	}
	
	{
		System.out.println("Bloque de inicializacion 1");
	}
	{
		System.out.println("Bloque de inicializacion 2");
	}
	{
		System.out.println("Bloque de inicializacion 3");
	}
}
