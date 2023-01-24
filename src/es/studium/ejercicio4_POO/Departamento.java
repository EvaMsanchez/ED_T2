package es.studium.ejercicio4_POO;

public class Departamento
{
	private int idDepartamento;
	private String nombreDepartamento;
	private CentroTrabajo centroTrabajo;
	
	//Constructor vacío o por defecto.
	public Departamento()
	{
		idDepartamento = 0;
		nombreDepartamento = "";
		centroTrabajo = new CentroTrabajo();
	}
	
	//Constructor parámetros menos idDepartamento.
	public Departamento (String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}
	
	//Constructor por parámetros.
	public Departamento (int idDepartamento, String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}

	
	//Métodos.
	public int getIdDepartamento()
	{
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento()
	{
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento)
	{
		this.nombreDepartamento = nombreDepartamento;
	}

	public CentroTrabajo getCentroTrabajo()
	{
		return centroTrabajo;
	}

	public void setCentroTrabajo(CentroTrabajo centroTrabajo)
	{
		this.centroTrabajo = centroTrabajo;
	}

}
