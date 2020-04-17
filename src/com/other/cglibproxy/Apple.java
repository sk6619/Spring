package com.other.cglibproxy;

/**
 * 代理目标类，必须可以被继承所以不能用final修饰
 * @author Administrator
 *
 */
public class Apple {
	
	//味道
	String taste;

	
	public void pick() {
		System.out.println("摘苹果");
	}


	@Override
	public String toString() {
		return "Apple [taste=" + taste + "]";
	}

}
