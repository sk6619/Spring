package com.sk.spring.ioc.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.sk.spring.ioc.imple.UserImple;

/**
 * 对UserImple的测试
 * @author Administrator
 *
 */
public class UserImpleTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringIOC.xml");
	
	GenericApplicationContext gcontext = new GenericApplicationContext();
	
	/**使用ApplicationContext实例化容器
	 * 测试容器建立是否成功
	 */
	@Test
	public void testUserImple1() {
		UserImple userImple = context.getBean("userImple",UserImple.class);
		//关闭context资源
		userImple.loggin("邵奎", 25);
		this.closeContext();
	}
	/**
	 * 使用ApplicationContext实例化容器
	 * 在UserImple类添加Student类属性
	 */
	@Test
	public void testUserImple2() {
		UserImple userImple = context.getBean(UserImple.class);
		userImple.getStudent().writeHonmework();
		this.closeContext();
	}
	
	/**
	 * 使用GenericApplicationContext实例化容器
	 */
	@Test
	public void testUserImpl3() {
		XmlBeanDefinitionReader xReader = new XmlBeanDefinitionReader(gcontext);
		xReader.loadBeanDefinitions("SpringIOC.xml");
		gcontext.refresh();
		UserImple userImple = gcontext.getBean(UserImple.class);
		userImple.loggin("张三", 30);
	}
	
	/**
	 * 关闭资源
	 */
	public void closeContext() {
		System.out.println("关闭资源");
		((ConfigurableApplicationContext)context).close();
	}

}
