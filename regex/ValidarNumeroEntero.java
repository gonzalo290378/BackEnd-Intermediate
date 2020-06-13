package regex;

public class ValidarNumeroEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(validarnumeroEntero("44")) {
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}


	}
	public static boolean validarnumeroEntero(String texto) {
		return texto.matches("^-?[0-9]+$");
	}
}
