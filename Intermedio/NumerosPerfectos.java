package Intermedio;

import java.util.Scanner;

public class NumerosPerfectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc5=new Scanner(System.in);
		System.out.println("Ingrese un numero para analizar si es Numero Perfecto");
		int numPerfecto=sc5.nextInt();
		int total=0;
		for (int i = 1; i <= numPerfecto/2 ;i++) {
			if(numPerfecto%i==0) {
				total+=i;
			}
		}
		
		if(total==numPerfecto) System.out.println("Es un numero perfecto");
		else System.out.println("No es un numero perfecto");
	}

}
