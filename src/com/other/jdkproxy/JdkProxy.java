package com.other.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk代理目标dog必须实现接口
 * @author Administrator
 *
 */
public class JdkProxy implements InvocationHandler{
	//代理目标
	Object target;
	

	public JdkProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public JdkProxy(Object target) {
		super();
		this.target = target;
	}


	/**
	 * @proxy 代理对象
	 * @method 目标方法
	 * @args 目标方法参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println(method.getName());
		System.out.println("代理对象方法执行之前");
		object = method.invoke(target, args);
		System.out.println("代理对象方法执行之后");
		return object;
	}
	
	public static void main(String[] args) {
		//目标对象
		Dog dog = new Dog();
		//创建InvocationHandler的实例
		JdkProxy tarProxy = new JdkProxy(dog);
		//创建代理对象
		Animal animal = (Animal)Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), tarProxy);
		System.out.println(animal.getClass().getName());
		System.out.println(animal);
		animal.run();;
	}
	
}