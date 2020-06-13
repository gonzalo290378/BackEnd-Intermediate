package programacionObjetos;

import java.util.Calendar;

public class AsociacionAeropuertoAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionAsociado mexico = new DireccionAsociado("Mexico", "11 de Septiembre", 2871, "Cancun");

		AeropuertoAsociado a2 = new AeropuertoAsociado("Las Americas", mexico, 1980, 4000);

		AvionAsociado nuevoAvion = new AvionAsociado("Boeing 347", 200, 400);

		AvionAsociado nuevoAvion2 = new AvionAsociado("Boeing 743", 400, 100);

		a2.aniadirAvion(nuevoAvion);

		a2.aniadirAvion(nuevoAvion2);
		
		System.out.println(a2);
	}

}

class AeropuertoAsociado {

	private final int MAX_AVIONES = 20;
	private AvionAsociado[] aviones;
	private int numeroAviones;

	private String nombre;
	private DireccionAsociado DireccionAsociado;
	private int anioInauguracion;
	private int capacidad;
	
	

	public AeropuertoAsociado() {
		aviones=new AvionAsociado[MAX_AVIONES];
		this.numeroAviones = 0;

	}

	public AeropuertoAsociado(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.DireccionAsociado = new DireccionAsociado(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones = new AvionAsociado[MAX_AVIONES];
		this.numeroAviones = 0;
	}

	public AeropuertoAsociado(String nombre, DireccionAsociado DireccionAsociado, int anioInauguracion, int capacidad) {

		this.nombre = nombre;
		this.DireccionAsociado = DireccionAsociado;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		aviones = new AvionAsociado[MAX_AVIONES];
		this.numeroAviones = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioInauguracion() {
		return anioInauguracion;
	}

	public void setAnioInauguracion(int anioInauguracion) {
		this.anioInauguracion = anioInauguracion;
	}

	public int getcapacidad() {
		return capacidad;
	}

	public void setcapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int aniosAbierto() {
		int dia = Calendar.getInstance().get(Calendar.YEAR);
		return dia - anioInauguracion;

	}

	public DireccionAsociado getDireccionAsociado() {
		return DireccionAsociado;
	}

	public void setDireccionAsociado(DireccionAsociado DireccionAsociado) {
		this.DireccionAsociado = DireccionAsociado;
	}

	public int getNumeroAviones() {
		return numeroAviones;
	}

	public void aniadirAvion(AvionAsociado a) {
		if (numeroAviones < MAX_AVIONES) {
			this.aviones[numeroAviones] = a;
			numeroAviones++;
		} else
			System.out.println("No se pueden ingresar mas aviones");
	}

	private String mostrarAviones() {
		String avionesEnAeropuerto = "";
		for (int i = 0; i < numeroAviones; i++) {
			avionesEnAeropuerto += aviones[i] + "\n";
		}
		return avionesEnAeropuerto;
	}

	public String toString() {
		return "AeropuertoAsociado nombre=" + nombre + " DireccionAsociado=" + DireccionAsociado + " Año Inauguracion="
				+ anioInauguracion + ", capacidad=" + capacidad + "\n" +  "Donde se encuentran las siguientes flotas="
				+ "\n" + "\n"  + this.mostrarAviones();
	}

}

class AvionAsociado {

	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public AvionAsociado(String modelo, int numeroAsientos, double velocidadMaxima) {
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
		return "AvionAsociado [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

}


class DireccionAsociado {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public DireccionAsociado(String pais, String calle, int numero, String ciudad) {

		this.pais = pais;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "DireccionAsociado [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}
