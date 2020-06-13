package Intermedio;

import java.util.Scanner;

 class MayusculasEnAscii {

		public static void main(String[] args) {
		
		char[]mayusculas= new char[91-65];
		System.out.println("Imprimir Abecedario Mayusculas");

		for(int i=65, indice=0 ;i<91;i++,indice++) {
			mayusculas[indice]=(char)(i);
			System.out.println("Letra: " + mayusculas[indice]);
		}
		
		Scanner entradaUser=new Scanner(System.in);
		String cadena="";
		System.out.println("Ingrese un numero entre 0 y " + (mayusculas.length-1) + " y luego -1 para codificar");	
		int letra=entradaUser.nextInt();

		while(!(letra==-1)){
		if(letra>=0 && letra<=mayusculas.length) {
		cadena+=mayusculas[letra];
		}else System.out.println("El numero no esta entre 0 y " + (mayusculas.length-1));
		
		System.out.println("Ingrese el siguiente: ");
		letra=entradaUser.nextInt();

		}

		System.out.println("La cadena resultante es: " + cadena + " .Fin de la aplicacion");
		
		}

		}

		

		
		
