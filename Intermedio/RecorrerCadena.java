package Intermedio;

import java.util.Scanner;

public class RecorrerCadena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.println("Inserta una frase");
		String frase = sc.next();
		char ch;
		for (int i = 0; i < frase.length(); i++) {
			ch=frase.charAt(i);
			System.out.println(ch);
		}

	}

}
