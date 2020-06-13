package programacionObjetos;

import java.util.Calendar;

public class ThisMejora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AeropuertoThis a1 = new AeropuertoThis("Pistarini", "Argentina", "Arevalo", 2364, "Buenos Aires", 1976, 2000);

		System.out.println(a1);

		System.out.println(a1.aniosAbierto());

		DireccionThis mexico = new DireccionThis("Mexico", "11 de Septiembre", 2871, "Cancun");

		AeropuertoThis a2 = new AeropuertoThis("Las Americas", mexico, 1980, 4000);

		System.out.println(a2);

		System.out.println(a2.aniosAbierto());

	}

}

class AeropuertoThis {

	private String nombre;
	private DireccionThis DireccionThis;
	private int anioInauguracion;
	private int capacidad;

	public AeropuertoThis(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.DireccionThis = new DireccionThis(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
	}

	public AeropuertoThis(String nombre, DireccionThis DireccionThis, int anioInauguracion, int capacidad) {
		this(nombre, DireccionThis.getPais(), DireccionThis.getCalle(), DireccionThis.getNumero(),
				DireccionThis.getCiudad(), anioInauguracion, capacidad);
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

	public DireccionThis getDireccionThis() {
		return DireccionThis;
	}

	public void setDireccionThis(DireccionThis DireccionThis) {
		this.DireccionThis = DireccionThis;
	}

	public String toString() {
		return "AeropuertoThis [nombre=" + nombre + " DireccionThis=" + DireccionThis + " Año Inauguracion="
				+ anioInauguracion + ", capacidad=" + capacidad + "]";
	}

}

class AvionThis {

	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public AvionThis(String modelo, int numeroAsientos, double velocidadMaxima) {
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
		return "AvionThis [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

}

class DireccionThis {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public DireccionThis(String pais, String calle, int numero, String ciudad) {

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
		return "DireccionThis [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}