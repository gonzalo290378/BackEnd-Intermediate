package practicafinalgestionaeropuerto;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirAvionDos {

	// Escribir la informacion de un avion con DataOutputStream. Donde se va a crear
	// un archivo llamado avion.ddr y va a estar la informacion del objeto avion
	// creado

	public static void main(String[] args) {

		Avion a = new Avion("Boeing 777", 250, 900);

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("avion.ddr"))) {

			dos.writeUTF(a.getModelo());
			dos.writeInt(a.getNumeroAsientos());
			dos.writeInt(a.getVelocidadMaxima());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
