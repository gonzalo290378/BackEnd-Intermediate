package matrices;

import java.util.Scanner;

public class CompletandoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]matrizPrimera=new int[3][3];
		Scanner scn=new Scanner(System.in);
		
		//RELLENAR
		for (int i = 0; i < matrizPrimera.length; i++) { //FILAS
			for (int j = 0; j < matrizPrimera[0].length; j++) {//COLUMNAS
				System.out.println("Ingresa posicion i: " + i + " , j: " + j );
				int entrada=scn.nextInt();
				matrizPrimera[i][j]=entrada;
				
			}
		}
		
		//RECORRER
		for (int i = 0; i < matrizPrimera.length; i++) { //FILAS
			for (int j = 0; j < matrizPrimera[0].length; j++) {//COLUMNAS
				System.out.print (matrizPrimera[i][j] + " ");
				
				
			}
			
			System.out.println();
		}
		
	}

}
