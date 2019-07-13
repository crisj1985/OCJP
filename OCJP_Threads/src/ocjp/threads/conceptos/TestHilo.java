package ocjp.threads.conceptos;

public class TestHilo {

	public static void main(String[] args) {
		System.out.println("Inicio");
		MiHilo mh = new MiHilo();
		//mh.run();//con run no se crea otro hilo 
		mh.start();//con start se crea un nuevo hilo donde se ejecuta el codigo de run (asincrona)
				//System.out.println("Principal "+mh.currentThread().getName());
		for(int i =0;i<10;i++)
		{
			System.out.println("Principal"+Thread.currentThread().getName() + i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Fin");

	}

}
