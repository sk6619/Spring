package com.sk.spring.ioc.imple;

import com.sk.spring.ioc.User;

/**
 * User接口的实现
 * @author Administrator
 *
 */
public class UserImple implements User{
	
	Student student;

	/**
	 * 登录
	 */
	@Override
	public void loggin(String name, Integer id) {
		System.out.println("name=:"+name);
		System.out.println("id=:"+id);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
