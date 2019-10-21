package com.he.sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15, 5, 17, 88, 44, 8, 654, 123};
		int iLen = arr.length;
		//System.out.println("Calling radix sort");
		radixSort(arr, iLen);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void radixSort(int arr[], int iLen) {
		
		int iMax = getMaxElement(arr, iLen);
		//System.out.println("Doing it for each digit");
		for(int digit=1; iMax/digit>0; digit *= 10)
			countSort(arr, iLen, digit);
		
	}
	
	public static int getMaxElement(int []arr, int iLen) {
		
		int iMax = arr[0];
		for(int i=1; i< iLen; i++) {
			//System.out.println("Inside for loop");
			if(arr[i] > iMax)
				iMax = arr[i];
		}
		
		return iMax;
	}
	
	public static void countSort(int []arr, int iLen, int digit) {
		
		int res[] = new int[iLen], count[]= new int[10];
		int i;
		
		//System.out.println("Current digit: "+digit);
		for(i=0; i<iLen; i++) {
			count[(arr[i]/digit)%10]++;
		}
		
		//System.out.println("Counting sum");
		for(i=1; i<10; i++) {
			count[i] += count[i-1];
		}
		
		for(i=iLen-1; i>=0; i--) { 
			res[count[(arr[i]/digit)%10]-1] = arr[i];
			count[(arr[i]/digit)%10]--;
		}
		
		for(i=0; i<iLen; i++)
			arr[i]= res[i];
	}
}
