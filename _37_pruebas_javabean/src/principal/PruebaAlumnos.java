package principal;

import model.Alumno;
import model.Empleado;

public class PruebaAlumnos {

	public static void main(String[] args) {
		Alumno al=new Alumno("alumno 1","Java",8,"alumno@gmail.com");
		System.out.println("Nombre del alumno: "+al.getNombre());
		System.out.println("Curso del nombre:"+al.getCurso());
		System.out.println("Nota:"+al.getNota());
		//array de empleados
        Empleado[]empleados=new Empleado[10];
        empleados [0]=new Empleado("a", "aa",100);
	}

}
