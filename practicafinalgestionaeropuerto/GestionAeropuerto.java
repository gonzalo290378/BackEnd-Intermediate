package practicafinalgestionaeropuerto;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionAeropuerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAX_AEROPUERTOS = 40;
		boolean salir = false;
		int opcion, anioInauguracion, capacidad, tipo, financiacion, numeroTrabajadoresDiscapacitados, numeroSocios,
				numeroAsientos, velocidadMaxima, activado;
		int datoAValidar = 0;
		String nombre, pais, ciudad, calle, modelo;
		Aeropuerto aeropuertos[] = new Aeropuerto[MAX_AEROPUERTOS];
		Aeropuerto aeropuertoAux;
		Avion avionAux;
		int numeroDeAeropuerto = 0;
		int idAeropuerto = 0;
		final int TIPO_PUBLICO = 1;
		final int TIPO_PRIVADO = 2;
		final int AVION_ACTIVO = 1;
		final int AVION_DESACTIVADO = 2;
		double cantidadGanada;

		while (!salir) {
			menu();

			try {

				System.out.println("Elija una de las opciones");

				opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {

				case 1:

					System.out.println("Nombre del Aeropuerto");
					nombre = sc.nextLine();

					System.out.println("Pais del Aeropuerto");
					pais = sc.nextLine();

					System.out.println("Ciudad del Aeropuerto");
					ciudad = sc.nextLine();

					System.out.println("Calle del Aeropuerto");
					calle = sc.nextLine();

					System.out.println("Año de Inauguracion");
					anioInauguracion = validarDatos(datoAValidar, sc);

					System.out.println("Capacidad del Aeropuerto");
					capacidad = validarDatos(datoAValidar, sc);

					System.out.println("1. - Publico - 2. - Privado ");
					tipo = validarTipo(datoAValidar, sc);

					if (tipo == TIPO_PUBLICO) {

						System.out.println("Financiacion");
						financiacion = validarDatos(datoAValidar, sc);

						System.out.println("Numero de trabajadores discapacitados");
						numeroTrabajadoresDiscapacitados = validarDatos(datoAValidar, sc);

						aeropuertoAux = new AeropuertoPublico(financiacion, numeroTrabajadoresDiscapacitados, nombre,
								pais, calle, 0, ciudad, anioInauguracion, capacidad);

					} else {

						System.out.println("Numero de Socios");
						numeroSocios = validarDatos(datoAValidar, sc);

						aeropuertoAux = new AeropuertoPrivado(numeroSocios, nombre, pais, calle, 0, ciudad,
								anioInauguracion, capacidad);

					}

					aeropuertos[numeroDeAeropuerto] = aeropuertoAux;
					numeroDeAeropuerto++;

					break;

				case 2:

					System.out.println("Modelo del Avion");
					modelo = sc.nextLine();

					System.out.println("Numero de Asientos");
					numeroAsientos = validarDatos(datoAValidar, sc);

					System.out.println("Velocidad Maxima");
					velocidadMaxima = validarDatos(datoAValidar, sc);

					System.out.println("1.- Activado || 2. - Desactivado");
					activado = validarTipo(datoAValidar, sc);

					avionAux = new Avion(modelo, numeroAsientos, velocidadMaxima);
					if (activado == AVION_ACTIVO) {
						avionAux.setActivado(true);
					}

					System.out.println("Aeropuerto al cual pertenece. Elija un ID");

					if (numeroDeAeropuerto == 0) {
						System.out.println("No hay aeropuertos para añadir aviones");
						System.out.println("----------------------------------");
						break;
					} else {
						mostrarAeropuertos(aeropuertos, numeroDeAeropuerto);

						idAeropuerto = validarDatos(datoAValidar, sc);
					}

					if (idAeropuerto > numeroDeAeropuerto) {
						System.out.println("El aeropuerto no existe.");

					} else
						aeropuertos[idAeropuerto - 1].aniadirAvion(avionAux);

					break;

				case 3:

					System.out.println("Elige un aeropuerto");
					mostrarAeropuertos(aeropuertos, numeroDeAeropuerto);
					idAeropuerto = validarDatos(datoAValidar, sc);

					if (idAeropuerto > numeroDeAeropuerto) {
						System.out.println("El aeropuerto no existe.");
						System.out.println("---------------------------------------");

					} else {
						System.out.println(aeropuertos[idAeropuerto - 1].toString());
						System.out.println("---------------------------------------");
					}

					break;

				case 4:
					System.out.println("Elige un aeropuerto para calcular los años abierto");
					mostrarAeropuertos(aeropuertos, numeroDeAeropuerto);

					idAeropuerto = validarDatos(datoAValidar, sc);

					if (idAeropuerto > numeroDeAeropuerto) {
						System.out.println("El aeropuerto no existe.");
						System.out.println("---------------------------------------");

					} else {
						System.out.println("El aeropuerto lleva abierto " + aeropuertos[idAeropuerto - 1].aniosAbierto()
								+ " años");
						System.out.println("---------------------------------------");
					}

					break;

				case 5:

					System.out.println("Ganancias del Aeropuerto: (Elije uno)");
					mostrarAeropuertos(aeropuertos, numeroDeAeropuerto);

					idAeropuerto = validarDatos(datoAValidar, sc);

					if (idAeropuerto > numeroDeAeropuerto) {
						System.out.println("El aeropuerto no existe.");
						System.out.println("---------------------------------------");
					} else {
						System.out.println("Ingrese las ganancias del aeropuerto");

						cantidadGanada = sc.nextDouble();

						if (aeropuertos[idAeropuerto - 1] instanceof AeropuertoPrivado) {
							aeropuertos[idAeropuerto - 1].calcularGananciasTotales(cantidadGanada);

						} else {
							aeropuertos[idAeropuerto - 1].calcularGananciasTotales(cantidadGanada);

						}

					}

					break;

				case 6:

					salir = true;
					break;

				}

			} catch (InputMismatchException e) {
				System.out.println("Por favor inserte un numero del menu principal");
				sc.next();
			}

		}

	}

	private static void menu() {
		System.out.println("1.- Añadir Aeropuerto");
		System.out.println("2.- Añadir Avion");
		System.out.println("3.- Informacion sobre el Aeropuerto");
		System.out.println("4.- Cantidad de años de apertura del Aeropuerto");
		System.out.println("5.- Ganancias del Aeropuerto");
		System.out.println("6.- Salir del Sistema");
		System.out.println("-------------------------------------------------------");

	}

	public static void mostrarAeropuertos(Aeropuerto[] aeropuertos, int numeroDeAeropuerto) {

		for (int i = 0; i < numeroDeAeropuerto; i++) {
			if (aeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println(
						"ID=" + aeropuertos[i].getId() + " NOMBRE= " + aeropuertos[i].getNombre() + " TIPO PRIVADO");
			} else {
				System.out.println(
						"ID=" + aeropuertos[i].getId() + " NOMBRE= " + aeropuertos[i].getNombre() + " TIPO PUBLICO");

			}
		}
	}

	public static int validarTipo(int datoAValidar, Scanner sc) {

		boolean bandera = false;

		while (!bandera) {
			datoAValidar = sc.nextInt();
			sc.nextLine();
			if (datoAValidar > 0 && datoAValidar <= 2) {
				return datoAValidar;
			} else {
				bandera = false;
				System.out.println("Por favor debes elegir entre 1 y 2");
			}
		}
		return datoAValidar;
	}

	public static int validarDatos(int datoAValidar, Scanner sc) {

		boolean bandera = false;
		while (!bandera) {
			try {
				datoAValidar = Integer.parseInt(sc.nextLine());
				if (datoAValidar > 0 && datoAValidar < Integer.MAX_VALUE)
					return datoAValidar;
			} catch (Exception e) {
				bandera = false;
				System.out.println("Por favor inserta un numero, ya que es una letra");
			}
		}
		return datoAValidar;
	}

}
