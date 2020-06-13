package estructurasdinamicas;

import java.util.ArrayList;

public class CrearArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer>lista= new ArrayList(); //ESTO VA A SER UN ARRAYLIST DE INTEGER, SI NO LE PONGO NADA, ME VA A TRAER LOS METODOS DE LA CLASE OBJECT
		int cantidadNumeros=generaNumeroAleatorio(1, 20);
		
		for (int i = 0; i < cantidadNumeros; i++) {
			lista.add(generaNumeroAleatorio(1, 10));
		}
		
		 for (Integer i : lista) { //CON FOR EACH
			System.out.println(i);
		}
		
		/*
		  for (int i = 0; i < lista.size(); i++) { //CON FOR TRADICIONAL
		 
			System.out.println(lista.get(i));
		}
	*/
		
		

	}

	public static int generaNumeroAleatorio(int minimo, int maximo) {
		return (int) (Math.random() * (maximo - minimo + 1) + minimo);
	}

}
