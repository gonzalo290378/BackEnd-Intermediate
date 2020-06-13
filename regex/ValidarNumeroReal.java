package regex;

public class ValidarNumeroReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(validarNumeroReal("10.5")) {
			System.out.println("Es Correcto");
		}else System.out.println("Es Incorrecto");

	}
	
	public static boolean validarNumeroReal(String t) {
		return t.matches("^-?[0-9]+([//.,][0-9]+)?$");
	}

}
