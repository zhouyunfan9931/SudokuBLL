package pkgHelper;
import java.util.Arrays;

public class LatinSquare {
	private int[] LatinSquare;
	
	public LatinSquare() {
		
	}
	public LatinSquare(int[] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	public int[] getLatinSquare() {
		return LatinSquare;
	}
	public void setLatinSquare(int[] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	
	public boolean hasDuplicates(int [] arr) {
		boolean hasDuplicates = false;
		if (arr == null) {
			return false;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length - 1;i++) {
			if(arr[i]==arr[i+1]) {
				hasDuplicates = true;
				break;	
			}
		}
		return hasDuplicates;
	}
	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;
		
		if (arr == null) {
			return false;
		}
			
		for (int i : arr) {
			if (i==iValue) {
				doesElementExist = true;
				break;
			}
		}
		return doesElementExist;
		
	}
	
	public boolean hasAllValue(int[] arr1,int[] arr2) {
		boolean hasAllValue = false;
		boolean hasAllValueArr1 = false;
		boolean hasAllValueArr2 = false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] example = {1,2,3,4,5,6,7,8,9};
		if (arr1 == null) {
			return false;
		}
		if (arr2 == null) {
			return false;
		}
		
		if(Arrays.equals(arr1,example)) {
			hasAllValueArr1 = true;
		}
		if(Arrays.equals(arr2,example)) {
			hasAllValueArr2 = true;
		}
		if(hasAllValueArr1 && hasAllValueArr2) {
			hasAllValue = true;
		}
		return hasAllValue;
	}
}

