package ocjp.imports.estaticos;

import com.sun.xml.internal.fastinfoset.sax.Properties;
public class ImportarEstaticos 
{
	
	public static void main (	String args[])
	{
		java.util.Properties p = System.getProperties();
		String valor=System.getProperty("prop1");
		System.out.println(p);
		System.out.println(valor);
	}

}
