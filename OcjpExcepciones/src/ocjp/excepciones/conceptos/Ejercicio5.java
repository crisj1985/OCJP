package ocjp.excepciones.conceptos;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		
	}
	public void metodo1() throws CheckedExcepcion
	{
		
	}
	public void metodo2() throws UncheckedException
	{
		
	}
	public void metodo3(int x) throws CheckedExcepcion
	{
		if(x>100)
			throw new CheckedExcepcion();
	} 
	public void metodo4(int x)
	{
		if(x>100)
			throw new UncheckedException();
	} 
	public void metodo5() throws UncheckedException, CheckedExcepcion
	{
		
	}
	public void metodo4() throws Exception//ClassCastException
	{
		System.out.println("primero");
		throw new NullPointerException();
}
	public void metodo7() throws IOException{
		throw new FileNotFoundException();
}


}
