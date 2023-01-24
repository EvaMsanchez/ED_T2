package es.studium.ejercicio1_POO;

public class Raza
{
	private String nombreRaza;
	
	//Constructor vac�o.
	public Raza()
	{
		nombreRaza = "";
	}
	
	//Constructor por par�metros.
	public Raza (String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	
	//M�todos.
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	
	//Source --> Generate toString()...
	//Para generar el syso aqu� y en la clase principal no hace falta hacerlo, te devuelve los datos seg�n est�n aqu�.
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}
	
}
