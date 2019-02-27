package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void doesElementExist_test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();	
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void hasAllValue_test1() {
		int [] arr1 = {1,2,3,4,5,6,7,8,9};
		int [] arr2 = {1,2,3};
		LatinSquare lq = new LatinSquare();	
		
		assertTrue(lq.hasAllValue(arr1, arr2)); 
	}
	
	@Test
	public void hasAllValue_test2() {
		int [] arr1 = {1,2,3,4,5,6,7,8,9};
		int [] arr2 = {0};
		LatinSquare lq = new LatinSquare();	
		
		assertFalse(lq.hasAllValue(arr1, arr2)); 
	}



}
