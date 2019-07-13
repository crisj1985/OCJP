package OCJP.HERENCIA.CONCEPTOS;

public class Test_Admin {

	public static void main(String[] args) 
	{
	AdminAnimal aa1=new AdminAnimal();//el metodo adormecer ejecuta el codigo dependiedndo del tipo de objeto al que apunta su argumento
	Perro p1 = new Perro();
	//Animal a1 = new Animal();
	Gato g1 = new Gato();
	aa1.adormecer(p1);
	//aa1.adormecer(a1);
	aa1.adormecer(g1);
	}

}
