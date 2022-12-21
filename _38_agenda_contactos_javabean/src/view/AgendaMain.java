package view;

import java.util.Scanner;

import service.AgendaService;

public class AgendaMain {
	static AgendaService agendaService=new AgendaService();


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int opcion;	
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				guardarContacto();
				break;
			case 2:
				buscarContacto();
				break;
			case 3:
				eliminarContacto();
				break;
			case 4:
				mostrarNombres();
				break;
			case 5:
			System.out.println("___Adios_____");


			}

		}while (opcion!=5);
	}

	static void guardarContacto() {
		System.out.println("1.-Guardar nota");
		System.out.println("2.-Buscar contacto ");
		System.out.println("3.-Eliminar contacto");
		System.out.println("4.-Mostrar nombres");
		System.out.println("5.-Fin");
	}

	static void pedirContacto() {
		Scanner sc=new Scanner(System.in);
		int numero;
		String nombre;
		String email;
		int edad;
		System.out.println("Introduce numero de telefono");
		numero=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce nombre");
		nombre=sc.nextLine();
		System.out.println("Introduce email");
		email=sc.nextLine();
		System.out.println("Introduce edad");
		edad=Integer.parseInt(sc.nextLine());
		

		agendaService.guardarContacto(numero, nombre,email,edad);

	}

	static void buscarContacto() {
		Scanner sc=new Scanner(System.in);
		int numero;
		Contacto contacto;
		System.out.println("Introduce numero de telefono");
		numero=sc.nextInt();
		contacto=agendaService.buscarContacto(numero);
		System.out.println(contacto.getNombre()+".");

	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		int numero;

		System.out.println("Introduce numero de telefono");
		numero=sc.nextInt();
		agendaService.eliminarContacto(numero);
	}
	static void mostrarNombres() {
		String[]nombres=agendaService.nombres();
		for(String n:nombres) {
			System.out.println(n);
		}
	}
}
