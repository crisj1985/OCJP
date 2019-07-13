package OCJP.HERENCIA.CONCEPTOS;

public class Test_Casting {

	public static void main(String[] args) 
	{
		AdminAnimal aa1 = new AdminAnimal();
		Animal a1 = aa1.buscar(1);
		Perro p1 = (Perro)aa1.buscar(100); //no compila retorna Animal en buscar
		p1.ladrar();
		

	}

}
