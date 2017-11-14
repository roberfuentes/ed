package org.institutoserpis.ed;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[] {9, 15, 7, 12, 6};

		for(int index=0; index<5; index++)
			System.out.printf("v[%s]=%s", index, v[index]);
			System.out.println();
			
			int value=15;
			int position = indexOf(v, value);
			System.out.println("El mayor es " + position);
			
			int min = min(v);
			System.out.println("min=" + min);
			
			
			
	}
	
	public static int indexOf(int [] v, int value){
		return 0;
	}
	public static int min(int[] v) {
		return 77;
	}
	public static int indexOfMin(int[] v) {
		return -1;
	}
	
	public static void selectionSort(int[] v){
		int selectedIndex = 0;
		int indexOfMin = selectedIndex;
		//for (int index = selectedIndex +1; index < v.length; index++) {	
	}
	
	public static int sum(int[] v) {
		int sum = 0;
		//for (int index = 0; index < v.length; index++);
			//sum = sum + v[index];
		for (int item : v)
			sum = sum + item;
		return sum;
	}
	/*public static int min(int[] v) {
		int posicionMin = 0;
		for (int index = 1; index < v.length -1; index++)
			if(v[index] < v[posicionMin] ) 
				posicionMin = v[index];*/
}
