package service;

import java.util.Collection;
import java.util.HashMap;

import model.Contacto;

public class AgendaService {
	
	
	HashMap<Integer, Contacto>contactos=new HashMap<>();
	
	public void guardarContacto(Integer numero, String nombre,String email, int edad) {

		//If (contactos.get(numero)==null)
		//si la clave esta libre, el contacto se puede añadir
		if(!contactos.containsKey(numero)) {//esa pregunta equivale a;if(contactos.containsKey(numero)==false)
			contactos.put(numero, new Contacto(nombre, numero,email,edad));
		}

	}
	public Contacto buscarContacto(Integer numero) {
		//devolvemos el objeto Contacto entero
		return contactos.get(numero);

	}
	public void eliminarContacto(Integer numero) {
		 contactos.remove(numero);


   
	}

	public String[] nombres() {
		String[]res=new String[contactos.size()];
		Collection<Contacto>col=contactos.values();
		int i=0;
		for(Contacto n:col) {
			res[i]=n.getNombre();
			i++;
			
		}
		return res;
	}
}
