package ocjp.genericos.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal 
{
	public static void main ()
	{
		Animal [] animales=new Animal[3];
		animales[0]=new Perro();
		animales[1]=new Gato();
		animales[3]= new Animal();
		
		List <Animal> animales2 = new ArrayList<Animal>();
		animales2.add(new Animal());
		animales2.add(new Perro());
		animales2.add(new Gato());
		
		Perro [] perros= {new Perro(),null,null};
		List<Perro> listaPerros= new ArrayList<Perro>();
		animales=perros;
//		animales2=listaPerros;//en genericos deben ser del mismo tipo
		List<Object> obj = new ArrayList<Object>();
//		m1(perros);  -->> debe llamar al mismo tipo de lista
//		m1(obj); -->> debe llamar al mismo tipo de lista
		m1(animales2);
		
		}
	public static void m1(List<Animal> animal)
	{
		
	}

}
