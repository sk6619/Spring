package com.sk.spring.beanscope.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.spring.beanscope.impl.ServiceImple;

public class BeanScopeTest {
	// 实例化容器
	ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");

	// 测试加载容器
	@Test
	public void testLoadXml() {
		// 查看容器对象个数
		int count = context.getBeanDefinitionCount();
		System.out.println("对象个数：" + count);
		// 关闭资源
		((ConfigurableApplicationContext) context).close();
	}

	// 测试单例作用域
	@Test
	public void testSingleton() {
		ServiceImple serviceImple1 = context.getBean(ServiceImple.class);
		System.out.println(serviceImple1.hashCode());
		ServiceImple serviceImple2 = context.getBean(ServiceImple.class);
		System.out.println(serviceImple2.hashCode());
		System.out.println(serviceImple1 == serviceImple2);
	}

	// 测试原型作用域
	@Test
	public void testPrototype() {
		ServiceImple serviceImple1 = context.getBean(ServiceImple.class);
		System.out.println(serviceImple1.hashCode());
		ServiceImple serviceImple2 = context.getBean(ServiceImple.class);
		System.out.println(serviceImple2.hashCode());
		System.out.println(serviceImple1 == serviceImple2);
	}

}
