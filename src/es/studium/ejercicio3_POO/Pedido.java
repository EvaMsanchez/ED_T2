package es.studium.ejercicio3_POO;

import java.time.LocalDateTime;

public class Pedido
{
	private int idPedido;
	private LocalDateTime fecha;  //Importar.
	private String referencia;
	
	//Constructor vacío o por defecto.
	public Pedido()
	{
		idPedido = 0;
		fecha = LocalDateTime.now();
		referencia = "";		
	}
	
	//Constructor parámetros menos idPedido.
	public Pedido (LocalDateTime fecha, String referencia)
	{
		this.fecha = fecha;
		this.referencia = referencia;
	}
	
	//Constructor por parámetros.  Se puede generar automáticamente --> Source --> Generate Constructor using Fields...
	public Pedido(int idPedido, LocalDateTime fecha, String referencia)
	{
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;
	}

	
	//Métodos.
	public int getIdPedido()
	{
		return idPedido;
	}

	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
	}

	public LocalDateTime getFecha()
	{
		return fecha;
	}

	public void setFecha(LocalDateTime fecha)
	{
		this.fecha = fecha;
	}

	public String getReferencia()
	{
		return referencia;
	}

	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
	}

	
	//Source --> Generate toString()...
	//Para generar el syso aquí y en la clase principal no hace falta hacerlo, te devuelve los datos según están aquí.
	@Override
	public String toString()
	{
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", referencia=" + referencia + "]";
	}
	
}
