package es.studium.ejercicio2_POO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{
		//Primero se crean los directores.
		Director director1 = new Director("Alejandro Amen�bar", LocalDate.of(1972, 3, 31), "Espa�ol"); //porque NO funciona, si se pone igual pero con constructor vac�o?
		System.out.println(director1.getFechaNacimiento()); //sale as�: 1972-3-31
		
		//Para dar formato a la fecha.
		
		//1. Indicar el formato que queremos dar a la fecha.
		DateTimeFormatter damosFormato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//2. Pasamos la fecha que queramos al formato indicado antes.
		LocalDate formatoFechaNacimiento1 = LocalDate.parse("31/03/1972", damosFormato1);
		
		//3. La mostramos por consola para comprobarlo. Dando el formato deseado, por si tenemos varios formatos.
		System.out.println(formatoFechaNacimiento1.format(damosFormato1));
		
		
		Director director2 = new Director("Pedro Almod�var", LocalDate.of(1972, 9, 25), "Espa�ol");
	
		Director director3 = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18), "Estadounidense");
		
		//Luego se crean las pel�culas que est�n unidas a la clase Director.
		Pelicula pelicula1 = new Pelicula("Abre los ojos", 1997, 117.0f, director1);
		Pelicula pelicula2 = new Pelicula("Jurassic Park", 1993, 121.50f, director3);
		Pelicula pelicula3 = new Pelicula("Volver", 2006, 120.30f, director2);
		Pelicula pelicula4 = new Pelicula("E.T.", 1982, 114.40f, director3);
		Pelicula pelicula5 = new Pelicula("La Fortuna", 2021, 130.0f, director1);
		
		
		System.out.println("El t�tulo de la pel�cula "+pelicula1.getTitulo()+", rodada en el a�o "
				+pelicula1.getAnio()+", con una duraci�n de "+pelicula1.getDuracion()+", fue dirigida por el director "
				+pelicula1.getDirector().getNombre()+", de nacionalidad "+pelicula1.getDirector().getNacionalidad()+".");
		
		System.out.println("El t�tulo de la pel�cula "+pelicula2.getTitulo()+", rodada en el a�o "
				+pelicula2.getAnio()+", con una duraci�n de "+pelicula2.getDuracion()+", fue dirigida por el director "
				+pelicula2.getDirector().getNombre()+", de nacionalidad "+pelicula2.getDirector().getNacionalidad()+".");
		
		System.out.println("El t�tulo de la pel�cula "+pelicula3.getTitulo()+", rodada en el a�o "
				+pelicula3.getAnio()+", con una duraci�n de "+pelicula3.getDuracion()+", fue dirigida por el director "
				+pelicula3.getDirector().getNombre()+", de nacionalidad "+pelicula3.getDirector().getNacionalidad()+".");
		
		System.out.println("El t�tulo de la pel�cula "+pelicula4.getTitulo()+", rodada en el a�o "
				+pelicula4.getAnio()+", con una duraci�n de "+pelicula4.getDuracion()+", fue dirigida por el director "
				+pelicula4.getDirector().getNombre()+", de nacionalidad "+pelicula4.getDirector().getNacionalidad()+".");
		
		System.out.println("El t�tulo de la pel�cula "+pelicula5.getTitulo()+", rodada en el a�o "
				+pelicula5.getAnio()+", con una duraci�n de "+pelicula5.getDuracion()+", fue dirigida por el director "
				+pelicula5.getDirector().getNombre()+", de nacionalidad "+pelicula5.getDirector().getNacionalidad()+".");
		
		
		//Este syso est� hecho a trav�s del toString, que previamente debe estar en las dos clases.
		System.out.println(pelicula1.toString());
	}

}
