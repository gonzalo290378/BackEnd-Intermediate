package estructurasdinamicas;

import java.util.ArrayList;
import java.util.Objects;

public class ElementoRepetido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Avion> aviones=new ArrayList();
		
		Avion a1=new Avion("Boeing 123", 450,900);
		Avion a2=new Avion("Concorde", 750,600);
		Avion a3=new Avion("Jumbo",1550,800);
		
		aviones.add(a1);
		aviones.add(a2);
		aviones.add(a3);
		
		Avion a4=new Avion("Boeing 123", 1000,2000);
		
		if(aviones.contains(a4)) {
			System.out.println("Si Existe");
		}else System.out.println("No Existe");
	
	}

}

class Avion {
	
	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public Avion(String modelo, int numeroAsientos, double velocidadMaxima) {
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
		Avion other = (Avion) obj;
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
		return "Avion [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima=" + velocidadMaxima
				+ "]";
	}

}

