package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.learn.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//		Class<?> aClass = Class.forName("org.springframework.Main");
//
//		Constructor<?> constructor = aClass.getConstructor();
//
//		Object o = constructor.newInstance();
//
//		System.out.println("Hello world!");

		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");

		System.out.println(context);

		Person bean = context.getBean(Person.class);
		System.out.println(bean);
		System.out.println(bean.getApplicationContext());
	}
}