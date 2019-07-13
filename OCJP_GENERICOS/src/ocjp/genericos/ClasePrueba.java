package ocjp.genericos;

public class ClasePrueba {

	public static void main(String[] args) 
	{
		ClaseA<String> g1 = new ClaseA<String>();
		g1.metodo1("a", "b");
		ClaseA<Integer> g2 = new ClaseA<Integer>();
		g2.metodo1(1, 2);
		ClaseA<Object> o1=new ClaseA<Object>();
		o1.metodo1(g1, g2);
		
	}

}
