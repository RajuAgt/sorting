package com.he.sort;

import java.util.Arrays;

/*
 * Quicksort
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,4,7,2,8,9,3,3,5};
		int iLen = arr.length;
		
		quickSort(arr, 0, iLen);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void quickSort(int A[], int iStart, int iEnd) {
		
		if(iStart < iEnd) {
			//System.out.println(iStart+" "+iEnd);
			int piv_pos = partition(A, iStart, iEnd);
			quickSort(A, iStart, piv_pos-1);
			quickSort(A, piv_pos+1, iEnd);
		}
	}
	
	public static int partition(int A[], int iStart, int iEnd) { 
		
		int i = iStart+1;
		int piv = A[iStart];
		int temp =0;
		for(int j=iStart+1; j<iEnd; j++) {
			//System.out.println("Check conditions");
			if(A[j] < piv) {
				//swap(A[i], A[j]);
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				//System.out.println("Inv");
				i++;
				//System.out.println("Incdd");
			}
		}
		//System.out.println("Done with loop");
		//swap(A[iStart], A[i-1]);
		temp = A[iStart];
		A[iStart] = A[i-1];
		A[i-1] = temp;
		return i-1;
	}
}
