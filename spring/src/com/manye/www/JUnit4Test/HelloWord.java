package com.manye.www.JUnit4Test;

public class HelloWord {
	private String name;
	private int age;
	public HelloWord(){
		System.out.println("������");
	}
	public void sayHello(){
		System.out.println("������,Spring");
	}
	//set�������ڸ�springע������
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
