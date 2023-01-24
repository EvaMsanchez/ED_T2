package es.studium.ejercicio03_Refactorizacion;

public class Vehiculo
{
	protected String matricula;  //? preguntar protected.
	protected int numeroRuedas;

	//Constructor vac�o.
	public Vehiculo()
	{
		matricula = "";
		numeroRuedas = 0;
	}

	//Constructor por par�metros.
	public Vehiculo (String matricula, int numeroRuedas)
	{
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
	}

	
	//M�todos.
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