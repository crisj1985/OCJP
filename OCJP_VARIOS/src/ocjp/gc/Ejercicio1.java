package ocjp.gc;

public class Ejercicio1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Garbage gc = new Garbage();
		gc=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("FIN");
	}
}
