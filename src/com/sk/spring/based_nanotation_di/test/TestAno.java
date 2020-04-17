package com.sk.spring.based_nanotation_di.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.spring.based_nanotation_di.ComponentAnnotation;
import com.sk.spring.based_nanotation_di.User;

public class TestAno {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Anotation.xml");
	
	//测试注解
	@Test
	public void testComponent() {
		ComponentAnnotation cnAnnotation = context.getBean(ComponentAnnotation.class);
		System.out.println(cnAnnotation);
		//@Component的属性value=“myfirstComponent”
		ComponentAnnotation cnAnnotation1 = (ComponentAnnotation) context.getBean("myfirstComponent");
		//默认单例所以是true
		System.out.println(cnAnnotation==cnAnnotation1);
	}
	//@value
	@Test
	public void testValue() {
		ComponentAnnotation cnAnnotation = context.getBean(ComponentAnnotation.class);
		System.out.println(cnAnnotation);
	}
	//测试引用类型@Autowired
	@Test
	public void testResource() {
		User user = context.getBean(User.class);
		System.out.println(user);
	}

}
