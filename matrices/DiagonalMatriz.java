package matrices;

public class DiagonalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrizFila =

				{

						{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Diagonol Principal");

		for (int i = 0; i < matrizFila.length; i++) { // LA IDEA ES QUE RECORRA LAS FILAS
			System.out.println(matrizFila[i][i]);
		}
		
		System.out.println("Diagonal Inversa");
		
		
		
		for (int i = 0, j=matrizFila[0].length-1; i < matrizFila.length; i++,j--) {
			System.out.println(matrizFila[i][j]);

		}
		

	}

}
