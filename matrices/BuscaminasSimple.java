package matrices;

import java.security.SecureRandom;
import java.util.Scanner;

public class BuscaminasSimple {

	final static int FILAS = 6;
	final static int COLUMNAS = 7;
	final static char VACIO = 'V';
	final static char MINA = 'M';
	final static char NO_EXPLORADO = 'X';

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CANTIDAD_MINAS = 10;

		int coordenadaXUsuario;
		int coordenadaYUsuario;
		final int TURNO = 5;
		int intentos = 0;
		final int CERO = 0;

		boolean juegoPerdido = false;

		char[][] tablero = new char[FILAS][COLUMNAS];
		boolean[][] tableroRegistrador = new boolean[FILAS][COLUMNAS];

		System.out.println("Bienvenido al juegoPerdido Buscaminas" + '\n');

		matriz(tablero, tableroRegistrador);
		generarMinas(tableroRegistrador, tablero, CANTIDAD_MINAS);

		while (intentos != TURNO && !juegoPerdido) {

			coordenadaXUsuario = eleccionCoordenada(CERO, FILAS, "X");
			coordenadaYUsuario = eleccionCoordenada(CERO, COLUMNAS, "Y");

			if (!tableroRegistrador[coordenadaXUsuario][coordenadaYUsuario]) {
				char zona = tablero[coordenadaXUsuario][coordenadaYUsuario];
				if (zona == MINA) {
					juegoPerdido = true;
				} else {
					intentos++;
					tablero[coordenadaXUsuario][coordenadaYUsuario] = VACIO;
					System.out.println(
							"Muy bien puedes seguir! Te quedan para ganar " + (TURNO - intentos) + " intentos");

				}
				tableroRegistrador[coordenadaXUsuario][coordenadaYUsuario] = true;
			} else
				System.out.println("Debes elegir una zona no explorada");

			matriz(tablero, tableroRegistrador);
		}

		if (juegoPerdido)
			System.out.println("Has perdido");
		else
			System.out.println("Felicidades! Has ganado el juegoPerdido!");

	}

	public static void matriz(char[][] tablero, boolean[][] tableroRegistrador) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tableroRegistrador[i][j]) {
					System.out.print(tablero[i][j] + " ");
				} else {
					System.out.print(NO_EXPLORADO + " ");
				}

			}

			System.out.println();
		}
	}

	public static int generaAleatorios(int aleatorio) {
		SecureRandom rnd = new SecureRandom();
		int numeroAleatorio = rnd.nextInt(aleatorio);
		return numeroAleatorio;
	}

	public static int eleccionCoordenada(int minCoordenada, int maxCoordenada, String coordenadaTurno) {
		Scanner inUser = new Scanner(System.in);

		System.out.println();
		System.out.println("Ingresa la coordenada " + coordenadaTurno + '\n');

		int coordenada = inUser.nextInt();

		while (coordenada < minCoordenada || coordenada >= maxCoordenada) {
			System.out.println("Por favor ingresa la coordenada " + coordenadaTurno + " otra vez" + '\n');
			coordenada = inUser.nextInt();
		}

		return coordenada;
	}

	public static void generarMinas(boolean[][] tableroRegistrador, char[][] tablero, int CANTIDAD_MINAS) {

		while (CANTIDAD_MINAS > 0) {
			int x = generaAleatorios(FILAS);
			int y = generaAleatorios(COLUMNAS);

			if (tablero[x][y] != MINA) {
				tablero[x][y] = MINA;
				CANTIDAD_MINAS--;
			}
		}
	}

}
