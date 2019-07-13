package com.properties.testProperties;

import java.util.Properties;

public class ImportarEstaticos 
{
	
	public static void main (	String args[])
	{
		java.util.Properties p = System.getProperties();
		String valor=System.getProperty("prop1");
//		System.out.println(p);
		System.out.println(valor);
		Properties o = System.getProperties();
		String valor1=(String)p.get("prop2");
		
	}

}
