package matrices;

import java.security.SecureRandom;
import java.util.Scanner;
//BUSCAMINAS CON ERRORES
public class Buscaminas {

	final static char VACIO = 'V';
	final static char MINA = 'M';
	final static char NO_EXPLORADO = 'X';

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tableroBuscaminas[][] = new char[6][7];
		char tableroNoExplorado[][] = new char[6][7];

		for (int i = 0; i < tableroNoExplorado.length; i++) {
			for (int j = 0; j < tableroNoExplorado[0].length; j++) {
				tableroNoExplorado[i][j]=NO_EXPLORADO;
			}
		}
		Scanner inCoordenada = new Scanner(System.in);
		final int TURNO = 5;
		int fallos = 0;
		final int CANTIDAD_MINAS = 10;

		int coordenadaX = 0;
		int coordenadaY = 0;

		rellenarMatrix(tableroBuscaminas, VACIO, MINA);
		rellenarMinas(tableroBuscaminas, MINA, CANTIDAD_MINAS);
		
		mostrarTablero(tableroNoExplorado, tableroNoExplorado, coordenadaX, coordenadaY);
		

		while (fallos != TURNO) {
			System.out.println();
			System.out.println("Te faltan  " + (TURNO - fallos) + " turnos para ganar el Juego");
			System.out.println("Elije coordenada X: (del 0 al 5)");
			coordenadaX = inCoordenada.nextInt();
			System.out.println("Elije coordenada Y: (del 0 al 6)");
			coordenadaY = inCoordenada.nextInt();

			boolean calculo = calculaMatriz(tableroBuscaminas, coordenadaX, coordenadaY);

			mostrarTablero(tableroBuscaminas, tableroNoExplorado, coordenadaX, coordenadaY);

			if (!calculo) {
				System.out.println("Pisaste una mina. Perdiste" + "\n");
				System.exit(0);
			} else {
				System.out.println("Muy bien sigue asi!" + "\n");
				fallos++;
			}
		}
		System.out.println("Felicidades! Has ganado!");
		inCoordenada.close();
	}

	public static boolean calculaMatriz(char[][] tableroBuscaminas, int coordenadaX, int coordenadaY) {
		if (tableroBuscaminas[coordenadaX][coordenadaY] == MINA) {
			tableroBuscaminas[coordenadaX][coordenadaY] = MINA;
			return false;
		}

		else if (tableroBuscaminas[coordenadaX][coordenadaY] == VACIO) {
			tableroBuscaminas[coordenadaX][coordenadaY] = VACIO;
			return true;
		}
		return true;
	}

	public static void mostrarTablero(char[][] tableroBuscaminas, char[][] tableroNoExplorado, int coordenadaX,
			int coordenadaY) {

		for (int i = 0; i < tableroBuscaminas.length; i++) {
			for (int j = 0; j < tableroBuscaminas[0].length; j++) {
				if (i == coordenadaX && j == coordenadaY) {
					System.out.print(tableroBuscaminas[i][j] + " ");
					tableroNoExplorado[i][j] = tableroBuscaminas[i][j];
				} else {
					System.out.print(tableroNoExplorado[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static char[][] rellenarMinas(char[][] tableroBuscaminas, char MINA, int CANTIDAD_MINAS) {
		int posicionMinaX = 0;
		int posicionMinaY = 0;
		while (CANTIDAD_MINAS > 0) {
			SecureRandom randomMina = new SecureRandom();
			posicionMinaX = randomMina.nextInt(6);
			posicionMinaY = randomMina.nextInt(7);
			if (tableroBuscaminas[posicionMinaX][posicionMinaY] != MINA) {
				tableroBuscaminas[posicionMinaX][posicionMinaY] = MINA;

				CANTIDAD_MINAS--;
			}

		}
		return tableroBuscaminas;

	}

	public static void rellenarMatrix(char[][] tableroBuscaminas, char VACIO, char MINA) {
		for (int i = 0; i < tableroBuscaminas.length; i++) {
			for (int j = 0; j < tableroBuscaminas[0].length; j++) {
				if (tableroBuscaminas[i][j] != MINA) {
					tableroBuscaminas[i][j] = VACIO;
				}
			}
		}
	}

}
