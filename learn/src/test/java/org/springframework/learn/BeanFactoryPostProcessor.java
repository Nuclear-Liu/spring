package org.springframework.learn;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessor {
	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("text.xml");
	}
}
