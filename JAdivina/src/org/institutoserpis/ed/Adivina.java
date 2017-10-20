package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;
public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(5) +1;
		
		System.out.println("Numero aleatorio=" + numeroAleatorio);
		Scanner number = new Scanner(System.in);
		System.out.println("Adivina el numero entre (1 y 5: ");
		
		
		String numberperson = number.nextLine();
		int numberPersonInt = Integer.parseInt(numberperson);
		
		while(numberPersonInt != numeroAleatorio) {
			if (numeroAleatorio > numberPersonInt) {
				System.out.println("El numero introducido es menor al aleatorio. Vuelve a Intentarlo: ");
			}
			else {
				System.out.println("El numero introducido es mayor que el aleatorio. Vuelve a intentarlo " );
			}
			numberperson = number.nextLine();
			numberPersonInt = Integer.parseInt(numberperson);
		}
		System.out.println("El numero es correcto");
	number.close();
	}

}
