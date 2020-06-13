package programacionObjetos;

public class TestAvion {

	public static void main(String[] args) {
		
		Avion a1=new Avion("Boeing 777", 200, 3500);
		System.out.println(a1.toString());

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
