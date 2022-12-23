package pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		String ruta="c:\\ficheros\\productos.txt";
		/*FileReader fr=null;
		BufferedReader bf=null;
		try {
			fr=new FileReader(ruta);
			bf=new BufferedReader(fr);
			//System.out.println(bf.readLine());//primera linea
			//System.out.println(bf.readLine());//segunda linea
			String s;
			while (( s=bf.readLine())!=null) {
				System.out.println(s);

			}
		}
		catch (FileNotFoundException ex) {
            ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				}catch(IOException e) {
					e.printStackTrace();

				}
			}
		}
		if(fr!=null) {
			try {
				fr.close();

			}catch(IOException e) {
				e.printStackTrace();
			}
		}*/
		try(FileReader fr=new FileReader(ruta);
		
		BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine()))!null){
				System.out.println(s);
				
			}
		}
		catch (FileNotFoundException ex) {
            ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
	}

	}
}
