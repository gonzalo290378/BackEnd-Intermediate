package regex;

public class EjemplosRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    

	}
	
	//Validar un número entero.
	
	public static boolean validaNumeroEntero_Exp(String texto){
	     
	    return texto.matches("^-?[0-9]+$");
	}

	//Validar un numero entero positivo
	
	public static boolean validaNumeroEnteroPositivo_Exp(String texto){
	     
	    return texto.matches("^[0-9]+$");
	}
	
	//Validar un numero entero negativo
	
	public static boolean validaNumeroEnteroNegativo_Exp(String texto){
	     
	    return texto.matches("^-[0-9]+$");
	}
	
	// Validar DNI, 8 números y una letra al final
	
	public static boolean validaDNI_Exp(String DNI){
	     
	    return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
	     
	}
	
	// Valida si una cadena es una IP válida
	
	public static boolean validaIP_Exp(String ip){
	     
	    return ip.matches("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
	}
	
	// Valida si una cadena es una matricula europea (<2000)
	
	public static boolean validarMatriculaEuropea_Exp(String matricula) {
		 
	    return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	 
	}
	
	// Valida si una cadena es un número binario
	
	public static boolean validaBinario_Exp(String binario){
	     
	    return binario.matches("^[0-1]+$");
	     
	}
	
	// Valida si una cadena es un número octal
	
	public static boolean validaOctal_Exp(String octal){
	     
	    return octal.matches("^[0-7]+$");
	     
	}

	
	// Valida si una cadena es un número hexadecimal
	
	public static boolean validaHexadecimal_Exp(String hexadecimal){
	     
	    return hexadecimal.matches("^[0-9A-F]+$");
	     
	}

	
	// Valida si una cadena es un numero real (positivo o negativo)
	
	public static boolean validaNumeroReal_Exp(String texto){
	     
	    return texto.matches("^-?[0-9]+([\\.,][0-9]+)?$");
	}

	
	// Valida si una cadena es un numero real positivo
	
	public static boolean validaNumeroRealPositivo_Exp(String texto) {
		 
	    return texto.matches("^[0-9]+([\\.,][0-9]+)?$");
	}
	
	// Valida si una cadena es un numero real negativo
	
	public static boolean validaNumeroRealNegativo_Exp(String texto){
	     
	    return texto.matches("^-[0-9]+([\\.,][0-9]+)$");
	}

	
	// Valida si una cadena es un numero real (positivo o negativo) con un numero de decimales
	
	public static boolean validaNumeroReal_Exp(String texto, int num_deciamales) {
	    if (num_deciamales > 0) {
	        return texto.matches("^-?[0-9]+([\\.,][0-9]{1," + num_deciamales + "})?$");
	    } else {
	        return false;
	    }
	 
	}
	
	// Valida si una cadena tiene el formato de fecha dd/mm/aaaa
	
	public static boolean validaNumeroFecha_Exp(String texto) {
		 
	    return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
	}

	
	// Valida si una cadena tiene el formato de nombre de persona, incluyendo nombres compuestos
	
	public static boolean validaNombre_Exp(String texto) {
		 
	    return texto.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}

	
	// Valida si una cadena es un email
	
	public static boolean validar_Mail_Exp(String email) {
		 
	    return email.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
	 
	}

	
	// Valida si una cadena es un ISBN de 13 digitos
	
	public static boolean validarISBN13_Exp(String ISBN) {
		 
	    return ISBN.matches("^(978|979)[0-9]{9}$");
	 
	}











}
