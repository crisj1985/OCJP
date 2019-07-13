package ocjp.clase.inner;

public class Ejercicio1 
{
	ClaseInner.ClaseInterna interna;
	ClaseInner externa = new ClaseInner();
	interna = externa.new ClaseInterna();
	ClaseInner.ClaseInterna interna1 = new ClaseInner.ClaseInterna();
	ClaseInner.ClaseInterna interna2 = new ClaseInner().new ClaseInterna(); 
}
