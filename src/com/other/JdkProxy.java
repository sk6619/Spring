package com.other;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{
	Object target;
	

	public JdkProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public JdkProxy(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("代理对象方法执行之前");
		object = method.invoke(target, args);
		System.out.println("代理对象方法执行之后");
		return object;
	}
	
	public static void main(String[] args) {
		//目标对象
		Animal aiAnimal = new Dog();
		//创建InvocationHandler的实例
		JdkProxy tarProxy = new JdkProxy(aiAnimal);
		//创建代理对象
		Animal animal = (Animal) Proxy.newProxyInstance(aiAnimal.getClass().getClassLoader(), aiAnimal.getClass().getInterfaces(), tarProxy);
		System.out.println(animal.getClass().getName());
		System.out.println(animal);
		animal.run();
	}
	
}