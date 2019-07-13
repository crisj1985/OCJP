package ocjp.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileReader fr=new FileReader("archivo1.txt");
		File f=new File("archivo2.txt");
		f.createNewFile();
		FileReader fr2=new FileReader(f);
		int x;
		while((x=fr2.read())!=-1)
		{
		System.out.print((char)x);
		}
	}
}
