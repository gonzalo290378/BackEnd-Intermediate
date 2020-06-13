package practicafinalgestionaeropuerto;

import java.io.Serializable;

class AeropuertoPrivado extends Aeropuerto implements Serializable {

	private int numeroSocios;

	public AeropuertoPrivado(int numeroSocios, String nombre, Direccion direccion, int anioInauguracion,
			int capacidad) {
		super(nombre, direccion, anioInauguracion, capacidad);
		this.numeroSocios = numeroSocios;
	}

	public AeropuertoPrivado(int numeroSocios, String nombre, String pais, String calle, int numero, String ciudad,
			int anioInauguracion, int capacidad) {
		super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
		this.numeroSocios = numeroSocios;
	}

	public int getNumeroSocios() {
		return numeroSocios;
	}

	public void setNumeroSocios(int numeroSocios) {
		this.numeroSocios = numeroSocios;
	}

	@Override
	public void calcularGananciasTotales(double cantidadGanada) {
		double ganancia = cantidadGanada / this.numeroSocios;
		System.out.println("La cantidad ganada por cada socio es de " + ganancia + " dolares");
	}

	@Override
	public String toString() {
		return super.toString() + "El aeropuerto es privado y tiene " + numeroSocios + " socios" + "\n";
	}

}

