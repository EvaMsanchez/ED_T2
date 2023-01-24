package es.studium.ejercicio03_Refactorizacion;

public class Conductor
{
	private String nombreConductor;
	private String carnetConductor;

	public Conductor()
	{
	}

	
	//Métodos.
	public String getNombreConductor()
	{
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.nombreConductor = nombreConductor;
	}

	public String getCarnetConductor()
	{
		return carnetConductor;
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.carnetConductor = carnetConductor;
	}
	
}