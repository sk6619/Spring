package com.other.jdkproxy;

public class Dog implements Animal,Cloneable{
	String name;
	
	public void run() {
		System.out.println("狗跑得快");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		//3中创建对象的方式
		Dog dog = new Dog();
		dog.setName("1");
		System.out.println(dog);
		Dog dog2 = (Dog) Class.forName("com.other.Dog").newInstance();
		System.out.println(dog2);
		Dog dog3 = Dog.class.newInstance();
		System.out.println(dog3);
		//clone方法必须实现clonable接口
		Dog dog4 = (Dog) dog.clone();
		dog4.setName("1");
		System.out.println(dog4.equals(dog));//false
	}
}