package ocjp.clase.inner;

public class ClaseExterna 
{
	public void metodo1()
	{
		class InnerLocal
		{
			public void metodo2()
			{
				
			}
		}
		InnerLocal il = new InnerLocal();
		
	}
	
}
