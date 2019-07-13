package ocjp.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivo 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("archivo1.txt");
		FileWriter fw1=new FileWriter(new File("archivo2.txt"));
		fw1.write("linea1\n");
		fw1.write("linea2");
		fw1.flush();
		fw1.close();
	}
}
