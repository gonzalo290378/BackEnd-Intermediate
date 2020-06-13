package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MayorMenorNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader lecturaNombre = new BufferedReader(
				new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo6.txt"))) {
			int arrayLineas = cuentaNumLineas("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo6.txt");
			String[] nombres = new String[arrayLineas];
			
			for (int i = 0; i < nombres.length; i++) {
				nombres[i]=lecturaNombre.readLine();
			}
			
			Arrays.sort(nombres);
			
			for (String string : nombres) {
				System.out.println(string);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Hay un numero entre los nombres " + e.getMessage());
		}

	}

	private static int cuentaNumLineas(String string) throws IOException {

		int contador = 0;

		BufferedReader br = new BufferedReader(new FileReader(string));
		String linea = "";

		while ((linea = br.readLine()) != null) {

			contador++;
		}

		return contador;
	}

}
