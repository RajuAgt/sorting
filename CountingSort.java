package com.he.sort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 2, 9, 5, 2, 3, 5};
		int [] arResult = countSort(arr);
		Arrays.stream(arResult).forEach(i -> System.out.print(i+" "));
	}

	public static int[] countSort(int[] arr) {
		
		int iSize = arr.length;
		int[] arRes = new int[iSize];
		int iMax = 0;
		
		// Find the maximum number
		for (int i : arr) {
			iMax = Math.max(i, iMax);
		}
		// To add zero index
		iMax++;
		//System.out.println("Max: "+iMax);
		int[] arAux = new int[iMax];
		for(int i=0; i<iMax; i++)
			arAux[i] = 0;
		
		for(int i=0; i<iSize; i++) {
			arAux[arr[i]]++;
		}
		
		for(int i=0, j=0; i<iMax; i++) {
			
			int iTemp = arAux[i];
			
			while(iTemp-->0) {
				arRes[j] = i;
				j++;
			}
		}
		
		return arRes;
	}
}
