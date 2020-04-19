package com.woniu.se;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr= {5,6,9,3,7};
		
		maxNum(arr);
		minNum(arr);
	}

	public static void maxNum(int[] arr) {
		int maxNum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum=arr[i];
			}
		}
		System.out.println("数组中最大的数为："+maxNum);
	}
	
	public static void minNum(int[] arr) {
		int minNum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minNum) {
				minNum=arr[i];
			}
		}
		System.out.println("数组中最小的数为："+minNum);
	}
}
