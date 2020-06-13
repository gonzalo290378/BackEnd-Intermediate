package funciones;

public class ParesEntre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 2000;

		consultarPares(num1, num2);

	}

	public static void consultarPares(int num1, int num2) {
		
		int longArray=calcularArray(num1,num2);		
		int arrayPares[] = new int[longArray];

		for (int i = num1, j=0; i <= num2; i++) {

			if (i % 2 == 0) {
				arrayPares[j] = i;
				j++;
			}
		}

		for (int resultados : arrayPares) {
			System.out.println(resultados);
		}

	}
	
	public static int calcularArray(int num1,int num2) {
		
		
		if(num1%2==0 && num2%2==0) {
			return (num2-num1)/2 + 1;
		}
		else {
			return (num2-num1)/2;
		}
		
	}

}
