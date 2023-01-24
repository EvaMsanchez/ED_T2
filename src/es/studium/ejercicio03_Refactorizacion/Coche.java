package es.studium.ejercicio03_Refactorizacion;

public class Coche extends Vehiculo //Superclase o clase padre: veh�culo.
{
	private Conductor conductor = new Conductor();

	//Constructor vac�o.
	public Coche()
	{
		super();
		conductor.setNombreConductor("");
		conductor.setCarnetConductor("");
	}

	//Constructor por par�metros.
	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas)
	{
		super(matricula, numeroRuedas);
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setCarnetConductor(carnetConductor);
	}

	
	//M�todos.
	public String getNombreConductor()
	{
		return conductor.getNombreConductor();
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.conductor.setNombreConductor(nombreConductor);
	}

	public String getCarnetConductor()
	{
		return conductor.getCarnetConductor();
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.conductor.setCarnetConductor(carnetConductor);
	}

	public String getDetalles()
	{
		return "Coche [matricula=" + matricula + ", nombreConductor=" + conductor.getNombreConductor() + ", carnetConductor="
				+ conductor.getCarnetConductor() + "]";
	}
	
}