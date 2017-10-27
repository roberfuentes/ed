package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {	
		int[] v = new int[] {9, 15, 7, 12, 6};

		for(int index=0; index<5; index++)
			System.out.printf("v[%s]=%s", index, v[index]);
			System.out.println();
			
			int value=15;
			
			for(int i=0; i<5; i++) {
			if(value!=v[i]) {
				int position = indexOf(v, value);
				System.out.println("La posicion " + i + " no esta el numero que buscamos");
			}
			else if(value==v[i]) {
				
				System.out.println("En el numero " + i + " se encuentra el numero que buscamos");
			}
			
			
			}
	}
			public static int indexOf(int [] v, int value){
				return -1;
			}
		
	}