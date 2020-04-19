package com.woniu.se;

public class Count01 {
	public static void main(String[] args) {
		String str="我是啊abAR ";
		int countLetter=0;		
		int countNumS=0;		
		int countSpace=0;		//记录获取键盘空格的数量
		int countNumB=0;
		char[] array = str.toCharArray();
		String a="[\u4e00-\u9fa5]";
		String b="[a-z]";
		String c="[A-Z]";
		String d="[\\s]";
		String[] strArray=new String[array.length];
		for(int i=0;i<=array.length-1;i++) {
			strArray[i]=array[i]+"";
		}
		for (String string : strArray) {
			if(string.matches(a)) {
				countLetter++;
			}else if(string.matches(b)) {
				countNumS++;
			}else if(string.matches(c)) {
				countNumB++;
			}else if(string.matches(d)) {
				countSpace++;
			}
		}
		System.out.println("中文数量："+countLetter);
		System.out.println("小写字母数量："+countNumS);
		System.out.println("大写字母数量："+countNumB);
		System.out.println("空格数量："+countSpace);
	}
}
