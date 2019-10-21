package com.he.sort;

import java.util.Arrays;

/*
 * Bubble sort
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 30, 18, 1, 8, 5, 4, 2, 15};
		bubbleSort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void bubbleSort(int []arr) {
		//System.out.println("Inside bubble sort");
		int iLen = arr.length;
		int temp = 0;
		for(int i=0; i<iLen; i++) {
			//System.out.println("int i "+(iLen-i-1));
			for(int j=0; j<iLen-i-1; j++) {
				if(arr[j] > arr[j+1]) {
				//System.out.println(arr[j]+" "+arr[j+1]);
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		
	}
}
