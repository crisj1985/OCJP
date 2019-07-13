package ocjp.threads.comunicacion;

public class ElOtro extends Thread 
{
	private Maria maria;
	public ElOtro (Maria maria)
	{
		this.maria=maria;
	}
	public void run ()
	{
		System.out.println("El otro empieza su dia");
		try 
		{
			synchronized (maria) 
			{
				System.out.println("El espera a Maria");
				maria.wait();
			}
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Pepito va a la casa");
	}
}
