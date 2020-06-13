package matrices;

public class ColumnaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrizColumna =

				{
						{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		muestraColumnaMatriz(matrizColumna, 1);

	}

	public static void muestraColumnaMatriz(int [][] matriz, int columna) {
		
		if(columna>=0 && columna<matriz[0].length) { //MATRIZ[0].LENGTH CUENTA LA CANTIDAD DE COLUMNAS
			
			for (int i = 0; i < matriz.length; i++) {
				System.out.println(matriz[i][columna]);
			}
			
		}
			
			else {
				System.out.println("La columna no es correcta");
			}
		}
		
	}

