package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector2Test {

	@Test
	public void indexOf() {

		int[] v = new int[] {9, 15, 7, 12, 6};
		assertEquals(0, Vector2.indexOf(v, 9));
	}
	
	/*@Test
	public void IndexOfMin() {
		assertEquals(4, Vector2.indexOfMin(new int[] {9,15,7,12,6}));
	}*/
	
	/*@Test
	public void selectionSort() {		
		int[] v = new int[] {9,15,7,12,6};
		Vector2.selectionSort(v);
		assertArrayEquals(new int[] {6,7,9,12,15} , v);
	}*/
	
	@Test
	public void sum() {
		assertEquals(49, Vector2.sum(new int[] {9,15,7,12,6}));
	}
	
	/*@Test
	public void posicionMin() {
		assertEquals(3, Vector2.min(new int[] {9,15,7,6,12}));
	}*/
}
