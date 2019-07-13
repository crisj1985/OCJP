package ocjp.primitivos;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		short s1=10;
		Ejercicio1.metodo1(s1);
		byte b1=10;
		Ejercicio1.metodo1(b1);

	}
	
	static void metodo1 (int a)
	{
		System.out.println("Int");	
	} 
	static void metodo1(short s)
	{
		System.out.println("Short");
	}
}
