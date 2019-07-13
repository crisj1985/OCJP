package ocjp.clase.inner;

public class ClaseInner {

	private int valor;
	public class ClaseInterna 
	{

		public void incrementar()
		{
			valor++;
			System.out.println("METODO1");
			
		}

	}
	public void metodo1()
	 {
		ClaseInterna ci = new ClaseInterna();
	 }

}
