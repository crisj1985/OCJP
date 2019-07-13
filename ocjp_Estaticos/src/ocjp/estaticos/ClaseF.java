package ocjp.estaticos;

public class ClaseF {
	static int x;
	int y;
	public ClaseF(int y)
	{
		x+=y;
		this.y=x++;
	}
	public static void main(String[] args) 
	{
		ClaseF cf1=new ClaseF(4);
		ClaseF cf2=new ClaseF(6);
		System.out.println("x:"+cf1.x+" y:"+cf1.y+" x:"+cf2.x+" y:"+cf2.y);	
	}
}
