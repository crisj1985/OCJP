package ocjp.genericos;

public class ClaseB <T extends Number>  
{	
	public static void main (String args[])
	{
		ClaseB<String> cb1=new ClaseB<String>();//el tipo de generico debe extender de Number
		ClaseB<Integer> cb2=new ClaseB<Integer>();
		ClaseB<String> cb3 = new ClaseB<String>();//el tipo de generico debe extender de Number
		
	} 
	public <T extends Number> T m3(T t1)
	{
		return null;
	}
}
