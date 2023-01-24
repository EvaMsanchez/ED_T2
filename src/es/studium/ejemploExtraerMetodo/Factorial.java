package es.studium.ejemploExtraerMetodo;

public class Factorial
{

	public static void main(String[] args)
	{
		int numero = 3;
		calcularFactorial(numero);
	}

	public static void calcularFactorial(int numero)
	{
		int contador = 1; // Seleccionamos desde esta línea
		int resultado = 1;
		
		while (contador <= numero)
		{
			resultado = resultado * contador;
			contador++;
		} // Hasta esta línea
	}

}
