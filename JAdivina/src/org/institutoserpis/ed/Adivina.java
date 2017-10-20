package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;
public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(5) +1;
		int contadorDeIntentos=1;
		System.out.println("Numero aleatorio=" + numeroAleatorio);
		Scanner number = new Scanner(System.in);
		System.out.printf("Adivina el numero entre (1 y 5:) [intento %s] : ",
				contadorDeIntentos
				);
		
		
		String numberperson = number.nextLine();
		int numberPersonInt = Integer.parseInt(numberperson);
		
		while(numberPersonInt != numeroAleatorio) {
			contadorDeIntentos++;
			if (numeroAleatorio > numberPersonInt) {
				System.out.printf("El numero introducido es menor al aleatorio. Vuelve a Intentarlo. [intento%s] : ",
				contadorDeIntentos
				);
				
			}
			else {
				System.out.printf("El numero introducido es mayor que el aleatorio. Vuelve a intentarlo [intento%s] : ",
						contadorDeIntentos
						);
				
			}
			numberperson = number.nextLine();
			numberPersonInt = Integer.parseInt(numberperson);
		}
		System.out.printf("El numero es correcto. Has acertado en %s %s.\n", 
				contadorDeIntentos, contadorDeIntentos == 1 ? "intento" : "intentos"
				);
	number.close();
	}

}
