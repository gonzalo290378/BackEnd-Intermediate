package arrays;

import java.math.BigDecimal;

public class Puzzle {

	public static void main(String[] args) {
		BigDecimal[] datos = { BigDecimal.valueOf(1), // VALUEOF=DEVUELVE EL STRING A INT
				BigDecimal.valueOf(2), BigDecimal.valueOf(3) // BIGDECIMAL GUARDA EL VALOR PRECISO DECIMAL E VALUEOF
																// DEVUELVE LA SALIDA A INT
		};

		Long num = 2020202020202020L;
		BigDecimal resultado = BigDecimal.valueOf(0);
		if (num < 4) {
			resultado = datos[num.intValue() - 1]; // INTVALUE= TRANSFORMA EL LONG EN INT
		} else {
			for (Long i = 3L; i < num; i++) { // NUM=4 //5 //6
				resultado = datos[0].add(datos[1]).add(datos[2]); // 
				datos[0] = datos[1]; // 2 // 3
				datos[1] = datos[2]; // 3 // 6
				datos[2] = resultado; // RESULTADO=6 //11 // 
			}
		}
		System.out.println(resultado);
	}
}
