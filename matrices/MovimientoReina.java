package matrices;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovimientoReina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inUsuario = new Scanner(System.in);
		final char VACIO = 'O';
		final char REINA = 'X';
		char[][] tableroReina = new char[8][8];
		rellenarMatriz(tableroReina, VACIO); // ACA MUESTRA LA TORRE

		boolean salir = false;
		SecureRandom random = new SecureRandom();

		int direX = 0;
		int direY = 0;

		int posX = random.nextInt(tableroReina.length);
		int posY = random.nextInt(tableroReina[0].length);

		tableroReina[posX][posY] = REINA;

		while (!salir) {

			muestraMatriz(tableroReina);

			int posXAnterior = posX;
			int posYAnterior = posY;

			System.out.println(" ");
			System.out.println("Por favor, elige una opcion: ");
			System.out.println("1. Mover arriba");
			System.out.println("2. Mover arriba-derecha");
			System.out.println("3. Mover derecha");
			System.out.println("4. Mover abajo-derecha");
			System.out.println("5. Mover abajo");
			System.out.println("6. Mover abajo-izquierda");
			System.out.println("7. Mover izquierda");
			System.out.println("8. Mover arriba-izquierda");
			System.out.println("9. Mover salir");

			int opcion = inUsuario.nextInt();

			/*
			 * 00 01 02 
			 * 10 11 12 
			 * 20 21 22
			 */

			try {

				switch (opcion) {

				case 1:
					direX = -1;
					direY = 0;

					break;

				case 2:
					direX = -1;
					direY = 1;
					break;

				case 3:
					direX = 0;
					direY = 1;

					break;

				case 4:
					direX = 1;
					direY = 1;

					break;

				case 5:
					direX = 1;
					direY = 0;
					break;

				case 6:
					direX = -1;
					direY = -1;

					break;

				case 7:
					direX = 0;
					direY = -1;
					break;

				case 8:
					direX = -1;
					direY = -1;
					break;

				case 9:

					salir = true;
					break;

				default:
					System.out.println("Solo numeros entre 1 y 9");
					break;
				}

				while (limitarMatriz(tableroReina.length, tableroReina[0].length, posX + direX, posY + direY)) {
					posX += direX; // 4
					posY += direY; // 3

				}

				tableroReina[posX][posY] = REINA;
				tableroReina[posXAnterior][posYAnterior] = VACIO;

			} catch (InputMismatchException e) {

				System.out.println("Debes insertar un numero");
				opcion = inUsuario.nextInt();

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
