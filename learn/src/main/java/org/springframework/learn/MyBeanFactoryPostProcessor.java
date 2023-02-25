package org.springframework.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// todo:
		System.out.println("自定义 BeanFactoryPostProcessor");
	}

	public void init() {
		System.out.println("初始化方法：init-method");
	}

}
