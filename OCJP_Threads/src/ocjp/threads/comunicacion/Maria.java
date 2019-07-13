package ocjp.threads.comunicacion;

public class Maria extends Thread 
{
	public void run ()
	{
		System.out.println("Maria inicia su dia");
		System.out.println("Maria en clases");
		for(int i=1;i<10;i++)
		{	
			try 
			{
				sleep(1000);
				System.out.println("Maria se duerme en clases zzz...zzz...");
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			if(i==5)
			{	synchronized(this)
				{
				notify();
				}
			}
		System.out.println("Maria sale de clases");
		System.out.println("Maria va a la casa");
		}
		
	}
}

