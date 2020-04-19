package com.woniu.fanxing;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class FanX {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		try {
			
			Method method = list.getClass().getMethod("add", Object.class);
			method.invoke(list, "true");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}
