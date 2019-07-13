package ocjp.genericos.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class ClaseComodines extends Animal 
{
	public static void main ()
	{
		Animal [] animales=new Animal[3];
		animales[0]=new Perro();
		animales[1]=new ClaseComodines();
		animales[3]= new Animal();
		
		List <Animal> animales2 = new ArrayList<Animal>();
		animales2.add(new Animal());
		animales2.add(new Perro());
		animales2.add(new ClaseComodines());
		
		Perro [] perros= {new Perro(),null,null};
		List<Perro> listaPerros= new ArrayList<Perro>();
		animales=perros;
//		animales2=listaPerros;//en genericos deben ser del mismo tipo
		List<Object> obj = new ArrayList<Object>();
//		m1(perros);  -->> debe llamar al mismo tipo de lista
//		m1(obj); -->> debe llamar al mismo tipo de lista
		m1(animales2);
		
		m2(listaPerros);  
		m2(obj); 
		m2(animales2);
		
		
		m3(listaPerros);  
		m3(obj); 
		m3(animales2);
		
		m4(listaPerros);  
		m4(obj); 
		m4(animales2);
		
		m5(listaPerros);  
		m5(obj); 
		m5(animales2);
		
		}
	public static void m1(List<Animal> animal)
	{
		animal.add(new Perro());
		animal.add(new Animal());
		animal.add(null);
	}
	public static void m2(List<? extends Animal> animal)
	{
		animal.add(new Perro());
		animal.add(new Animal());
		animal.add(null);
		animal.add(new Object());
	}
	public static void m3(List<? super Animal> animal)
	{
		animal.add(new Perro());
		animal.add(new Animal());
		animal.add(null);
		animal.add(new Object());
	}
	public static void m4(List<?> animal)
	{
		animal.add(new Perro());
		animal.add(new Animal());
		animal.add(null);
		animal.add(new Object());
	}
	public static void m5(List<Object> animal)
	{
		animal.add(new Perro());
		animal.add(new Animal());
		animal.add(null);
		animal.add(new Object());
}
}
