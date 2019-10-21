package com.he.sort;

import java.util.Arrays;

/*
 * Selection sorting
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8, 5, 80, 2};
		selectionSort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void selectionSort(int[] arr) {
		
		int iLen = arr.length;
		int iMin = 0;
		int iTemp = 0;
		for(int i=0; i<iLen; i++) {
			iMin = i;
			for(int j=i+1; j<iLen; j++) {
				if(arr[j] < arr[iMin])
					iMin = j;
			}
			iTemp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = iTemp;
		}
		
		
	}
}
