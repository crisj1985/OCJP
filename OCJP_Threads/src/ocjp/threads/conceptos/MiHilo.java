package ocjp.threads.conceptos;

public class MiHilo extends Thread 
{
	public void run() 
	{
		//System.out.println("Mi Hilo "+Thread.currentThread().getName());
		for(int i =0;i<10;i++)
		{
			System.out.println("MI hilo"+Thread.currentThread().getName() + i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
			
	}
}
