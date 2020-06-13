package practicafinalgestionaeropuerto;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerFicheroSerializado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aeropuertos.ddr"))) {

			while(true) {
				Aeropuerto a=(Aeropuerto)ois.readObject();
				System.out.println(a);
			}

			


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		}catch(ClassNotFoundException e) {
			e.getMessage();
		}

	}

}
