package ocjp.archivos;

import java.io.File;
import java.io.IOException;

public class EjercicioCreacion {

	public static void main(String[] args) //throws IOException 
	{
		File f=new File("archivo1.txt");
		try {
			f.createNewFile();
			} catch (IOException e) {
			e.printStackTrace();
			}
		File c=new File("carpeta1");
		c.mkdir();
	}

}
