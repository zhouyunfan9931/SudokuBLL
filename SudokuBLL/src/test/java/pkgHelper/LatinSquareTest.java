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
	public void hasDuplicates_test2() {
		
		int [] arr = {};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void doesElementExist_test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();	
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_test2() {
		int [] arr = {};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();	
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_test3() {
		int [] arr = {1,2,3,4,5};
		int iValue = 6;
		
		LatinSquare lq = new LatinSquare();	
		
		assertFalse(lq.doesElementExist(arr, iValue));
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
	
	@Test
	public void hasAllValue_test3() {
		int [] arr1 = {};
		int [] arr2 = {1};
		LatinSquare lq = new LatinSquare();	
		
		assertFalse(lq.hasAllValue(arr1, arr2)); 
	}
	
	@Test
	public void getColumn_test1() {
		int Col = 1;
		int[][] LatinSquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] getColumn = new int[LatinSquare[Col].length];
		for (int i=0 ;i<LatinSquare[Col].length;i++) {
			getColumn[i]=LatinSquare[i][Col];
		}
		int[] example = {1,3,2};
		assertFalse(Arrays.equals(getColumn,example ));
		
	}
	
	@Test
	public void getColumn_test2() {
		int Col = 1;
		int[][] LatinSquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] getColumn = new int[LatinSquare[Col].length];
		for (int i=0 ;i<LatinSquare[Col].length;i++) {
			getColumn[i]=LatinSquare[i][Col];
		}
		int[] example = {2,1,3};
		assertTrue(Arrays.equals(getColumn,example ));
		
	}
	
	@Test
	public void getRow_test1() {
		int Row = 1;
		int[][] LatinSquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] getRow = new int[LatinSquare[Row].length];
		for (int i=0 ;i<LatinSquare[Row].length;i++) {
			getRow[i]=LatinSquare[Row][i];
		}
		int[] example = {2,1,3};
		assertFalse(Arrays.equals(getRow,example ));
		
	}
	
	@Test
	public void getRow_test2() {
		int Row = 1;
		int[][] LatinSquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] getRow = new int[LatinSquare[Row].length];
		for (int i=0 ;i<LatinSquare[Row].length;i++) {
			getRow[i]=LatinSquare[Row][i];
		}
		int[] example = {3,1,2};
		assertTrue(Arrays.equals(getRow,example ));
		
	}
	@Test
	public void isLatinSquare_test1() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{3,3,3},{3,3,3},{3,3,3}};
		lq.setLatinSquare(latinSquare);
		assertFalse(lq.isLatinSquare());
		
		
		
		
		
	}
	
	@Test
	public void isLatinSquare_test2() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{1,3,2},{2,1,3},{3,2,1}};
		lq.setLatinSquare(latinSquare);
		assertTrue(lq.isLatinSquare());
	}
	
	@Test
	public void containsZero_test1() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{3,0,3},{3,3,3},{3,3,3}};
		lq.setLatinSquare(latinSquare);
		assertTrue(lq.containsZero());
	}
	
	@Test
	public void containsZero_test2() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{3,3,3},{3,3,3},{3,3,3}};
		lq.setLatinSquare(latinSquare);
		assertFalse(lq.containsZero());
	}
}

