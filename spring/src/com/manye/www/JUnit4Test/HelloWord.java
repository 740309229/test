package com.manye.www.JUnit4Test;

public class HelloWord {
	private String name;
	private int age;
	public HelloWord(){
		System.out.println("构造器");
	}
	public void sayHello(){
		System.out.println("我来了,Spring");
	}
	//set方法用于给spring注入数据
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HelloWord [name=" + name + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
