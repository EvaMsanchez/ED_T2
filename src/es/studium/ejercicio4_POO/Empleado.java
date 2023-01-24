package es.studium.ejercicio4_POO;

public class Empleado
{
	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidosEmpleado;
	private Departamento departamento;
	
	//Constructor vac�o o por defecto.
	public Empleado()
	{
		idEmpleado = 0;
		nombreEmpleado = "";
		apellidosEmpleado = "";
		departamento = new Departamento();
	}
	
	//Constructor par�metros menos idEmpleado.
	public Empleado (String nombreEmpleado, String apellidosEmpleado, Departamento departamento)
	{
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
		this.departamento = departamento;
	}
	
	//Constructor por par�metros.
	public Empleado (int idEmpleado, String nombreEmpleado, String apellidosEmpleado, Departamento departamento)
	{
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
		this.departamento = departamento;
	}

	
	//M�todos.
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidosEmpleado()
	{
		return apellidosEmpleado;
	}

	public void setApellidosEmpleado(String apellidosEmpleado)
	{
		this.apellidosEmpleado = apellidosEmpleado;
	}

	public Departamento getDepartamento()
	{
		return departamento;
	}

	public void setDepartamento(Departamento departamento)
	{
		this.departamento = departamento;
	}

}
