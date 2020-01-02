package com.manye.www.HelloWord;

import static org.junit.Assert.*;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;
//模拟Spring创建对象和注入属性
public class Simulation_Spring {
	@Test
	public void testSimulation() throws Exception {
		Class<?> forName = Class.forName("com.manye.www.HelloWord.HelloWord");
		Constructor<?>  con =  forName.getDeclaredConstructor();
		con.setAccessible(true);
		HelloWord n = (HelloWord) con.newInstance();
		BeanInfo bean = Introspector.getBeanInfo(n.getClass(),Object.class);
		PropertyDescriptor[] ps = bean.getPropertyDescriptors();
	    for (PropertyDescriptor p : ps) {
			String name = p.getName();
			Method write = p.getWriteMethod();
			System.out.println(name);
			if("name".equals(name)){
				write.invoke(n, "满爷");
			}else if("age".equals(name)){
				write.invoke(n, 17);
			}
			System.out.println(n);
		}
	}
}
