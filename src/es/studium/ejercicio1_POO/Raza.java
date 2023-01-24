package es.studium.ejercicio1_POO;

public class Raza
{
	private String nombreRaza;
	
	//Constructor vacío.
	public Raza()
	{
		nombreRaza = "";
	}
	
	//Constructor por parámetros.
	public Raza (String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	
	//Métodos.
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	
	//Source --> Generate toString()...
	//Para generar el syso aquí y en la clase principal no hace falta hacerlo, te devuelve los datos según están aquí.
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}
	
}
