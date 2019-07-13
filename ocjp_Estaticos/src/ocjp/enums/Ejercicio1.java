package ocjp.enums;
 class DiaSemana
{
	public static final int Lunes=1;
	public static final int Sabado=6;
}
public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		validarDia(5);
		validarDia1(5); 
		validarDia2(-10); 
		validarDia3 (DiasEnum.SABADO);
	}
	public static void validarDia (int dia)
	{
		if(dia==6)
		{
			System.out.println("Fin de semana");
		}
		else
		{
			System.out.println("Dia laborable");
		}
	}
	public static void validarDia1 (int dia)
	{
		//DiaSemana ds = new DiaSemana();
		if(dia==DiaSemana.Sabado)
		{
			System.out.println("Fin de semana");
		}
		else
		{
			System.out.println("Dia laborable");
		}
	}
	public static void validarDia2 (int dia)
	{
		//DiaSemana ds = new DiaSemana();
		if(dia==Dias.Martes )
		{
			System.out.println("Fin de semana");
		}
		else
		{
			System.out.println("Dia laborable");
		}
	}
	public static void validarDia3 (DiasEnum dia)
	{
		//DiaSemana ds = new DiaSemana();
		if(dia==DiasEnum.SABADO )
		{
			System.out.println("Fin de semana");
		}
		else
		{
			System.out.println("Dia laborable");
		}
	}
}
