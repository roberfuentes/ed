package org.institutoserpis.ed;

import java.util.Scanner;
public class Suma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame el primer numero");
		String primerNumero = scanner.nextLine();
		int primero = Integer.parseInt(primerNumero);
		
		System.out.println("Dame el segundo numero");
		String segundoNumero = scanner.nextLine();
		int segundo = Integer.parseInt(segundoNumero);
		
		int suma = primero + segundo;
		
		System.out.println("La suma final es " + suma );
		
	}

}
