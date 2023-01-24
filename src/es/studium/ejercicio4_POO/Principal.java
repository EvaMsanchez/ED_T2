package es.studium.ejercicio4_POO;

public class Principal
{

	public static void main(String[] args)
	{
		//Primero se crean los centros de trabajo, ya que no están unidos a ninguna clase.
		CentroTrabajo centro1 = new CentroTrabajo(01, "Centro Integral de Desarrollo", "C/Libertad, 2. Sevilla");

		//Segundo se crean los departamentos, que están unidos a la clase CentroTrabajo.
		Departamento departamento1 = new Departamento(01, "Administración", centro1);
		Departamento departamento2 = new Departamento(02, "Desarrollo web", centro1);
		Departamento departamento3 = new Departamento(03, "Diseño gráfico", centro1);
		
		//Por último se crean los empleados, que están relacionados con la clase Departamento que a su vez está relacionada con CentroTrabajo.
		Empleado empleado1 = new Empleado(05, "Eva", "Sánchez López", departamento2);
		Empleado empleado2 = new Empleado(10, "María", "Rodríguez González", departamento1);
		Empleado empleado3 = new Empleado(02, "Marcos", "Pérez García", departamento2);
		Empleado empleado4 = new Empleado(14, "Jose", "Hurtado Cabrero", departamento3);
		Empleado empleado5 = new Empleado(07, "Inés", "Hernández Jiménez", departamento3);
		
		
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
