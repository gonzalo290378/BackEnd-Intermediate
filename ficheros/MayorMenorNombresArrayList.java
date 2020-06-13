package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MayorMenorNombresArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un nombre de fichero de personas tu mismo, leelo, guardalo en un
		// arraylist , ordena los nombres y escribelos en un nuevo fichero

		ArrayList<String> nombres = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo6.txt"));

				BufferedWriter bw = new BufferedWriter(
						new FileWriter("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo7.txt"))) {

			String linea;

			while ((linea = br.readLine()) != null) {
				nombres.add(linea);
			}

			Collections.sort(nombres);

			System.out.println(nombres);

			for (String nombre : nombres) {
				bw.write(nombre + "\r\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
