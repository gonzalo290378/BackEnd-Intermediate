package programacionObjetos;

import java.util.Calendar;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionHijo mexico = new DireccionHijo("Mexico", "11 de Septiembre", 2871, "Cancun");

		AeropuertoPublico a1 = new AeropuertoPublico("Las Americas", mexico, 1980, 4000, 3000000,1500);

		AeropuertoPrivado a2 = new AeropuertoPrivado("Sao Paulo", mexico, 1980, 2500, 300);

		System.out.println(a1);
		
		System.out.println(a2);
	}

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

	public int getNumerosSocios() {
		return numerosSocios;
	}

	public void setNumerosSocios(int numerosSocios) {
		this.numerosSocios = numerosSocios;
	}

	@Override
	public String toString() {
		return "AeropuertoPrivado [Numero de Socios=" + getNumerosSocios() + "]";
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
		this.numTrabajadoresDiscapacitados=numTrabajadoresDiscapacitados;
		this.financiacion=financiacion;
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
		return "AeropuertoPublico [financiacion=" + financiacion + ", Trabajadores discapacitados="
				+ numTrabajadoresDiscapacitados + "]";
	}

	

	

}

class AeropuertoPadre {

	private String nombre;
	private DireccionHijo DireccionHijo;
	private int anioInauguracion;
	private int capacidad;

	public AeropuertoPadre(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.DireccionHijo = new DireccionHijo(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
	}

	public AeropuertoPadre(String nombre, DireccionHijo DireccionHijo, int anioInauguracion, int capacidad) {
		this(nombre, DireccionHijo.getPais(), DireccionHijo.getCalle(), DireccionHijo.getNumero(),
				DireccionHijo.getCiudad(), anioInauguracion, capacidad);
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

	public DireccionHijo getDireccionHijo() {
		return DireccionHijo;
	}

	public void setDireccionHijoThis(DireccionHijo DireccionHijo) {
		this.DireccionHijo = DireccionHijo;
	}

	public String toString() {
		return "AeropuertoPadre [nombre=" + nombre + " DireccionHijoThis=" + DireccionHijo + " Año Inauguracion="
				+ anioInauguracion + ", capacidad=" + capacidad + "]";
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
		return "DireccionHijo [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}
