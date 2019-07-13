package ocjp.threads.comunicacion;

public class InnerThread {

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable()
		{
			public void run ()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		r1.run();
//		r1.start();

	}

}
