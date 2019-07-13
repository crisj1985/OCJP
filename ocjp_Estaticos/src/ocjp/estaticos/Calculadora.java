package ocjp.estaticos;

public class Calculadora {

	public static void main(String[] args) 
	{
		Calculadora cal=new Calculadora();
		//cal.sumar(5, 8) compila y ejecuta  , en ejecucion se transforma en Calculadora.sumar(5, 8)
		System.out.println(cal.sumar(5, 8));
	
		//System.out.println(Calculadora.sumar(4, 6)); 

	}
	public static int sumar(int a, int b)
	{
		
		return a+b;
	}
}
