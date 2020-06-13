package interfaz;

import java.util.Calendar;


public class Interfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionHijo b1 = new DireccionHijo("Argentina", "Isidoro", 2000, "Argentina");

		DireccionHijo b2 = new DireccionHijo("Brasil", "Caldeano", 2000, "Rio De Janeiro");

		AeropuertoPrivado a = new AeropuertoPrivado("Almirante Tenas", b2, 1945, 10000, 2);

		AeropuertoPublico a1 = new AeropuertoPublico("Jorge Newery", b1, 2000, 2000, 2000, 10);

		Avion nuevoAvion = new Avion("Boeing 347", 200, 400);

		Avion nuevoAvion2 = new Avion("Concorde 743", 400, 100);

		a.aniadirAvion(nuevoAvion);

		a1.aniadirAvion(nuevoAvion2);
		
		nuevoAvion.setActivado(true);
		
		nuevoAvion2.setActivado(false);
	
		System.out.println(a + "\n");
		
		System.out.println(a1 + "\n");

	}

}

interface Activable {

	boolean isActivado();

	boolean setActivado(boolean value);

}



class AeropuertoPrivado extends AeropuertoPadre {

	private int numerosSocios;

	public AeropuertoPrivado(String nombre, DireccionHijo direccion, int anioInauguracion, int capacidad,
			int numeroSocios) {
		super(nombre, direccion, anioInauguracion, capacidad);
		this.numerosSocios = numeroSocios;
	}

	public AeropuertoPrivado(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad, int numeroSocios) {
		super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
		this.numerosSocios = numeroSocios;

	}

	public void gananciasTotales(double cantidadGanada) {
		cantidadGanada = cantidadGanada / this.getNumerosSocios();
		System.out.println("La cantidad ganada por cada socio es de " + cantidadGanada);
	}

	public int getNumerosSocios() {
		return numerosSocios;
	}

	public void setNumerosSocios(int numerosSocios) {
		this.numerosSocios = numerosSocios;
	}

	@Override
	public String toString() {
		return super.toString() + "Es PRIVADO tiene " + numerosSocios + " socios";
	}

}

class AeropuertoPublico extends AeropuertoPadre {

	public AeropuertoPublico(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad, double financiacion, int numTrabajadoresDiscapacitados) {
		super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
		this.financiacion = financiacion;
		this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
	}

	public AeropuertoPublico(String nombre, DireccionHijo direccion, int anioInauguracion, int capacidad,
			double financiacion, int numTrabajadoresDiscapacitados) {
		super(nombre, direccion, anioInauguracion, capacidad);
		this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
		this.financiacion = financiacion;
	}

	public void gananciasTotales(double cantidadGanada) {
		cantidadGanada = financiacion + this.getNumTrabajadoresDiscapacitados() * 100;
		System.out.println("La cantidad ganada por cada socio es de " + cantidadGanada);
	}

	private double financiacion;
	private int numTrabajadoresDiscapacitados;

	public double getFinanciacion() {
		return financiacion;
	}

	public void setFinanciacion(double financiacion) {
		this.financiacion = financiacion;
	}

	public int getNumTrabajadoresDiscapacitados() {
		return numTrabajadoresDiscapacitados;
	}

	public void setNumTrabajadoresDiscapacitados(int numTrabajadoresDiscapacitados) {
		this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
	}

	public String toString() {
		return super.toString() + "Es de tipo PUBLICO y financiacion del estado es de " + financiacion + " pesos y  hay "
				+ numTrabajadoresDiscapacitados + " trabajadores discapacitad.";
	}

}

abstract class AeropuertoPadre {

	private final int MAX_AVIONES = 20;
	private Avion[] aviones;
	private int numeroAviones;

	private String nombre;
	private DireccionHijo direccion;
	private int anioInauguracion;
	private int capacidad;

	public AeropuertoPadre() {
		aviones = new Avion[MAX_AVIONES];
		this.numeroAviones = 0;

	}

	public AeropuertoPadre(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.direccion = new DireccionHijo(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones = new Avion[MAX_AVIONES];
		this.numeroAviones = 0;
	}

	public AeropuertoPadre(String nombre, DireccionHijo DireccionAsociado, int anioInauguracion, int capacidad) {

		this.nombre = nombre;
		this.direccion = DireccionAsociado;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		aviones = new Avion[MAX_AVIONES];
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

	public DireccionHijo getDireccionAsociado() {
		return direccion;
	}

	public void setDireccionAsociado(DireccionHijo DireccionAsociado) {
		this.direccion = DireccionAsociado;
	}

	public int getNumeroAviones() {
		return numeroAviones;
	}

	public void aniadirAvion(Avion a) {
		if (numeroAviones < MAX_AVIONES) {
			this.aviones[numeroAviones] = a;
			numeroAviones++;
		} else
			System.out.println("No se pueden ingresar mas aviones");
	}

	private String mostrarAviones() {
		String avionesEnAeropuerto = "";
		for (int i = 0; i < numeroAviones; i++) {
			if(this.aviones[i].isActivado()) {
				avionesEnAeropuerto += aviones[i] + "\n";
			}
		}
		return avionesEnAeropuerto;
	}

	public String toString() {
		return "AeropuertoAsociado nombre=" + nombre + " Direccion=" + direccion + " Año Inauguracion="
				+ anioInauguracion + ", capacidad=" + capacidad + "\n" + "Donde se encuentran las siguientes flotas="
				+ "\n" + this.mostrarAviones();
	}

}

class DireccionHijo {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public DireccionHijo(String pais, String calle, int numero, String ciudad) {

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
		return "[pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}

class Avion implements Activable {

	private String modelo;
	private int numeroAsientos;
	private double velocidadMaxima;
	private boolean activado;

	public Avion(String modelo, int numeroAsientos, double velocidadMaxima) {
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.velocidadMaxima = velocidadMaxima;

	}

	@Override
	public boolean isActivado() {
		// TODO Auto-generated method stub
		return this.activado;
	}

	@Override
	public boolean setActivado(boolean value) {
		// TODO Auto-generated method stub
		return this.activado = value;
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
