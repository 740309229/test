package com.manye.www.JUnit4Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
//如果@ContextConfiguration不加（）的话就默认去找类名-context.xml
@ContextConfiguration("applicationContext-Test.xml")
public class Text {
	@Autowired
	private HelloWord hello;
	@Test
	public void testName() throws Exception {
		hello.sayHello();
	}
}
