package es.studium.ejercicio4_POO;

public class Principal
{

	public static void main(String[] args)
	{
		//Primero se crean los centros de trabajo, ya que no est�n unidos a ninguna clase.
		CentroTrabajo centro1 = new CentroTrabajo(01, "Centro Integral de Desarrollo", "C/Libertad, 2. Sevilla");

		//Segundo se crean los departamentos, que est�n unidos a la clase CentroTrabajo.
		Departamento departamento1 = new Departamento(01, "Administraci�n", centro1);
		Departamento departamento2 = new Departamento(02, "Desarrollo web", centro1);
		Departamento departamento3 = new Departamento(03, "Dise�o gr�fico", centro1);
		
		//Por �ltimo se crean los empleados, que est�n relacionados con la clase Departamento que a su vez est� relacionada con CentroTrabajo.
		Empleado empleado1 = new Empleado(05, "Eva", "S�nchez L�pez", departamento2);
		Empleado empleado2 = new Empleado(10, "Mar�a", "Rodr�guez Gonz�lez", departamento1);
		Empleado empleado3 = new Empleado(02, "Marcos", "P�rez Garc�a", departamento2);
		Empleado empleado4 = new Empleado(14, "Jose", "Hurtado Cabrero", departamento3);
		Empleado empleado5 = new Empleado(07, "In�s", "Hern�ndez Jim�nez", departamento3);
		
		
		System.out.println(empleado1.getNombreEmpleado()+" "+empleado1.getApellidosEmpleado()+", pertenece al departamento de "
		+empleado1.getDepartamento().getNombreDepartamento()+", del "+empleado1.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo()
		+", situado en "+empleado1.getDepartamento().getCentroTrabajo().getDireccionCentroTrabajo()+".");
		
		System.out.println(empleado2.getNombreEmpleado()+" "+empleado2.getApellidosEmpleado()+", pertenece al departamento de "
		+empleado2.getDepartamento().getNombreDepartamento()+", del "+empleado1.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo()
		+", situado en "+empleado2.getDepartamento().getCentroTrabajo().getDireccionCentroTrabajo()+".");
		
		System.out.println(empleado3.getNombreEmpleado()+" "+empleado3.getApellidosEmpleado()+", pertenece al departamento de "
		+empleado3.getDepartamento().getNombreDepartamento()+", del "+empleado3.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo()
		+", situado en "+empleado3.getDepartamento().getCentroTrabajo().getDireccionCentroTrabajo()+".");
		
		System.out.println(empleado4.getNombreEmpleado()+" "+empleado4.getApellidosEmpleado()+", pertenece al departamento de "
		+empleado4.getDepartamento().getNombreDepartamento()+", del "+empleado4.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo()
		+", situado en "+empleado4.getDepartamento().getCentroTrabajo().getDireccionCentroTrabajo()+".");
		
		System.out.println(empleado5.getNombreEmpleado()+" "+empleado5.getApellidosEmpleado()+", pertenece al departamento de "
		+empleado5.getDepartamento().getNombreDepartamento()+", del "+empleado5.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo()
		+", situado en "+empleado5.getDepartamento().getCentroTrabajo().getDireccionCentroTrabajo()+".");
	}

}
