package es.studium.ejercicio2_POO;

public class Pelicula
{
	private String titulo;
	private int anio;
	private float duracion;
	private Director director;  //Está unido a la clase Director.
	
	//Constructor vacío.
	public Pelicula()
	{
		titulo = "";
		anio = 0;
		duracion = 0.0f;
		director = new Director();
	}
	
	//Constructor por parámetros.  Se puede generar automáticamente --> Source --> Generate Constructor using Fields...
	public Pelicula (String titulo, int anio, float duracion, Director director)
	{
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.director = director;
	}

	
	//Métodos.
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAnio()
	{
		return anio;
	}

	public void setAnio(int anio)
	{
		this.anio = anio;
	}

	public float getDuracion()
	{
		return duracion;
	}

	public void setDuracion(float duracion)
	{
		this.duracion = duracion;
	}

	public Director getDirector()
	{
		return director;
	}

	public void setDirector(Director director)
	{
		this.director = director;
	}
	
	
	//Source --> Generate toString()...
	//Para generar el syso aquí y en la clase principal no hace falta hacerlo, te devuelve los datos según están aquí.
	@Override
	public String toString()
	{
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", duracion=" + duracion + ", director=" + director
				+ "]";
	}
	
}
