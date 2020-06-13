package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			leerFichero("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void leerFichero(String linea) throws IOException {
		BufferedReader entrada = new BufferedReader(
				new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo2.txt"));

		linea = "";

		while ((linea = entrada.readLine()) != null) {

			System.out.println(linea);

		}

		entrada.close();

	}

}
