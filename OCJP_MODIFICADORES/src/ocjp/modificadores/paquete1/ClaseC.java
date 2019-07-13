package ocjp.modificadores.paquete1;

public class ClaseC extends ClaseA
{
	public void metodo1()
		{
			metodoProtected();
			ClaseA ca1 = new ClaseA();
			ca1.metodoDefalut();
			ca1.metodoProtected();
			ca1.metodoPublic();
		}
}
