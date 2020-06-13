package matrices;

public class FilaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrizFila =

				{

						{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		muestraFilaMatriz(matrizFila,2);

	}

	public static void muestraFilaMatriz(int[][] matriz, int fila) {
		
		if(fila>=0 && fila<matriz.length) { //MATRIZ.LENGTH CUENTA LA CANTIDAD DE FILAS
			
			for (int j = 0; j < matriz[0].length; j++) {// COLUMNAS
				System.out.println(matriz[fila][j]);
			}
		}else {
			System.out.println("La fila no es correcta");
		}
		
	}

}
