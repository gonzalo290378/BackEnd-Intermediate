package programacionObjetos;

import java.util.Calendar;

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DireccionCompare mexico = new DireccionCompare("Mexico", "11 de Septiembre", 2871, "Cancun");

		AeropuertoCompare a1 = new AeropuertoCompare("Las Americas", mexico, 1980, 4000);

		AeropuertoCompare a2 = new AeropuertoCompare("Sao Paulo", mexico, 1980, 2500);

		AeropuertoCompare a3 = new AeropuertoCompare("Sao Paulo", mexico, 1955, 4700);

		AeropuertoCompare a4 = new AeropuertoCompare("Sao Paulo", mexico, 1988, 5800);

		AeropuertoCompare a5 = new AeropuertoCompare("Sao Paulo", mexico, 1945, 1971);

		// compareTo y equals

		// compareTo:
		//Siempre teniendo en referencia al primero:
		// a1<a2=-1
		// a1>a2=1
		// a1=a2=0

		switch (a1.compareTo(a2)) {
		case 1:

			System.out.println("a1 es mayor a a2");
			break;

		case 0:
			System.out.println("a1 es igual a a2");
			break;

		case -1:
			System.out.println("a1 es menor a a2");
			break;
		}
	}

}

class AeropuertoCompare implements Comparable<AeropuertoCompare> {

	private static int autoNumerado = 1;
	private int id;

	private final int MAX_AVIONES = 20;
	private AvionAtributo[] aviones;
	private int numeroAviones;

	private String nombre;
	private DireccionCompare direccion;
	private int anioInauguracion;
	private int capacidad;

	public AeropuertoCompare() {
		this.id = autoNumerado++;
		this.aviones = new AvionAtributo[MAX_AVIONES];
		this.numeroAviones = 0;

	}

	public AeropuertoCompare(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion,
			int capacidad) {
		this.id = autoNumerado++;
		this.direccion = new DireccionCompare(pais, calle, numero, ciudad);
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.aviones = new AvionAtributo[MAX_AVIONES];
		this.numeroAviones = 0;
	}

	public AeropuertoCompare(String nombre, DireccionCompare direccion, int anioInauguracion, int capacidad) {
		this.id = autoNumerado++;
		this.nombre = nombre;
		this.direccion = direccion;
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

	public DireccionCompare getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionCompare direccion) {
		this.direccion = direccion;
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
		return "Aeropuerto con ID =" + this.id + " y nombre " + nombre + " direccion=" + direccion
				+ " Año Inauguracion=" + anioInauguracion + ", capacidad=" + capacidad
				+ " donde se encuentran las siguientes flotas" + "\n" + this.mostrarAviones();
	}


	@Override
	public int compareTo(AeropuertoCompare o) {// 0 son iguales //-1 significa que el que llama la funcion es menor que
												// el parametro y alreves el 1
		if (this.anioInauguracion < o.anioInauguracion) {
			return -1;
		} else if (this.anioInauguracion > o.anioInauguracion) {
			return 1;
		} else
			return 0;

	}

}


class DireccionCompare {

	private String pais;
	private String calle;
	private int numero;
	private String ciudad;

	public DireccionCompare(String pais, String calle, int numero, String ciudad) {

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
		return "DireccionCompare [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}

