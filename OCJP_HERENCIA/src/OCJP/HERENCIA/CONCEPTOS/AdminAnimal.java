package OCJP.HERENCIA.CONCEPTOS;

public class AdminAnimal 
{
	public void adormecer(Animal a) 
	{
		a.dormir();
	}
	public Animal buscar (int x)
	{
		if(x==1)
			return new Perro();
		else
			return new Gato();
	}

}
