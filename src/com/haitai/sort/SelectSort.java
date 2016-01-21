package com.haitai.sort;
/**
 * 
 * @author gy
 * ÷±Ω”—°‘Ò≈≈–Ú
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] arr={4,5,6,2,12,1,9,0};
		int[] a = selectSort(arr);
	}
	private static int[] selectSort(int[] arr) {
		int arrayLength=arr.length;
		
		for(int i=0;i<arrayLength-1;i++){
			int minIndex=i;
			for(int j=i+1;j<arrayLength;j++){
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			if(i!=minIndex){
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
			System.out.println(java.util.Arrays.toString(arr));
		}
		return arr;
	}
}
