package com.haitai.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		
		int arr[]={2,3,6,4,1,0,-1,10};
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
	}

	private static void quickSort(int[] data) {
		subSort(data,0,data.length-1);
	}

	private static void subSort(int[] data, int start, int end) {
		if(start<end){
			int base=data[start];
			int i=start;
			int j=end+1;
			while(true){
				while(i<end&&data[++i]<base);
				while(j>start&&data[--j]>base);
				if(i<j){
					swap(data,i,j);
				}else {
					System.out.println("交换完成1"+Arrays.toString(data));
					break;
				}
				System.out.println(Arrays.toString(data));
			}
			swap(data, start, j);
			System.out.println("交换完成2"+Arrays.toString(data));
			//递归左子序列
			subSort(data,start,j);
			//递归左子序列
			subSort(data,j+1,end);
		}
	}

	private static void swap(int[] data, int i, int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
}
