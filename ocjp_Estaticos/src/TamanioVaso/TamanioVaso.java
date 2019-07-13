package TamanioVaso;

public enum TamanioVaso 
{
	GRANDE(32),MEDIANO(16) , PEQUENIO(8) ;
	int capacidad;
	 TamanioVaso (int capacidad)
	{
		this.capacidad=capacidad;
		
	}
	 public int getCapacidad()
		{
			return capacidad;

		}



}
