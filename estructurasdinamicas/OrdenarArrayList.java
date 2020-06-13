package estructurasdinamicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class OrdenarArrayList {

	public static void main(String[] args) {
		ArrayList<Avion2> aviones1 = new ArrayList();

		Avion2 a1 = new Avion2("Boeing 123", 450, 100);
		Avion2 a2 = new Avion2("Concorde", 750, 600);
		Avion2 a3 = new Avion2("Jumbo", 1550, 800);

		aviones1.add(a1);
		aviones1.add(a2);
		aviones1.add(a3);
		
		Collections.sort(aviones1, new Comparator<Avion2>() {
		    
		    public int compare(Avion2 o1, Avion2 o2) {
		        return o1.compareTo(o2); 
		    }
	    
		});
		
		System.out.println(aviones1);
		

	}

}

class Avion2 {

	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public Avion2(String modelo, int numeroAsientos, double velocidadMaxima) {
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.velocidadMaxima = velocidadMaxima;
	}

	
	
	public int compareTo(Avion2 o) {// 0 son iguales //-1 significa que el que llama la funcion es menor que
												// el parametro y alreves el 1
		if (this.velocidadMaxima < o.velocidadMaxima) {
			return -1;
		} else if (this.velocidadMaxima > o.velocidadMaxima) {
			return 1;
		} else
			return 0;

	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String toString() {
		return "Avion2 [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

}
