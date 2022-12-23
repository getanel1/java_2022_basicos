package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;


public class PedidosMain {
	static PedidosService pedidosService=new PedidosService();


	public static void main(String[] args) {
		public static void main1(String[] args) {
			Scanner sc=new Scanner (System.in);
			int opcion;	
			do {
				mostrarMenu();
				try {	
					
				
				opcion=Integer.parseInt(sc.nextLine());
				switch(opcion) {
				case 1:
					grabarPedido();
					break;
				case 2:
					buscarPedidoMasReciente();
					break;
				case 3:
					mostrarPedidos();
					break;

				case 4:
					System.out.println("___Adios_____");
				    }
				}
			   catch(NumberFormatException ex) {
					System.out.println("Debes elegir opcion correcta ");
					opcion=0;//para que vuelva a generar el bucle
			   }
			}while (opcion!=4);
         

		}
		static void mostrarMenu() {
			System.out.println("1.-Nuevo pedido");
			System.out.println("2.-Pedido mas reciente ");
			System.out.println("3.-Datos de los pedidos");
			System.out.println("4.-Salir");
		}


		static void grabarPedido() {
			Scanner sc=new Scanner(System.in);
			//para el parseado de fechas
			SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
			String producto;
			Date fecha;
			double precio;
			System.out.println("Introduce producto");
			producto=sc.nextLine();
			System.out.println("Introduce fecha (dia/mes/año)");
			try {
			    fecha=format.parse(sc.nextLine());
			    System.out.println("Introduce precio");
			    precio=Double.parseDouble(sc.nextLine());
			    pedidosService.guardarPedido(producto, fecha, precio);

		}
			catch(Parsexception ex) {
				System.out.println("La fecha no es válida y el pédido no se guardará");
			}
		}
		static void buscarPedidoMasReciente() {
			Pedido pedido=pedidosService.pedidoMasReciente();
			System.out.println("Producto: "+pedido.getProducto());
			System.out.println("Fecha: "+pedido.getFecha());
			System.out.println("Precio: "+pedido.getPrecio());
		}
		static void mostrarPedidos() {
			Pedido[] todos=pedidosService.todos();
			for (Pedido p: todos) {
				System.out.println("Producto: "+ p.getProducto());
				System.out.println("Fecha: "+p.getFecha());
				System.out.println("Precio: "+p.getPrecio());
			}
		}
	}
		
				
			
				