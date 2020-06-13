package Intermedio;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Ingresa una fecha con 4 digitos");
		int fecha=sc2.nextInt();
		if (fecha%4==0 & !(fecha%100==0) || fecha%400==0) {
			System.out.println("Es numero bisiesto");
		}
		else System.out.println("No es bisiesto");
		

	}

}
