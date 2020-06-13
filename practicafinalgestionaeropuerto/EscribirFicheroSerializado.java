package practicafinalgestionaeropuerto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirFicheroSerializado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cuando serializo cojo directamente todo el aeropuerto con la direccion, modelos, avion evitando como lo que se
		//hizo anteriormente en la clase EscribirAvionDos.java, donde tuvimos que invocar a cada propiedad del avion.
		//Con la serializacion se hace todo de una.

		Direccion d=new Direccion("España", "Mentiras",1 , "Ciudad Real");
		
		AeropuertoPrivado a1=new AeropuertoPrivado(5, "Quijotes", d, 1970, 1000);
		
		AeropuertoPublico a2=new AeropuertoPublico(100000, 10, "Adolfo Suarez", "España", "calle", 1, "Madrid",2000, 250000);
		
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("aeropuertos.ddr"))) {
				
			oos.writeObject(a1);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//AQUI USO EL MIOBJECTOUTPUTSTREAM: YO AQUI ABRO, ESCRIBO, CIERRO...PARA QUE NO MACHAQUE LE PONGO EL TRUE
		try (MiObjectOutputStream moos=new MiObjectOutputStream(new FileOutputStream("aeropuertos.ddr",true))) {
			
			moos.writeObject(a2);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
