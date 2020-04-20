package com.other.cglibproxy;


import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class myMethodInterceptor implements MethodInterceptor{

	//该方法就是对代理目标的增强
	/**
	 * obj:代理目标
	 * method:代理目标的方法
	 * objects:方法参数
	 * prox:代理方法duixiang
	 * return:返回一个代理对象
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
		System.out.println("cglib增强功能");
		System.out.println(method.getName());
		Object object = proxy.invokeSuper(obj, objects);
		System.out.println("cglib增强功能完毕");
		System.out.println(proxy.getClass().getName());
		return object;
	}
	
	public static void main(String[] args) {
		//创建enhancer对象
		Enhancer enhancer = new Enhancer();
		//设置enhancer对象的父类
		enhancer.setSuperclass(Apple.class);
		//设置enhancer回调对象
		enhancer.setCallback(new myMethodInterceptor());
		//创建代理对象
		Apple proxApple = (Apple) enhancer.create();
		proxApple.pick();
	}

}
