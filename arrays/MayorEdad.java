package arrays;

public class MayorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]nombres= {"Fernando","Jaime","Alberto","Pepito"};
		int []edades= {28,55,20,40};
		int edadMayor=0;
		String nombreMayor = null;
		
		for (int i = 0; i < edades.length; i++) {
			if(edades[i]>edadMayor) {
				edadMayor=edades[i];
				nombreMayor=nombres[i];
			}
			
			
			
		}
		
		System.out.println("El mayor es " + nombreMayor + " con " + edadMayor + " años");

	}

}
