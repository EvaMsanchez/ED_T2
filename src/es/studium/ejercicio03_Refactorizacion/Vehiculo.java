package es.studium.ejercicio03_Refactorizacion;

public class Vehiculo
{
	protected String matricula;  //? preguntar protected.
	protected int numeroRuedas;

	//Constructor vacío.
	public Vehiculo()
	{
		matricula = "";
		numeroRuedas = 0;
	}

	//Constructor por parámetros.
	public Vehiculo (String matricula, int numeroRuedas)
	{
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
	}

	
	//Métodos.
	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}

}