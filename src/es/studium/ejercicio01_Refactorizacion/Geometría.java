package es.studium.ejercicio01_Refactorizacion;

public class Geometr�a
{

	private static final double PI = 3.14;  //Refactor Extract Constant: PI.

	public static void main(String[] args)
	{
		int radio = 13;  // Refactor Rename: radio del c�rculo.
		
		longitudCircunferencia(radio);  //Refactor Extract Method.
		areaCirculo(radio);
	}
	

	public static void areaCirculo(int radio) //por ser static solo puede llamarse por su nombre, sino es static
											 //hay que crear un objeto de esta clase para llamar a la funci�n.
											//Geometria g = new Geometria (); g.areaCirculo
	{
		double area = PI * radio * radio;
		
		System.out.println("La superficie del c�rculo es " + area);
	}

	
	public static void longitudCircunferencia(int radio)  //para llamarla desde otra clase cuando es static
														 //se llama a la clase Geometria.longitudCircunferencia
	{
		double longitud = 2 * PI * radio;
		
		System.out.println("El per�metro del c�rculo es " + longitud);
	}

}
