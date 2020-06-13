package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto=sc.nextLine();
		
		
		//PONER DENTRO DEL TRY LA CONSTRUCCION DEL OBJETO HACE QUE SE CIERRE LA CONEXION SIN EL METODO CLOSE()
		try (BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo1.txt",true));){
			
			bw.write(texto);
			
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
