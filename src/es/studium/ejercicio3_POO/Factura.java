package es.studium.ejercicio3_POO;

public class Factura
{
	private int idFactura;
	private String numeroFactura;
	private Pedido pedido;
	
	//Constructor vacío o por defecto.
	public Factura()
	{
		idFactura = 0;
		numeroFactura = "";
		pedido = new Pedido();
	}
	
	//Constructor por parámetros.  Se puede generar automáticamente --> Source --> Generate Constructor using Fields...
	public Factura (int idFactura, String numeroFactura, Pedido pedido)
	{
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.pedido = pedido;
	}

	
	//Métodos.
	public int getIdFactura()
	{
		return idFactura;
	}

	public void setIdFactura(int idFactura)
	{
		this.idFactura = idFactura;
	}

	public String getNumeroFactura()
	{
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura)
	{
		this.numeroFactura = numeroFactura;
	}

	public Pedido getPedido()
	{
		return pedido;
	}

	public void setPedido(Pedido pedido)
	{
		this.pedido = pedido;
	}

	
	//Source --> Generate toString()...
	//Para generar el syso aquí y en la clase principal no hace falta hacerlo, te devuelve los datos según están aquí.
	@Override
	public String toString()
	{
		return "Factura [idFactura=" + idFactura + ", numeroFactura=" + numeroFactura + ", pedido=" + pedido + "]";
	}
	
}
