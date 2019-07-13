package ocjp.gc;

public class Ejercicio2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Ejercicio2 gc = new Ejercicio2();
		gc.m2();
	}
	
	void m1 ()
	{
		Garbage gc1 = new Garbage();
		System.out.println("M1");
	}
	void m2 () throws InterruptedException
	{
		m1();
		System.gc();
		Thread.sleep(2000);
		System.out.println("M2");
	}
	
	
}
