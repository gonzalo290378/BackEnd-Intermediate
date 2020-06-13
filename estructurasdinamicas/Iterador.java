package estructurasdinamicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Iterador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Avion1> aviones=new ArrayList();
		
		Avion1 a1=new Avion1("Boeing 123", 450,900);
		Avion1 a2=new Avion1("Concorde", 750,600);
		Avion1 a3=new Avion1("Jumbo",1550,800);
		
		aviones.add(a1);
		aviones.add(a2);
		aviones.add(a3);
		
		Iterator<Avion1> it=aviones.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	
	}

}

class Avion1 {
	
	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public Avion1(String modelo, int numeroAsientos, double velocidadMaxima) {
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion1 other = (Avion1) obj;
		return Objects.equals(modelo, other.modelo);
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
		return "Avion1 [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima=" + velocidadMaxima
				+ "]";
	}

}

