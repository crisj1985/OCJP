package ocjp.enums;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		DiasEnum dia=DiasEnum.MIERCOLES;
		System.out.println(dia.ordinal());
		System.out.println(dia.name());
		DiasEnum [] arreglo=dia.values();
		for(DiasEnum d : arreglo)
			System.out.println(d.name());
		

	}

	
	{
		

	}

}
