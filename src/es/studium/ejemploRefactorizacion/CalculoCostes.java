package es.studium.ejemploRefactorizacion;

public class CalculoCostes
{
	//Constante
	private static final double SUELDO = 1200.0;


	public static void main(String[] args)
	{
		
		System.out.println(costeTrabajadores(50));
		
	}
	

	//Funcion
	public static double costeTrabajadores (int numeroTrabajadores)
	{
		return SUELDO * numeroTrabajadores;
	}
	
}
