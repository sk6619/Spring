package com.sk.spring.setvalue.imple;

import com.sk.spring.setvalue.Animal;

public class Dog implements Animal {

	String name;
	Integer age;
	
	Cat cat;
	
	/**
	 * 无参数构造器
	 */
	public Dog(){
		System.out.println("狗的默认构造器");
	}
	/**
	 * 带参构造器
	 * @param nameString
	 * @param ageInteger
	 */
	public Dog(String nameString,Integer ageInteger) {
		this.name = nameString;
		this.age = ageInteger;
	}
	/**
	 * 狗的run方法
	 */
	@Override
	public void run() {
		System.out.println("狗在跑");
	}
	//get、set
	
	public String getName() {
		return name;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
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

}
