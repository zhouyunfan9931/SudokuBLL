package pkgHelper;
import java.util.Arrays;

public class LatinSquare {
	private int[][] LatinSquare;
	
	public LatinSquare() {
		
	}
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	public void setLatinSquare(int[][] latinSquare) {
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

		LatinSquare way = new LatinSquare();
		if (arr1 == null) {
			return false;
		}
		for (int i : arr2) {
			if (way.doesElementExist(arr1, i)){
				hasAllValue = true;
			}else{
				return false;
			}
		}
		
		return hasAllValue;
	}
	
	public int[] getColumn(int Col) {
		int[] getColumn = new int[LatinSquare[Col].length];
		for (int i=0 ;i<LatinSquare[Col].length;i++) {
			getColumn[i]=LatinSquare[i][Col];
		}
		return getColumn;
	}
	
	public int[] getRow(int Row) {
		int[] getRow = new int[LatinSquare[Row].length];
		for (int i=0;i<LatinSquare[Row].length;i++) {
			getRow[i]=LatinSquare[Row][i];
		}
		return getRow;
	}
	
	public boolean isLatinSquare() {
		boolean isLatinSquare = false;
		for (int j=0;j<LatinSquare.length;j++) {
			int[] er = getRow(j);
			Arrays.sort(er);
			for (int i = 0;i<er.length-1;i++) {
				if (er[i]==er[i+1]) {
					return false;					
				}else {
					isLatinSquare = true;
				}
			}
		}
		for (int j=0;j<LatinSquare.length;j++) {
			int[] ec = getColumn(j);
			Arrays.sort(ec);
			for (int i = 0;i<ec.length-1;i++) {
				if (ec[i]==ec[i+1]) {
					return false;					
				}else {
					isLatinSquare = true;
				}
			}
		}	
		return isLatinSquare;	 
	}
	
	public boolean containsZero() {
		boolean containsZero = false;
		for (int i[] : LatinSquare) {
			for (int j : i) {
				if (j == 0) {
					containsZero = true;
					break;
				}			
			}
		}
		return containsZero;
	}
}

