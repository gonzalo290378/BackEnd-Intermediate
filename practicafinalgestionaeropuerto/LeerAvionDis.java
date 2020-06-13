package practicafinalgestionaeropuerto;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Aqui leemos el archivo avion.ddr creado previamente desde el arcbivo EscribirAvionDos.java

public class LeerAvionDis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (DataInputStream dis=new DataInputStream(new FileInputStream("avion.ddr"))){
			
			//Tengo que leerlos de la misma manera y orden en el cual se escribio el archivo
			
			String modelo=dis.readUTF();
			int numeroAsientos=dis.readInt();
			int velocidad= dis.readInt();
			
			Avion a= new Avion(modelo, numeroAsientos,velocidad);
			System.out.println(a);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

}
