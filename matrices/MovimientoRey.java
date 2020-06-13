package matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovimientoRey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;// GUARDAREMOS LA OPCION DEL USUARIO

		final char POSICION_REY = '0';
		final char VACIO = 'X';

		char[][] matrizRey = new char[8][8];
		rellenarMatriz(matrizRey, VACIO); // ACA MUESTRA EL REY

		int posicionActualX = 0;// FILA
		int posicionActualY = 0;// COLUMNA

		matrizRey[posicionActualX][posicionActualY] = POSICION_REY;

		while (!salir) {

			mostrarMatriz(matrizRey);

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

			try {
				System.out.println("Escribe una de las siguientes opciones:");
				opcion = sn.nextInt();

				int posicionAnteriorX = posicionActualX;
				int posicionAnteriorY = posicionActualY;

				/*
				 * 00 01 02 
				 * 10 11 12 
				 * 20 21 22
				 * 
				 */

				switch (opcion) {
				case 1:
					posicionActualX--;
					break;

				case 2:
					posicionActualX--;
					posicionActualY++;

					break;

				case 3:
					posicionActualY++;

					break;

				case 4:
					posicionActualX++;
					posicionActualY++;
					break;

				case 5:
					posicionActualX++;

					break;

				case 6:
					posicionActualX++;
					posicionActualY--;
					break;

				case 7:
					posicionActualY--;
					break;

				case 8:
					posicionActualX--;
					posicionActualY--;
					break;

				case 9:
					salir = true;

					break;

				default:
					System.out.println("Solo numeros entre 1 y 9");

				}

				if (limitarMatriz(matrizRey.length, matrizRey[0].length, posicionActualX, posicionActualY)) {

					matrizRey[posicionActualX][posicionActualY] = POSICION_REY;
					matrizRey[posicionAnteriorX][posicionAnteriorY] = VACIO;
				} else {
					System.out.println("Te has salido de la matriz");
					posicionActualX = posicionAnteriorX;
					posicionActualY = posicionAnteriorY;
				}

			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un numero");
				sn.nextInt();
			}

		}

	}

	public static void mostrarMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println("");
		}
	}

	public static void rellenarMatriz(char matriz[][], char VACIO) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = VACIO;
			}
		}
	}

	public static boolean limitarMatriz(int longitudFilas, int longitudColumnas, int x, int y) {
		if (x >= 0 && y >= 0 && x < longitudFilas && y < longitudColumnas) {
			return true;
		}

		return false;
	}

}
