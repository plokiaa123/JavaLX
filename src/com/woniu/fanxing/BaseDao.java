package com.woniu.fanxing;

import java.lang.reflect.ParameterizedType;

public class BaseDao<T> {
	private Class<T> c;
	public BaseDao() {
		try {
			ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
			this.c = (Class<T>) type.getActualTypeArguments()[0];//取类上的泛型数组，因为有可能是BaseDao<T，W,K>
		} catch (Exception e) {
			this.c = (Class<T>) Object.class;
		}
	}
	/*public BaseDao(Class<T> c) {
		this.c=c;
	}*/
	public void select() {
		System.out.println("select * from tb");
	}
	public <T> void delete(Class<T> clazz) {
		System.out.println("delete "+c.getSimpleName()+" from tb where id=?");
	}
}
