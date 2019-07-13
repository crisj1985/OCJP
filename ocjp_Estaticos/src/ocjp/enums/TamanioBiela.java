package ocjp.enums;

public enum TamanioBiela 
{
	PERSONAL(100),JARRA(150),JIRAFA(200);
	int cantidadLiquido;
	private TamanioBiela(int cantidadLiquido)
	{
		this.cantidadLiquido=cantidadLiquido;

	}
	public int getCantidadLiquido()
	{
		return cantidadLiquido;

	}
}
