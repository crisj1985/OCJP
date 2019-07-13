package ocjp.estaticos;

public class ComntadorConBloque 
{
	public ComntadorConBloque()
	{
		System.out.println("contador sin parametros");
	}
	
	{
		System.out.println("bloque no estatico");
	}
	
	static
	{
		System.out.println("bloque estatico");
	}

	public static void main(String[] args) 
	{
		
		ComntadorConBloque c1 = new ComntadorConBloque();
		ComntadorConBloque c2 = new ComntadorConBloque();
		ComntadorConBloque c3 = new ComntadorConBloque();
	}

}
