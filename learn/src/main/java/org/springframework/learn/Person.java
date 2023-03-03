package org.springframework.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Person implements ApplicationContextAware, EnvironmentAware, BeanNameAware {
	private String name;
	private Integer age;

	private ApplicationContext applicationContext;
	private Environment environment;
	private String beanName;

	public String getName() {
		return name;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public void show() {
		System.out.println("beanName: " + this.beanName);
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
