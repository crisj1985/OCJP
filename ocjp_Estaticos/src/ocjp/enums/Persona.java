package ocjp.enums;

public class Persona 
{
	enum Genero
	{
		MASCULINO,FEMENINO

	}
	
	Genero generoPersona=Genero.MASCULINO;

}
class Estudiante
{
	Persona.Genero generoPersona=Persona.Genero.MASCULINO;

}

