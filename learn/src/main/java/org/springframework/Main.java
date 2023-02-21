package org.springframework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class<?> aClass = Class.forName("org.springframework.Main");

		Constructor<?> constructor = aClass.getConstructor();

		Object o = constructor.newInstance();

		System.out.println("Hello world!");
	}
}