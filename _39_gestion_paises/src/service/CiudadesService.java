package service;

import java.util.ArrayList;

import model.Ciudad;


public class CiudadesService {
	ArrayList<Ciudad> ciudades=new ArrayList<>();


	public void guardarCiudad(String nombre,int habitantes, String pais){
		ciudades.add(new Ciudad(nombre,habitantes,pais));

	}

	public Ciudad ciudadMasPoblada() {
		int habitantesMax=0;
		Ciudad ciudad=null; //aqui se guarda la ciudad con mayor numero de habitantes
		for(Ciudad c:ciudades) {
			//si encontramos unnuevo maximo de habitantes, actualixamos la variable habitantesMax
			//y tambien la que guarda la ciudad con maximo de habitantes
			if(c.getHabitantes()>habitantesMax) {
				habitantesMax=c.getHabitantes();
				ciudad=c;
			}
		}
		return ciudad;
	}
	public ArrayList<Ciudad> ciudadesPorPais(String pais) {
		ArrayList<Ciudad>aux=new ArrayList<>();

		for(Ciudad c:ciudades) {
			if (pais.equals(c.getPais())) {//si la ciudad es del pais buscado, la añadimos a la nueva lista
				aux.add(c);
			}
		}
			return aux;
		

	}
}	
	