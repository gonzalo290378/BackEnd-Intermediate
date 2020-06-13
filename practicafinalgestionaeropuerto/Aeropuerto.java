package practicafinalgestionaeropuerto;

import java.io.Serializable;
import java.util.Calendar;


public abstract class Aeropuerto implements Comparable<Aeropuerto>, Serializable{
	
	protected static final long serialVersionUID=1L;

	private String nombre;
	private Direccion direccion;
	private int anioInauguracion;
	private int capacidad;
	private final int CAPACIDAD_MAXIMA = 20;
	private Avion[] aviones = new Avion[CAPACIDAD_MAXIMA];
	private int numeroAviones;
	private static int id_Autonumerado = 1;
	private int id = id_Autonumerado;

	// CONSTRUCTOR 1
	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones = new Avion[CAPACIDAD_MAXIMA];
		this.numeroAviones = 0;
		id_Autonumerado++;

	}

	// CONSTRUCTOR 2
	public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
		this(nombre, direccion.getPais(), direccion.getCalle(), direccion.getNumero(), direccion.getCiudad(),
				anioInauguracion, capacidad);
	}

	@Override
	public int compareTo(Aeropuerto a) {
		if (this.anioInauguracion > a.getAnioInauguracion()) {
			return -1;
		} else if (this.anioInauguracion < a.getAnioInauguracion()) {
			return 1;
		} else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeropuerto other = (Aeropuerto) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public abstract void calcularGananciasTotales(double cantidadGanada);

	public int getNumeroAviones() {
		return numeroAviones;
	}

	private String mostrarAviones() {
		String avionesCadena = "";
		for (int i = 0; i < numeroAviones; i++) {
			if (this.aviones[i].isActivado()) { //SOLO MUESTRA LOS AVIONES ACTIVADOS
				avionesCadena += aviones[i] + "\n";
			}

		}
		return avionesCadena;
	}

	public void aniadirAvion(Avion avion) {
		if (numeroAviones <= CAPACIDAD_MAXIMA) {
			this.aviones[numeroAviones] = avion;
			numeroAviones++;
		} else {
			System.out.println("Maxima cantidad de aviones permitidos");
		}

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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getAnioInauguracion() {
		return anioInauguracion;
	}

	public void setAnioInauguracion(int anioInauguracion) {
		this.anioInauguracion = anioInauguracion;
	}

	public int getCapacidad(int anioInauguracion) {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public final int aniosAbierto() {

		return Calendar.getInstance().get(Calendar.YEAR) - anioInauguracion;
	}

	@Override
	public String toString() {
		return "ID Aeropuerto=" + id + " Aeropuerto [Nombre=" + nombre + ", Direccion=" + direccion
				+ ", Año Inauguracion=" + anioInauguracion + ", Capacidad=" + capacidad + "\n"
				+ "Cuenta con los siguientes aviones=" + "\n" + mostrarAviones() + "]" + "\n";
	}

}

