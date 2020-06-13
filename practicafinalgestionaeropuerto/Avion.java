package practicafinalgestionaeropuerto;

import java.io.Serializable;

class Avion implements Activable, Serializable {
	
	private static final long serialVersionUID=1L;


	private String modelo;
	private int numeroAsientos;
	private int velocidadMaxima;
	private boolean activado;

	public Avion(String modelo, int numeroAsientos, int velocidadMaxima) {
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

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public boolean isActivado() {
		// TODO Auto-generated method stub
		return this.activado;
	}

	@Override
	public boolean setActivado(boolean valor) {
		// TODO Auto-generated method stub
		return this.activado = valor;
	}

	@Override
	public String toString() {
		return "Avion [Modelo=" + modelo + ", Numero Asientos=" + numeroAsientos + ", Velocidad Maxima="
				+ velocidadMaxima + "]";
	}

}
