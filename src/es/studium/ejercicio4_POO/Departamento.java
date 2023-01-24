package es.studium.ejercicio4_POO;

public class Departamento
{
	private int idDepartamento;
	private String nombreDepartamento;
	private CentroTrabajo centroTrabajo;
	
	//Constructor vac�o o por defecto.
	public Departamento()
	{
		idDepartamento = 0;
		nombreDepartamento = "";
		centroTrabajo = new CentroTrabajo();
	}
	
	//Constructor par�metros menos idDepartamento.
	public Departamento (String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}
	
	//Constructor por par�metros.
	public Departamento (int idDepartamento, String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}

	
	//M�todos.
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
