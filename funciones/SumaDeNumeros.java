package funciones;

import java.util.Scanner;

public class SumaDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Indica que numero quieres sumar con sus anteriores");
		int numeroElegido = scn.nextInt();
		int resultado=devuelveSuma(numeroElegido);
		System.out.println("El resultado es " + resultado);
	}

	public static int devuelveSuma(int numeroElegido) {
		int total=0;
		for (int i = 1; i<= numeroElegido; i++) {
		total=total+i;	
		}
		return total;
	}

	
}
