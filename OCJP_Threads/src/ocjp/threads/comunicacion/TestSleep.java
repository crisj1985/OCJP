package ocjp.threads.comunicacion;

public class TestSleep {

	public static void main(String[] args) 
	{
		System.out.println("Inicia");
		ThreadUno t1 = new ThreadUno();
		t1.start();
		//			t1.sleep(5000);//se duerme el main, duerme al hilo denode esta ejecutandose
		System.out.println(t1.currentThread().getName());
		System.out.println("Fin");
	}

}
