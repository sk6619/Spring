package com.sk.spring.ioc.imple;


public class Student {
	
	UserImple userImple;
	
	public Student() {
		System.out.println("容器创建时间");
	}
	public Student(UserImple userImple) {
		this.userImple = userImple;
	}
	
	public void writeHonmework() {
		System.out.println("学生写作业");
	}

	public UserImple getUserImple() {
		return userImple;
	}

	public void setUserImple(UserImple userImple) {
		this.userImple = userImple;
	}
	

}
