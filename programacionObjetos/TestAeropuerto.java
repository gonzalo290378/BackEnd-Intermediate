package programacionObjetos;

import java.util.Calendar;

public class TestAeropuerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeropuerto a1 = new Aeropuerto("Pistarini", "Argentina", "Arevalo", 2364, "Buenos Aires", 1976, 2000);

		System.out.println(a1);

		System.out.println(a1.aniosAbierto());

		Direccion mexico = new Direccion("Mexico", "11 de Septiembre", 2871, "Cancun");

		Aeropuerto a2 = new Aeropuerto("Las Americas", mexico, 1980, 4000);

		System.out.println(a2);

		System.out.println(a2.aniosAbierto());

	}

}

class Direccion {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public Direccion(String pais, String calle, int numero, String ciudad) {

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
		return "Direccion [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}

class Aeropuerto {

	private String nombre;
	private Direccion direccion;
	private int anioInauguracion;
	private int capacidad;

	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
	}

	public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String toString() {
		return "Aeropuerto [nombre=" + nombre + " direccion=" + direccion + " Año Inauguracion=" + anioInauguracion
				+ ", capacidad=" + capacidad + "]";
	}

}