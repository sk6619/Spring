package com.sk.spring.setvalue.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.spring.setvalue.imple.Dog;

/**
 * set注入测试
 * @author Administrator
 *
 */
public class SetValueTest {
	//实例化容器
	ApplicationContext context = new ClassPathXmlApplicationContext("SetValue.xml");
	
	//测试容器创建
	@Test
	public void testSetValue() {
		Dog dog = context.getBean(Dog.class);
		System.out.println(dog.getName()+dog.getAge()+dog.getCat().getNmaeString()
				+dog.getCat().getAgeInteger());
	}

}
