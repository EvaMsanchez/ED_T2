package es.studium.ejercicio02_Refactorizacion;

import java.util.Scanner;

public class PreguntasRespuestas
{
	//Refactor Convert Local Variable to Field: extraer variable global.
	private static String preguntaNombre = "�C�mo te llamas?"; 		//En azul cuando es atributo de clase (global). 
	private static String preguntaEdad = "�Cu�ntos a�os tienes?";  //Si es private solo se puede utilizar en esta clase.
	private static String preguntaCurso = "�En qu� curso est�s?"; //Public para utilizarla en otras clases.
															  
															 
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nombre = preguntaNombreUsuario(teclado);  //Extraer m�todo.
		
		String edad = preguntaEdadUsuario(teclado);
		
		String curso = preguntaCursoUsuario(teclado);
		
		mensaje(nombre, edad, curso);  //Extraer otro m�todo.
		teclado.close();
	}

	public static String preguntaCursoUsuario(Scanner teclado)
	{
		System.out.println(preguntaCurso);
		String curso = teclado.nextLine();
		return curso;
	}

	public static String preguntaEdadUsuario(Scanner teclado)
	{
		System.out.println(preguntaEdad);
		String edad = teclado.nextLine();
		return edad;
	}

	public static String preguntaNombreUsuario(Scanner teclado)  //El m�todo.
	{
		System.out.println(preguntaNombre);
		String nombre = teclado.nextLine();
		return nombre;
	}

	public static void mensaje(String nombre, String edad, String curso) //Si no tiene static hay que crear un objeto (objeto.funci�n)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " a�os y est�s en " + curso);
	}

}

/*	
 	1. Refactor Rename.
 	2. Extraer variable local de las cadenas del syso.
 	3. Extraer la variable local, como atributo de clase global (el syso).
 	4. Extraer m�todos.
 	
 */
