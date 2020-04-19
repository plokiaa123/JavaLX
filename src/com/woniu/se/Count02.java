package com.woniu.se;

public class Count02 {
	public static void main(String[] args) {
		String[] arr= {"橘子","苹果","香蕉","橘子","香蕉","橘子"};
		
		while(true) {
			String fruit = arr[0];
			int count = count(arr, fruit);
			System.out.println(fruit+":"+count);
			String[] newArr=new String[arr.length-count];
			int index=0;
			for (String string : arr) {
				if(!string.equals(fruit)) {
					newArr[index]=string;
					index++;
				}
			}
			arr=newArr;
			if(arr.length==0) {
				break;
			}
		}
		
	}
	public static int count(String[] arr,String fruit) {
		int num=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(fruit)) {
				num++;
			}
		}
		return num;
	}
	
	public static void count2(String str) {
		while(true) {
			char c = str.charAt(0);
			int length=str.length();
			str = str.replace(c+"", "");
			int num=length-str.length();
			System.out.println(c+":"+num);
			if(str.length()==0) {
				break;
			}
		}
	}
	
}
