package com.sk.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 容器中对象
 * singleten 默认调用类的无参数构造器
 * @author Administrator
 *
 */
public class StudentTest {
	
	/**
	 * 测试对象创建时间
	 */
	@Test
	public void testStu() {
		//在实例化IOC容器的时候对象就会被创建
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationSpring.xml");
		/*
		 * Student student = context.getBean(Student.class); student.writeHonmework();
		 * ((ConfigurableApplicationContext)context).close();
		 */
	}
	/**
	 * 获取容器中对象信息
	 */
	@Test
	public void testStu1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringIOC.xml");
		//获取容器中对象的数量
		int objNumbers = context.getBeanDefinitionCount();
		System.out.println("对象数量："+objNumbers);
		String[] name = context.getBeanDefinitionNames();
		for (String string : name) {
			System.out.println("对象名字："+string);
		}
		//关闭context
		((ConfigurableApplicationContext)context).close();
	}
	@Test
	public void u() {
		int a = 5;
		int b=a++ + a--;
		System.out.println(b);
		
	}

}
