package polimorfismo;

import java.util.Calendar;

public class Polimorfico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionHijo b1 = new DireccionHijo("Argentina", "Isidoro", 2000, "Argentina");

		DireccionHijo b2 = new DireccionHijo("Brasil", "Caldeano", 2000, "Rio De Janeiro");

		AeropuertoPrivado a = new AeropuertoPrivado("Almirante Tenas", b2, 1945, 10000, 2);
				
		System.out.println(a + "\n");
				
		a.gananciasTotales(20000);
		
		AeropuertoPublico a1 = new AeropuertoPublico("Jorge Newery", b1, 2000, 2000, 2000, 10);
		
		System.out.println(a1 + "\n");
		
		a1.gananciasTotales(10000);


		
		
		

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
	
	public void gananciasTotales(double cantidadGanada) {
		cantidadGanada= cantidadGanada/this.getNumerosSocios();
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
		return super.toString() + " es PRIVADO tiene " + numerosSocios + " socios";
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
		cantidadGanada= financiacion + this.getNumTrabajadoresDiscapacitados()*100;
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
		return super.toString() + " y su PUBLICA financiacion del estado es de " + financiacion + " pesos y  hay "
				+ numTrabajadoresDiscapacitados + " trabajadores discapacitad.";
	}

	

}

abstract class AeropuertoPadre {

	private String nombre;
	private DireccionHijo DireccionHijo;
	private int anioInauguracion;
	private int capacidad;
	private static int autoNumerado = 1;
	private int id;

	public AeropuertoPadre(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {

		this.DireccionHijo = new DireccionHijo(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.id = autoNumerado++;

	}

	public AeropuertoPadre(String nombre, DireccionHijo DireccionHijo, int anioInauguracion, int capacidad) {
		this(nombre, DireccionHijo.getPais(), DireccionHijo.getCalle(), DireccionHijo.getNumero(),
				DireccionHijo.getCiudad(), anioInauguracion, capacidad);
		

	}

	public AeropuertoPadre() {
		this.id = autoNumerado++;
	}
	
	public abstract void gananciasTotales(double gananciasTotales);

	public static int getAutoNumerado() {
		return autoNumerado;
	}

	public int getId() {
		return id;
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
		return "[nombre=" + nombre + " Id: " + id + " Direccion=" + DireccionHijo + " Año Inauguracion="
				+ anioInauguracion + ", capacidad=" + capacidad + "]" +  "\n";
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
