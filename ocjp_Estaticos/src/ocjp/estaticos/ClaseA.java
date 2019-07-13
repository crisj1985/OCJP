package ocjp.estaticos;

public class ClaseA 
{
	static int x;
	int y;
	public ClaseA(int y)
	{
		x++;
		y++;
	}
	public static void main(String[] args) 
	{
		System.out.println("x:"+x+" y:");
	}
}
