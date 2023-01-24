package es.studium.ejercicio3_POO;

public class Factura
{
	private int idFactura;
	private String numeroFactura;
	private Pedido pedido;
	
	//Constructor vac�o o por defecto.
	public Factura()
	{
		idFactura = 0;
		numeroFactura = "";
		pedido = new Pedido();
	}
	
	//Constructor por par�metros.  Se puede generar autom�ticamente --> Source --> Generate Constructor using Fields...
	public Factura (int idFactura, String numeroFactura, Pedido pedido)
	{
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.pedido = pedido;
	}

	
	//M�todos.
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
	//Para generar el syso aqu� y en la clase principal no hace falta hacerlo, te devuelve los datos seg�n est�n aqu�.
	@Override
	public String toString()
	{
		return "Factura [idFactura=" + idFactura + ", numeroFactura=" + numeroFactura + ", pedido=" + pedido + "]";
	}
	
}
