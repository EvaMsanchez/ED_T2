package es.studium.ejemploRefactorizacion;

public class Refactorizacion2
{

	private static final String ES = " es ";
	private static final String TEXTO = "El factorial de "; //extraemos una constante global: se puede utilizar en toda la clase
															// no se puede extraer una constante local
	public static void main (String [] args) 
	{
		int numero = 3;
		
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
		
		numero = 5;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	}
	
	public static double calcularFactorial(double n) 
	{
		if (n == 0) 
		{
			return 1;
		} 
		
		else 
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
