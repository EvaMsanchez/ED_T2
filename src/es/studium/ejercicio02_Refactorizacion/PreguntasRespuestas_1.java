package es.studium.ejercicio02_Refactorizacion;

import java.util.Scanner;

public class PreguntasRespuestas_1
{

	private static final String EN_QUE_CURSO_ESTAS = "¿En qué curso estás?";
	private static final String CUANTOS_ANOS_TIENES = "¿Cuántos años tienes?";
	private static final String COMO_TE_LLAMAS = "¿Cómo te llamas?";

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		preguntar(COMO_TE_LLAMAS);  //Extraer como constante.
		String nombre = reponder(teclado);
		
		preguntar(CUANTOS_ANOS_TIENES);
		String edad = reponder(teclado);
		
		preguntar(EN_QUE_CURSO_ESTAS);
		String curso = reponder(teclado);
		
		mensaje(nombre, edad, curso);
		teclado.close();
	}

	public static void preguntar(String pregunta)
	{
		System.out.println(pregunta);
	}

	public static String reponder(Scanner teclado)
	{
		return teclado.nextLine();
	}
	
	public static void mensaje(String nombre, String edad, String curso) 
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}

}
