package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedido;

public class PedidoService {


	ArrayList<Pedido> pedidos=new ArrayList<>();

	public void guardarPedido(String producto,Date fecha, double precio) {

		pedidos.add(new Pedido(producto,fecha,precio));


	}
	public Pedido pedidoMasReciente() {
		Date fecha=new Date(0);
		Pedido pedido=null;
				for(Pedido p: pedidos) {
				if (p.getFecha().after(fecha))	{
					fecha=p.getFecha();
					pedido=p;
				}
					
				}
			return pedido;		
	}
		public Pedido[] todos()	{
			Pedido[] resultado=new Pedido[pedidos.size()];
			for(int i=0;i<pedidos.size();i++) {
				resultado[i]=pedidos.get(i);
			}
		
	}
	
				
			
}
