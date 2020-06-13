package matrices;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovimientoTorre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnUsuario = new Scanner(System.in);
		final char VACIO = 'O';
		final char TORRE = 'X';
		char[][] tableroAjedrez = new char[8][8];
		rellenarMatriz(tableroAjedrez, VACIO); // ACA MUESTRA LA TORRE

		boolean salir = false;
		SecureRandom random = new SecureRandom();

		int direccionX = 0;
		int direccionY = 0;

		int posicionEjeX = random.nextInt(tableroAjedrez.length);
		int posicionEjeY = random.nextInt(tableroAjedrez[0].length);

		tableroAjedrez[posicionEjeX][posicionEjeY] = TORRE;

		while (!salir) {

			muestraMatriz(tableroAjedrez);

			int posicionXAnterior = posicionEjeX;
			int posicionYAnterior = posicionEjeY;

			System.out.println("Por favor elige una opcion: ");
			System.out.println("1- Mover hacia arriba");
			System.out.println("2- Mover hacia la derecha");
			System.out.println("3- Mover hacia abajo");
			System.out.println("4- Mover hacia izquierda");
			System.out.println("5- Salir");
			int opcion = scnUsuario.nextInt();

			/*
			 * 00 01 02 
			 * 10 11 12 
			 * 20 21 22
			 */

			try {

				switch (opcion) {

				case 1:

					direccionX = -1;
					direccionY = 0;
					break;

				case 2:
					direccionX = 0;
					direccionY = 1;

					break;

				case 3:

					direccionX = 1;
					direccionY = 0;

					break;

				case 4:
					direccionX = 0;
					direccionY = -1;

					break;

				case 5:

					salir = true;
					break;

				default:
					System.out.println("Solo numeros entre 1 y 5");
					break;
				}

				while (limitarMatriz(tableroAjedrez.length, tableroAjedrez[0].length, posicionEjeX + direccionX,
						posicionEjeY + direccionY)) {
					posicionEjeX += direccionX; // 4
					posicionEjeY += direccionY; // 3

				}

				tableroAjedrez[posicionEjeX][posicionEjeY] = TORRE;
				tableroAjedrez[posicionXAnterior][posicionYAnterior] = VACIO;

			} catch (InputMismatchException e) {

				System.out.println("Debes insertar un numero");
				opcion = scnUsuario.nextInt();

			}

		}

	}

	public static void rellenarMatriz(char[][] tablero, char VACIO) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = VACIO;
			}

		}
	}

	public static void muestraMatriz(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static boolean limitarMatriz(int longitudFila, int longitudColumna, int ejeX, int ejeY) {
		if (ejeX >= 0 && ejeY >= 0 && ejeX < longitudFila && ejeY < longitudColumna) {
			return true;
		}

		return false;
	}

}