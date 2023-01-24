package es.studium.ejercicio2_POO;

public class Pelicula
{
	private String titulo;
	private int anio;
	private float duracion;
	private Director director;  //Est� unido a la clase Director.
	
	//Constructor vac�o.
	public Pelicula()
	{
		titulo = "";
		anio = 0;
		duracion = 0.0f;
		director = new Director();
	}
	
	//Constructor por par�metros.  Se puede generar autom�ticamente --> Source --> Generate Constructor using Fields...
	public Pelicula (String titulo, int anio, float duracion, Director director)
	{
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.director = director;
	}

	
	//M�todos.
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
	//Para generar el syso aqu� y en la clase principal no hace falta hacerlo, te devuelve los datos seg�n est�n aqu�.
	@Override
	public String toString()
	{
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", duracion=" + duracion + ", director=" + director
				+ "]";
	}
	
}
