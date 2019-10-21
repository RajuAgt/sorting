package com.he.sort;

import java.util.Arrays;

/*
 * Insertion sort
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 30, 18, 1, 8, 5, 4, 2, 15};
		insertionSort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void insertionSort(int []arr) {
		
		int iLen = arr.length;
		int index =0, j=0, temp =0;
		for(index=1; index<iLen; index++) {
			temp = arr[index];
			for(j=index; j>0 && temp<arr[j-1]; j--) {
				//System.out.println(arr[index]+" "+arr[j-1]);
				arr[j] = arr[j-1];
				
			}
			arr[j] = temp;
			//Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
			//System.out.println();
		}
	}
}
