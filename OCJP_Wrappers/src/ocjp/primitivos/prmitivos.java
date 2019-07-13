package ocjp.primitivos;

public class prmitivos {

	public static void main(String[] args) 
	{
		byte var1;
		short var2;
		int var31=200;
		int var32=0xc8;
		int var33=0310;
		long var4;
		System.out.println(var31 +" "+var32 +" "+var33);
		
		byte byte1=0;
		short short1=128;
		byte1=(byte)short1;
		int i1=123;
//		char c1=i1;
		long i2=200;
//		char c2=i2;
		char c3 = 123;
		long l1=c3;
		
			 int x=0;
			 Integer z=3; //al se una clase internamente realiza z=new Integer (3); z sigue siendo una referencia
			 x=z;//internamente realiza z.intValue() como z es Integer llama a su metodo intValue() para sacar su valor decimal
		 System.out.println(x);
		 Integer w = null;
		 if(w>10)//da NullPointerException ya que w intenta obetener su valor decimal por intValue() pero w es null
			 System.out.println("");
		 
		 
		System.out.println(byte1);
		
	}

}
