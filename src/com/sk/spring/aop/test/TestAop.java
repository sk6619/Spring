package com.sk.spring.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.spring.aop.Service;
import com.sk.spring.aop.ServiceImpl;
import com.sk.spring.aop.aspect.MyAspect;

public class TestAop {
	ApplicationContext context =new ClassPathXmlApplicationContext("SpringAop.xml");

	//测试@before
	@Test
	public void testAop1() {
		//查看容器有多少个对象
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		String[] name = context.getBeanDefinitionNames();
		for (String string : name) {
			System.out.println(string);
		}
		Service service =  context.getBean(Service.class);
		System.out.println(service.getClass().getName());
		service.doService();
	}
}
