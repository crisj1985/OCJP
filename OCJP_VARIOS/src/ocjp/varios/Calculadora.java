package ocjp.varios;

public class Calculadora {
	public int sumar (int a, int b)
	{
		return a+b;
	}
	public int sumar (int a, int b,int c)
	{
		return a+b+c;
	}
	public int sumar (int a, int b,int c,int d)
	{
		return a+b+c+d;
	}
	public int sumar (int[] numeros)
	{
		int resultado=0;
		for(int i=0;i<numeros.length;i++)
			resultado+=numeros[i];
		return resultado;
		
	}
	public int sumar1 (int ... numeros)
	{
		int resultado=0;
		for(int i=0;i<numeros.length;i++)
			resultado+=numeros[i];
		return resultado;
		
	}

	public static void main(String[] args) {
		int[] numeros={2,3,4,5};
		Calculadora o = new Calculadora();
		System.out.println(o.sumar1(numeros));
		int i=10;
		System.out.println(o.metodo1(i));

	}
	void metodo1 (int x)
	{
		System.out.println("Int");
	}
	void metodo1 (int ... x)
	{
		System.out.println("varargs");
	}

}
