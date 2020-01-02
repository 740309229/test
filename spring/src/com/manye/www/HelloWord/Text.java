package com.manye.www.HelloWord;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Text {
	private HelloWord hello;
	@Test
	public void test1() throws Exception {
	    Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//第一个参数时xml中bean的id（表明对象以创建）
		hello = factory.getBean("helloWord", HelloWord.class);
		System.out.println("----------");
		hello.sayHello();
		
	}

}
