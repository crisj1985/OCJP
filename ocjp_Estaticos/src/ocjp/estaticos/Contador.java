package ocjp.estaticos;

public class Contador {
	private int valor;
	private static int valorEstatico;

	public static void main(String[] args)
	{
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		c1.incrementar();
		c2.incrementar();
		c2.incrementar();
		c2.incrementar();
		System.out.println(c1.valor);
		System.out.println(valorEstatico);
	}
	public void incrementar()
		{
				valor++;
				valorEstatico++;
		}

	public static void incrementar2()
	{
		Contador c3 = new Contador();
			c3.valor++;
			valorEstatico++;
	}

}
