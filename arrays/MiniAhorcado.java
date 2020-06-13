package arrays;

import java.security.SecureRandom;
import java.util.Scanner;

public class MiniAhorcado {

	public static void main(String[] args) {
		
		//VARIABLES
		final int MAX_FALLOS = 6;
		int fallos = 0;
		Scanner scn = new Scanner(System.in);
		String[] palabras = { "coche", "elefante", "modificacion", "sereno", "uno" };
		String palabraAdivinar = palabras[generaNumeroAleatorio()];
		char letraAdivina;
		char[] caracteres = palabraAdivinar.toCharArray();
		boolean acertados[] = new boolean[caracteres.length];
						
		//ACA EMPIEZA EL PROGRAMA:
		generaNumeroAleatorio();

		while (fallos < MAX_FALLOS && !palabrasAcertadas(acertados)) {

			mostrarCaracteres(acertados, caracteres);
			System.out.println("Escribe una letra");
			letraAdivina = scn.next().toLowerCase().charAt(0);

			if (revelarCaracteres(acertados, caracteres, letraAdivina) > 0) {
				System.out.println("Has acertado");
			} else {
				fallos++;

				if (fallos != MAX_FALLOS) {
					System.out.println("No has acertado. Te quedan " + (MAX_FALLOS - fallos) + " fallos.");

				}
			}
		}

		if (palabrasAcertadas(acertados)) {
			System.out.println("Has ganado");
		} else
			System.out.println("Has perdido");

	}

	public static int revelarCaracteres(boolean acertados[], char[] caracteres, char letraAdivina) {
		int acertadas = 0;
		
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == letraAdivina) { // SI ADIVINA UNA LETRA, PONE EN TRUE EL INDICE DEL ARRAY ACERTADOS
				acertados[i] = true;
				acertadas++;
			}
		}
		return acertadas;
	}

	public static boolean palabrasAcertadas(boolean acertados[]) {// CUANDO DEVUELVE TRUE LA PALABRA FUE ACERTADA
		for (int i = 0; i < acertados.length; i++) {
			if (!acertados[i]) {
				return false; // HASTA QUE TODAS LAS LETRAS NO SEAN TRUE, DEVOLVER FALSE
			}
		}
		return true;
	}

	public static int generaNumeroAleatorio() {
		SecureRandom rnd = new SecureRandom();
		int posicionIndice = rnd.nextInt(6);
		return posicionIndice;
	}

	public static void mostrarCaracteres(boolean acertados[], char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			if (acertados[i]) {
				System.out.print(caracteres[i] + " ");
			} else {
				System.out.print("_ ");
			}

		}

		System.out.println();
	}

}
