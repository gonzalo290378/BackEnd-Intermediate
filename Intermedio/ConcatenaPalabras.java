package Intermedio;

import java.util.Scanner;


public class ConcatenaPalabras {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Dame una cadena");
        String cadUsuario = sc.nextLine();

        String concatenar = "";

        while (!cadUsuario.isEmpty()) { // !cadUsuario.equals("")

            concatenar += cadUsuario + " "; // concatenar = concatenar + cadUsuario;

            System.out.println("Dame una cadena");
            cadUsuario = sc.nextLine();

        }

        System.out.println(concatenar);
        
        sc.close();
    }

}

