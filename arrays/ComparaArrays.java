package arrays;

import java.util.Arrays;

public class ComparaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a1= {1,2,3,4,5};
		int [] a2= {1,2,3,4,7};
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Los arrays son iguales");
		}else System.out.println("Los arrays son diferentes");

	}

}
