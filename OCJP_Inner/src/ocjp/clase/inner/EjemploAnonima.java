package ocjp.clase.inner;


public class EjemploAnonima 
{

	
	public static void main(String[] args)  
	{
		String s="";
		ClaseA ca=new ClaseA()
		{
			public void metodo1(){
				System.out.println("MCA");
			}
			public void metodo2(){
				System.out.println("MDA");
			}
		}; 
		ca.metodo1();
		
	}
}
