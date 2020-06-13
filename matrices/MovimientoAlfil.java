package matrices;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovimientoAlfil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inUser = new Scanner(System.in);
		final char VACIO = 'O';
		final char ALFIL = 'X';
		char[][] tablero = new char[8][8];
		rellenarMatriz(tablero, VACIO); // ACA MUESTRA EL ALFIL

		boolean salir = false;
		SecureRandom random = new SecureRandom();

		int dirX = 0;
		int dirY = 0;

		int posicionX = random.nextInt(tablero.length);
		int posicionY = random.nextInt(tablero[0].length);

		tablero[posicionX][posicionY] = ALFIL;

		while (!salir) {

			muestraMatriz(tablero);

			int posicionXAnterior = posicionX;
			int posicionYAnterior = posicionY;

			System.out.println("Por favor elige una opcion: ");
			System.out.println("1- Mover hacia arriba-derecha");
			System.out.println("2- Mover hacia abajo-derecha");
			System.out.println("3- Mover hacia abajo-izquierda");
			System.out.println("4- Mover hacia arriba-izquierda");
			System.out.println("5- Salir");
			int opcion = inUser.nextInt();

			/*
			 * 00 01 02 
			 * 10 11 12 
			 * 20 21 22
			 */

			try {

				switch (opcion) {

				case 1:

					dirX =-1;
					dirY =1;

					break;

				case 2:

					dirX =1; ;
					dirY =1;

					break;

				case 3:

					dirX =1;
					dirY =-1;

					break;

				case 4:

					dirX =-1;
					dirY =-1;

					break;

				case 5:

					salir = true;
					break;

				default:
					System.out.println("Solo numeros entre 1 y 5");
					break;
				}

				while (limitarMatriz(tablero.length, tablero[0].length, posicionX + dirX, posicionY + dirY)) {
					posicionX += dirX;
					posicionY += dirY;

				}

				tablero[posicionX][posicionY] = ALFIL;
				tablero[posicionXAnterior][posicionYAnterior] = VACIO;

			} catch (InputMismatchException e) {

				System.out.println("Debes insertar un numero");
				opcion = inUser.nextInt();

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

	public static boolean limitarMatriz(int longitudFilas, int longitudColumnas, int x, int y) {
		if (x >= 0 && y >= 0 && x < longitudFilas && y < longitudColumnas) {
			return true;
		}

		return false;
	}

}
