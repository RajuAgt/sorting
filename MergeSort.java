package com.he.sort;

public class MergeSort {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		int arr[] = {9, 7, 8, 3, 2, 1};
		int iSize = arr.length;
		MergeSort merge = new MergeSort();
		merge.mergeSort(arr, 0, iSize-1);
		for(int i=0; i< iSize; i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
		
	}

	void mergeSort(int arr[], int iStart, int iEnd) {
		
		if(iStart < iEnd) {
			int iMid = (iStart+iEnd)/2;
			
			mergeSort(arr, iStart, iMid);
			mergeSort(arr, iMid+1, iEnd);
			
			merge(arr, iStart, iMid, iEnd);
			
		}
	}
	
	void merge(int A[], int iStart, int iMid, int iEnd) {
		
		int p = iStart, q = iMid+1;
		int Arr[] = new int[iEnd-iStart+1];
		int k =0;
		
		for(int i = iStart; i<= iEnd; i++) {
			
			//System.out.println("Compare");
			if(p > iMid)
				Arr[k++] = A[q++];
			else if(q > iEnd)
				Arr[k++] = A[p++];
			else if(A[p] < A[q])
				Arr[k++] = A[p++];
			else
				Arr[k++] = A[q++];
		}
		//System.out.println("Assign");
		for(int j=0; j<k; j++) {
			
			A[iStart++] = Arr[j];
		}
		
	}
}
