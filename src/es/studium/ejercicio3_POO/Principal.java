package es.studium.ejercicio3_POO;

import java.time.LocalDateTime;

public class Principal
{
	
	public static void main(String[] args)
	{
		//Primero se crean los pedidos, ya que no están unidos a ninguna clase.
		Pedido pedido1 = new Pedido(8056, LocalDateTime.now(), "PED-01");
		Pedido pedido2 = new Pedido(4023, LocalDateTime.now(), "PED-02");
		Pedido pedido3 = new Pedido(2850, LocalDateTime.now(), "PED-03");
		Pedido pedido4 = new Pedido(5001, LocalDateTime.now(), "PED-04");
		Pedido pedido5 = new Pedido(2211, LocalDateTime.now(), "PED-05");
		
		//Luego se crean las facturas, que están unidos a la clase Pedido.
		Factura factura1 = new Factura(10, "FAC-01", pedido1);
		Factura factura2 = new Factura(20, "FAC-02", pedido2);
		Factura factura3 = new Factura(30, "FAC-03", pedido3);
		Factura factura4 = new Factura(40, "FAC-04", pedido4);
		Factura factura5 = new Factura(50, "FAC-05", pedido5);
		
		
		System.out.println("La factura con id: "+factura1.getIdFactura()+" y número: "+factura1.getNumeroFactura()
				+" está asociada al Pedido de referencia: "+factura1.getPedido().getReferencia()
				+" emitido con fecha: "+factura1.getPedido().getFecha());
		
		System.out.println("La factura con id: "+factura2.getIdFactura()+" y número: "+factura2.getNumeroFactura()
				+" está asociada al Pedido de referencia: "+factura2.getPedido().getReferencia()
				+" emitido con fecha: "+factura2.getPedido().getFecha());
		
		System.out.println("La factura con id: "+factura3.getIdFactura()+" y número: "+factura3.getNumeroFactura()
				+" está asociada al Pedido de referencia: "+factura3.getPedido().getReferencia()
				+" emitido con fecha: "+factura3.getPedido().getFecha());
		
		System.out.println("La factura con id: "+factura4.getIdFactura()+" y número: "+factura4.getNumeroFactura()
				+" está asociada al Pedido de referencia: "+factura4.getPedido().getReferencia()
				+" emitido con fecha: "+factura4.getPedido().getFecha());
		
		System.out.println("La factura con id: "+factura5.getIdFactura()+" y número: "+factura5.getNumeroFactura()
				+" está asociada al Pedido de referencia: "+factura5.getPedido().getReferencia()
				+" emitido con fecha: "+factura5.getPedido().getFecha());
				
		
		//Este syso está hecho a través del toString, que previamente debe estar en las dos clases.
		System.out.println(factura1.toString());
	}

}
