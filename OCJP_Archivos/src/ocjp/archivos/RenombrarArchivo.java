package ocjp.archivos;

import java.io.File;

public class RenombrarArchivo {

	public static void main(String[] args) 
	{
		File origen = new File("archivo1.txt");
		File destino = new File("archivo2.txt");
		origen.renameTo(destino);

	}

}
