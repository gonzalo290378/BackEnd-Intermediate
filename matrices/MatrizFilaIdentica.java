package matrices;

public class MatrizFilaIdentica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrizFilaIdentica = { { 3, 3, 3 }, { 3, 4, 8 }, { 8, 8, 8 } };
		
		System.out.println(filaIdentica(matrizFilaIdentica, 0));

	}

	public static boolean filaIdentica(int matriz[][], int fila) {

		int primerValor=matriz[fila][0];
		
		for (int j = 0; j < matriz[0].length; j++) {
			if(primerValor!=matriz[fila][j]) return false;
		}
		
		
			
		return true;

		
		
	}

}
