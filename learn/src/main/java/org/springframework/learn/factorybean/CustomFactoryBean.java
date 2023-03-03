package org.springframework.learn.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<CustomBean> {
	@Override
	public CustomBean getObject() throws Exception {
		CustomBean customBean = new CustomBean();
		customBean.setName("test---");
		return customBean;
	}

	@Override
	public Class<?> getObjectType() {
		return CustomFactoryBean.class;
	}
}
