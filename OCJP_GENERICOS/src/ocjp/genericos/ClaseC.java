package ocjp.genericos;

public class ClaseC {

	public <T > void m2(T t1)
	{
		
	}
	public <T extends Number> T m3(T t1)
	{
		return null;
	}
	
	public static void main(String[] args) {
		ClaseC o1 = new ClaseC();
		o1.m2("");
		o1.m3(1);

	}

}
