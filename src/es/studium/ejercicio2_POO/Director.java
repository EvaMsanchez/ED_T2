package es.studium.ejercicio2_POO;

import java.time.LocalDate;

public class Director
{
	private String nombre;
	private LocalDate fechaNacimiento;  //Importar tipo LocalDate.
	private String nacionalidad;
	
	//Constructor vacío o por defecto.
	public Director()
	{
		nombre = "";
		fechaNacimiento = LocalDate.of(0, 0, 0);
		nacionalidad = "";
	}
	
	//Constructor por parámetros.  Se puede generar automáticamente --> Source --> Generate Constructor using Fields...
	public Director (String nombre, LocalDate fechaNacimiento, String nacionalidad)
	{
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}

	
	//Métodos.
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento()
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}

		
	//Source --> Generate toString()...
	//Para generar el syso aquí y en la clase principal no hace falta hacerlo, te devuelve los datos según están aquí.
	@Override
	public String toString()
	{
		return "Director [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad
				+ "]";
	}
	
}
