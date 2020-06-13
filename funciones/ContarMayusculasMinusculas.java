package funciones;

public class ContarMayusculasMinusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidadMayusculas = contarPalabras("Hola como Andas", true);
		System.out.println(cantidadMayusculas);
	}

	public static int contarPalabras(String frase, boolean estado) {
		int mayusculas = 0;
		int minusculas = 0;

		if (estado == true) {
			char letra;
			for (int i = 0; i < frase.length(); i++) {
				letra = frase.charAt(i);
				if (Character.isUpperCase(letra)) {
					mayusculas++;
				}
			}

			return mayusculas;
		}

		else if (estado == false) {
			char letra;
			for (int i = 0; i < frase.length(); i++) {
				letra = frase.charAt(i);
				if (Character.isLowerCase(letra)) {
					minusculas++;
				}
			}

		}

		return minusculas;

	}

}
