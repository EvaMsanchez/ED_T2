package es.studium.ejemploRefactorizacion;

public class Refactorizacion1
{

	private static int numero; //declarada como atributo de clase, nos sirve para toda la clase no solo local: 
							  //se puede utilizar tambien en la función

	public static void main (String [] args) 
	{
		//constructor por defecto (const. vacío) que nos proporciona Java, cuando no tenemos implementado el constructor
		Refactorizacion1 refactor = new Refactorizacion1 ();
		
		numero = 3;
		
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
		
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
	}
	
	//static: cuando no se pone se crea el objeto
	public double calcularFactorial(double n) 
	{
		if (n == 0) 
		{
			return 1;
		} 
		
		else 
		{
			double resultado = n * calcularFactorial(n - 1); //la función se llama a ella misma
			return resultado;
		}
	}

}
