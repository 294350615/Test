package com.haitai.sort;

import java.util.Arrays;
/**
 * 
 * @author gy
 * 堆排序
 *
 */

public class HeapSort {
	public static void main(String[] args) {
		int []arr={2,3,4,1,33,22,11,55,66};
		heapSort(arr);
	}

	public static void heapSort(int[] data) {
		System.out.println("开始排序");
		int arrayLength=data.length;
		for (int i = 0; i < arrayLength; i++) {
			buildMaxHeap(data, arrayLength-1-i);
			swap(data, 0, arrayLength-i-1);
			System.out.println(Arrays.toString(data));
		}
	}
	/**
	 * 建大项堆
	 */
	public static void buildMaxHeap(int[] data, int lastIndex) {
		for (int i = (lastIndex-1)/2; i >= 0; i--) {
			int k=i;
			while (k*2+1<=lastIndex) {
				int biggerIndex = 2*k+1;
				if(biggerIndex<lastIndex){
					if(data[biggerIndex]<data[biggerIndex+1]){
						biggerIndex++;
					}
				}
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
					k=biggerIndex;
				}
				else{
					break;
				}
			}
		}
	}
	/**
	 * 交换
	 * @param data
	 * @param i
	 * @param j
	 */
	public static void swap(int[] data, int i, int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
}
