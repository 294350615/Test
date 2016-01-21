package com.haitai.sort;

import java.util.Arrays;

/**
 * 
 * @author gy
 * º”»Îflag
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={1,3,5,7,8};
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag=true;
			for (int j=1; j< arr.length-i; j++) {
				if(arr[j]>arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag = true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag){
				break;
			}
		}
	}
}
