package arrays;

public class MayorYMenorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayMayorMenor = { 50, 2, 7, 8, 96, 102, 65, 5, 74, 6, 1,-14 };

		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;

		for (int i = 0; i < arrayMayorMenor.length; i++) {
			if (arrayMayorMenor[i] > mayor) {
				mayor=arrayMayorMenor[i];
			}
			
			if (arrayMayorMenor[i] < menor) {
				menor=arrayMayorMenor[i];
			}

		}

		System.out.println("El mayor es " + mayor + " y el menor es " + menor);

	}

}
