package ocjp.threads.comunicacion;

public class Pepito {

	public static void main(String[] args) 
	{
		
		Maria m1 = new Maria();
		ElOtro o = new ElOtro(m1);
		o.start();
		m1.start();
		try 
		{
			synchronized(m1)
			{
				System.out.println("Pepito inicia su dia");
				m1.wait();
//				m1.wait(2000);
			}
			
		} 
		catch (InterruptedException e) 
		{
						e.printStackTrace();
		}
		System.out.println("Pepito va a la casa");

	}

}
