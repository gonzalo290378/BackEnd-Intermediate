package estructurasdinamicas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

//En este ejemplo adptamos los array a ArrayList


abstract class Aeropuerto implements Comparable<Aeropuerto> {

	private String nombre;
	private Direccion direccion;
	private int anioInauguracion;
	private int capacidad;
	private ArrayList<Avion3> aviones = new ArrayList();
	private static int id_Autonumerado = 1;
	private int id = id_Autonumerado;

	// CONSTRUCTOR 1
	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones=new ArrayList();
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

	

	private String mostrarAviones() {
		String avionesCadena = "";
		for (Avion3 a: aviones) {
			if (a.isActivado()) { //SOLO MUESTRA LOS Avion3ES ACTIVADOS
				avionesCadena += a.toString() + "\n";
			}

		}
		return avionesCadena;
	}

	public void aniadirAvion3(Avion3 a) {
		if (a!=null) {
			this.aviones.add(a);
		} else {
			System.out.println("");
		}

	}
	
	public void eliminarAvion(Avion3 a) {
		if (a!=null) {
			this.aviones.remove(a);
		} else {
			System.out.println("");
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
				+ "Cuenta con los siguientes Avion3es=" + "\n" + mostrarAviones() + "]" + "\n";
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
		return "[Pais=" + pais + ", Calle=" + calle + ", Numero=" + numero + ", Ciudad=" + ciudad + "]";
	}

}

class Avion3 implements Activable {

	private String modelo;
	private int numeroAsientos;
	private int velocidadMaxima;
	private boolean activado;

	public Avion3(String modelo, int numeroAsientos, int velocidadMaxima) {
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion3 other = (Avion3) obj;
		return Objects.equals(modelo, other.modelo);
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

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public boolean isActivado() {
		// TODO Auto-generated method stub
		return this.activado;
	}

	@Override
	public boolean setActivado(boolean valor) {
		// TODO Auto-generated method stub
		return this.activado = valor;
	}

	@Override
	public String toString() {
		return "Avion3 [Modelo=" + modelo + ", Numero Asientos=" + numeroAsientos + ", Velocidad Maxima="
				+ velocidadMaxima + "]";
	}

}

interface Activable {

	abstract boolean isActivado();

	abstract boolean setActivado(boolean valor);
}
