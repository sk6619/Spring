package com.sk.beanscope.impl;
import com.sk.beanscope.Service;
public class ServiceImple implements Service {
	//如果没有无参数构造方法Spring实例化bean报错
	public ServiceImple() {
		System.out.println("ServiceImple的无参数构造方法");
	}
	@Override
	public void dologin() {
		System.out.println("调用业务方法");
	}

}
