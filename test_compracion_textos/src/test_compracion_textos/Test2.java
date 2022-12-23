package test_compracion_textos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.of(2020, 10, 30);
	    LocalDate f2=LocalDate.of(2016, 05, 15);
	    //comparacion de fechas
	    if(f1.isBefore(f2)) {
	    	System.out.println("La fecha mas antigua es: "+f1);
	    	System.out.println("La fecha mas antigua es: "+f2);
	    }else {
	    	System.out.println("La fecha mas antigua es: "+f2);
	    	System.out.println("La fecha mas antigua es: "+f1);
	    }
	    System.out.println(f1.plusMonths(8));
	    System.out.println(f1.plusDays(200));
	    System.out.println(f1.plusMonths(1));
	    DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    	System.out.println(f1.format(format1));
	    	String mf="11/11/2018";
	    	LocalDate nuevaFecha=LocalDate.parse(mf,format1);
	}
	

}
