package com.he.sort;

import java.util.Arrays;

/*
 * Heap sort
 */
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 30, 18, 1, 8, 5, 4, 2, 15};
		heapSort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	public static void heapSort(int []arr) {
		
		int iSize = arr.length-1,  temp =0;
		buildMaxHeap(arr, iSize);
		
		for(int i=iSize; i >0; i--) {
			
			//Swap
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			maxHeapify(arr, 0, --iSize);
		}
		
	}
	
	public static void buildMaxHeap(int [] arr, int iSize) {
		
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
		System.out.println("");		
		
		for(int i=((iSize-1)/2) - 1; i>=0; i--) {
			maxHeapify(arr, i, iSize-1);
		}
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
		System.out.println("");
	}
	
	public static void maxHeapify(int []arr, int i, int iSize) {
		
		int iLeft = 2*(i+1)-1, iRight = (2*(i+1)), ilarge=0, temp =0;
		
		if(iLeft <= iSize && arr[iLeft] > arr[i]) {
			ilarge = iLeft;
		}else {
			ilarge = i;
		}
		//System.out.println(iRight+" "+ ilarge);
		if(iRight <= iSize && arr[iRight] > arr[ilarge])
			ilarge = iRight;
		
		if(ilarge != i) {
			// Swap
			temp = arr[i];
			arr[i] = arr[ilarge];
			arr[ilarge] = temp;
			Arrays.stream(arr).forEach(j -> System.out.print(j+" "));
			System.out.println("");
			maxHeapify(arr, ilarge, iSize);
		}
	}
}
