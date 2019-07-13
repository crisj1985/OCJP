package ocjp.enums;

import TamanioVaso.TamanioVaso;

//3.	Crear una clase Dispensador, con el m�todo llenarVaso que recibe un par�metro de tipo Vaso y se encarga de colocar 
//l�quido en el vaso (modifica el valor del atributo cantidadLiquido) bajo la siguiente l�gica:
//Si el tamanio del vaso es grande, llenar el vaso a su capacidad m�xima.
//Si el tamanio del vaso es MEDIANO, llena el vaso hasta la mitad de su capacidad.
//Si el tamanio del vaso es PEQUENIO, llena los 3/4 de la capacidad del vaso.
//NOTA: La capacidad del vaso se recupera del atributo capacidad que est� dentro del atributo tamanio de la clase Vaso.
public class Dispensador 
{
	public void llenarVaso(Vaso vs)
	{
		if (vs.tamanio==TamanioVaso.GRANDE) 
		{
			vs.cantidadLiquido=TamanioVaso.GRANDE.getCapacidad();
		} 
		else if (vs.tamanio==TamanioVaso.MEDIANO)
		{
			vs.cantidadLiquido=TamanioVaso.MEDIANO.getCapacidad()/2;
		} 
		else if (vs.tamanio==TamanioVaso.PEQUENIO)
		{
			vs.cantidadLiquido=TamanioVaso.PEQUENIO.getCapacidad()*3/4;

		}


	}
	public static void main(String[] args) 
	{
		Dispensador ds = new Dispensador();
		Vaso vs =new Vaso(TamanioVaso.PEQUENIO);
		ds.llenarVaso(vs);
		System.out.println(vs.cantidadLiquido);

	}


}
