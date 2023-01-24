package es.studium.ejercicio03_Refactorizacion;

public class Moto extends Vehiculo
{
	private String cilindrada;

	//Constructor vacío.
	public Moto()
	{
		super();
		this.cilindrada = "";
	}

	//Constructor por parámetros.
	public Moto(String matricula, int numeroRuedas, String cilindrada)
	{
		super(matricula, numeroRuedas);
		this.cilindrada = cilindrada;
	}

	
	//Métodos. Solo los nuevos incluidos.
	public String getCilindrada()
	{
		return cilindrada;
	}

	public void setCilindrada(String cilindrada)
	{
		this.cilindrada = cilindrada;
	}

}
