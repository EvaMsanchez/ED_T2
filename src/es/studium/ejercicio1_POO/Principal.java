package es.studium.ejercicio1_POO;

public class Principal
{

	public static void main(String[] args)
	{
		//Primero se crea el objeto de la clase que tiene sus atributos propios (no está unido a otra clase).
		Raza raza1 = new Raza ();
		raza1.setNombreRaza("GoldenRetriever");

		Raza raza2 = new Raza ();
		raza2.setNombreRaza("Bulldog");
		
		Raza raza3 = new Raza ();
		raza3.setNombreRaza("Galgo");
		
		//Ahora se crea el perro que está unido a la clase Raza.
		Perro perro1 = new Perro (raza1, 50.0f, 6, "dorado");  //Dato float, para darle valor también se pone "f" al final.
		Perro perro2 = new Perro (raza2, 35.0f, 3, "negro");
		Perro perro3 = new Perro (raza2, 25.4f, 2, "marrón");
		Perro perro4 = new Perro (raza3, 55.0f, 7, "blanco");
		Perro perro5 = new Perro (raza3, 35.5f, 1, "chocolate");
		
		
		System.out.println("La raza del perro1 es: "+perro1.getRaza().getNombreRaza()+", su tamaño es: "
				+perro1.getTamano()+", su edad es: "+perro1.getEdad()+" y es de color: "+perro1.getColor()+".");
		
		System.out.println("La raza del perro2 es: "+perro2.getRaza().getNombreRaza()+", su tamaño es: "
				+perro2.getTamano()+", su edad es: "+perro2.getEdad()+" y es de color: "+perro2.getColor()+".");
		
		System.out.println("La raza del perro3 es: "+perro3.getRaza().getNombreRaza()+", su tamaño es: "
				+perro3.getTamano()+", su edad es: "+perro3.getEdad()+" y es de color: "+perro3.getColor()+".");
		
		System.out.println("La raza del perro4 es: "+perro4.getRaza().getNombreRaza()+", su tamaño es: "
				+perro4.getTamano()+", su edad es: "+perro4.getEdad()+" y es de color: "+perro4.getColor()+".");
		
		System.out.println("La raza del perro5 es: "+perro5.getRaza().getNombreRaza()+", su tamaño es: "
				+perro5.getTamano()+", su edad es: "+perro5.getEdad()+" y es de color: "+perro5.getColor()+".");
		
		
		//Este syso está hecho a través del toString, que previamente debe estar en las dos clases.
		System.out.println(perro1.toString());
	}

}
