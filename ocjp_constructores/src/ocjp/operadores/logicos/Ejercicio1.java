package ocjp.operadores.logicos;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		String a=null;
		validar(a);

	}
	public static void validar(String cadena) 
	{
		if(cadena!=null &&  cadena.length()>0)
			System.out.println("cadena valida");
		else
			System.out.println("cadena invalida");
		

	}

}
