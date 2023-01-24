package es.studium.ejercicio4_POO;

public class CentroTrabajo
{
	private int idCentroTrabajo;
	private String nombreCentroTrabajo;
	private String direccionCentroTrabajo;
	
	//Constructor vac�o o por defecto.
	public CentroTrabajo()
	{
		idCentroTrabajo = 0;
		nombreCentroTrabajo = "";
		direccionCentroTrabajo = "";
	}
	
	//Constructor par�metros menos idCentroTrabajo.
	public CentroTrabajo (String nombreCentroTrabajo, String direccionCentroTrabajo)
	{
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}
	
	//Constructor por par�metros.
	public CentroTrabajo (int idCentroTrabajo, String nombreCentroTrabajo, String direccionCentroTrabajo)
	{
		this.idCentroTrabajo = idCentroTrabajo;
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}
	
	
	//M�todos.
	public int getIdCentroTrabajo()
	{
		return idCentroTrabajo;
	}

	public void setIdCentroTrabajo(int idCentroTrabajo)
	{
		this.idCentroTrabajo = idCentroTrabajo;
	}

	public String getNombreCentroTrabajo()
	{
		return nombreCentroTrabajo;
	}

	public void setNombreCentroTrabajo(String nombreCentroTrabajo)
	{
		this.nombreCentroTrabajo = nombreCentroTrabajo;
	}

	public String getDireccionCentroTrabajo()
	{
		return direccionCentroTrabajo;
	}

	public void setDireccionCentroTrabajo(String direccionCentroTrabajo)
	{
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}
		
}
