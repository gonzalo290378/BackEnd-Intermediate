package practicafinalgestionaeropuerto;

import java.io.Serializable;

class AeropuertoPublico extends Aeropuerto implements Serializable{

	private double financiacion;
	private int numeroTrabajadoresDiscapacitados;

	public AeropuertoPublico(double financiacion, int numeroTrabajadoresDiscapacitados, String nombre,
			Direccion direccion, int anioInauguracion, int capacidad) {
		super(nombre, direccion, anioInauguracion, capacidad);
		this.financiacion = financiacion;
		this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
	}

	public AeropuertoPublico(double financiacion, int numeroTrabajadoresDiscapacitados, String nombre, String pais,
			String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
		super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
		this.financiacion = financiacion;
		this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
	}

	public double getFinanciacion() {
		return financiacion;
	}

	public void setFinanciacion(double financiacion) {
		this.financiacion = financiacion;
	}

	public int getNumeroTrabajadoresDiscapacitados() {
		return numeroTrabajadoresDiscapacitados;
	}

	public void setNumeroTrabajadoresDiscapacitados(int numeroTrabajadoresDiscapacitados) {
		this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
	}

	@Override
	public String toString() {
		return super.toString() + "El aeropuerto es publico y la Financiacion por parte del estado es de "
				+ financiacion + " y hay " + numeroTrabajadoresDiscapacitados + " trabajadores discapacitados" + "\n";
	}

	@Override
	public void calcularGananciasTotales(double cantidadGanada) {
		double ganancia = this.financiacion + cantidadGanada + (numeroTrabajadoresDiscapacitados * 100);
		System.out.println("La ganancia ha sido de " + ganancia + " dolares");

	}

}

