package programacionObjetos;

import java.util.Calendar;

public class AtributoEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionEstatico mexico = new DireccionEstatico("Mexico", "11 de Septiembre", 2871, "Cancun");

		AeropuertoAtributo a1 = new AeropuertoAtributo("Las Americas", mexico, 1980, 4000);

		AeropuertoAtributo a2 = new AeropuertoAtributo("Sao Paulo", mexico, 1930, 2500);

		AeropuertoAtributo a3 = new AeropuertoAtributo("Sao Paulo", mexico, 1955, 4700);

		AeropuertoAtributo a4 = new AeropuertoAtributo("Sao Paulo", mexico, 1988, 5800);

		AeropuertoAtributo a5 = new AeropuertoAtributo("Sao Paulo", mexico, 1945, 1971);

		System.out.println(a1);

		System.out.println(a2);

		System.out.println(a3);

		System.out.println(a4);

		System.out.println(a5);

		
		
	}

}

class AeropuertoAtributo implements Comparable<AeropuertoAtributo> {

	private static int autoNumerado = 1;
	private int id;

	private final int MAX_AVIONES = 20;
	private AvionAtributo[] aviones;
	private int numeroAviones;

	private String nombre;
	private DireccionEstatico DireccionEstatico;
	private int anioInauguracion;
	private int capacidad;

	public AeropuertoAtributo() {
		this.id = autoNumerado++;
		this.aviones = new AvionAtributo[MAX_AVIONES];
		this.numeroAviones = 0;

	}

	public AeropuertoAtributo(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {
		this.id = autoNumerado++;
		this.DireccionEstatico = new DireccionEstatico(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones = new AvionAtributo[MAX_AVIONES];
		this.numeroAviones = 0;
	}

	public AeropuertoAtributo(String nombre, DireccionEstatico DireccionEstatico, int anioInauguracion, int capacidad) {
		this.id = autoNumerado++;
		this.nombre = nombre;
		this.DireccionEstatico = DireccionEstatico;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		aviones = new AvionAtributo[MAX_AVIONES];
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

	public DireccionEstatico getDireccionEstatico() {
		return DireccionEstatico;
	}

	public void setDireccionEstatico(DireccionEstatico DireccionEstatico) {
		this.DireccionEstatico = DireccionEstatico;
	}

	public int getNumeroAviones() {
		return numeroAviones;
	}

	public void aniadirAvion(AvionAtributo a) {
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
		return "Aeropuerto con ID =" + this.id + " y nombre " + nombre + " DireccionEstatico=" + DireccionEstatico
				+ " Año Inauguracion=" + anioInauguracion + ", capacidad=" + capacidad
				+ " donde se encuentran las siguientes flotas" + "\n" + this.mostrarAviones();
	}


	@Override
	public int compareTo(AeropuertoAtributo o) {// 0 son iguales //-1 significa que el que llama la funcion es menor que
												// el parametro y alreves el 1
		if (this.anioInauguracion < o.getAnioInauguracion()) {
			return -1;
		} else if (this.anioInauguracion > o.getAnioInauguracion()) {
			return 1;
		} else
			return 0;

	}

}

class AvionAtributo {

	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;

	public AvionAtributo(String modelo, int numeroAsientos, double velocidadMaxima) {
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
		return "AvionAtributo [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

}

class DireccionEstatico {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public DireccionEstatico(String pais, String calle, int numero, String ciudad) {

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
		return "DireccionEstatico [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}

