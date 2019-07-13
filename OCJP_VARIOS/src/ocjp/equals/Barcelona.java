package ocjp.equals;

public class Barcelona 
{
	private boolean hazaniaPlata;

	public boolean isHazaniaPlata() {
		return hazaniaPlata;
			}
	
	public boolean equals(Object o)
	{
		Barcelona x =(Barcelona) o;
		return this.hazaniaPlata==x.hazaniaPlata;
	}

	public void setHazaniaPlata(boolean hazaniaPlata) {
		this.hazaniaPlata = hazaniaPlata;
	}
	public static void main(String[] args) 
	{
		Barcelona a1 = new Barcelona();
		Barcelona a2 = new Barcelona();
		if(a1==a2)
			System.out.println("Iguales");
		if(a1.equals(a2))
			System.out.println("=");
		System.out.println(a1.getClass());

	}

	
}
