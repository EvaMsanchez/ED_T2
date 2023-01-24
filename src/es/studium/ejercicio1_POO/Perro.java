package es.studium.ejercicio1_POO;

public class Perro
{
	private Raza raza;  //Est� unido a la clase Raza.
	private float tamano;
	private int edad;
	private String color;
	
	//Constructor vac�o o por defecto.
	public Perro()
	{
		raza = new Raza();
		tamano = 0.0f;  //float
		edad = 0;
		color = "";
	}
	
	//Constructor por par�metros.  Se puede generar autom�ticamente --> Source --> Generate Constructor using Fields...
	public Perro (Raza raza, float tamano, int edad, String color)
	{
		this.raza = raza;
		this.tamano =  tamano;
		this.edad = edad;
		this.color = color;
	}

	
	//M�todos.
	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamano()
	{
		return tamano;
	}

	public void setTamano(float tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	
	//Source --> Generate toString()...
	//Para generar el syso aqu� y en la clase principal no hace falta hacerlo, te devuelve los datos seg�n est�n aqu�.
	@Override
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
