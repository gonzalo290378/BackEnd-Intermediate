package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CuentaLineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create un fichero y cuenta el numero de lineas que tiene

		String linea1="";
		try {
			CuentaLineas(linea1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void CuentaLineas(String linea1) throws IOException {
		
		BufferedReader counterLines = new BufferedReader(
				new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo3.txt"));

	
		int contador = 0;
		while ((linea1 = counterLines.readLine()) != null) {
			contador++;
		}

		System.out.println(contador);
	}

}
