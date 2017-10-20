package org.institutoserpis.ed;
import java.math.BigDecimal;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primer numero");
		String primerNumero = scanner.nextLine();
		BigDecimal primero = new BigDecimal(primerNumero);
		
		System.out.println("Segundo numero");
		String segundoNumero = scanner.nextLine();
		BigDecimal segundo = new BigDecimal(segundoNumero);
		
		BigDecimal suma = primero.add(segundo);
		
		System.out.println("La suma es " + suma);
		
	}

}
