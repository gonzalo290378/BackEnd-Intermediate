package Intermedio;

import java.util.Scanner;

public class Horas_Minutos_Segundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc3 = new Scanner(System.in);
		final int SEGUNDOS = 3600;
		final int MINUTOS = 60;
		System.out.println("Ingresa la cantidad de segundos");
		int segundosUs = sc3.nextInt();

		int horas = segundosUs / SEGUNDOS; // TENGO LA CANTIDAD DE HORAS
		int segundosRestantes = segundosUs % SEGUNDOS; // TENGO LA CANTIDAD DE SEGUNDOS RESTANTES
		int minutosRestantes = segundosRestantes / MINUTOS;
		int segundosPrint = minutosRestantes % 60;
		System.out.println("Son: " + horas + " horas " + minutosRestantes + " minutos " + segundosPrint + " segundos");
		sc3.close();
		
	}

}
