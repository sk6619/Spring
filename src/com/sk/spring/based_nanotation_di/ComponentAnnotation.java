package com.sk.spring.based_nanotation_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @component 表示创建对象，具有value属性，value等同于bean标签的bean id，默认单例
 * @author Administrator
 *
 */
@Component(value = "myfirstComponent")
@Scope //默认单例
public class ComponentAnnotation {
	
	@Value("张三")
	public String name;
	@Value("1")
	public int id;
	@Value("26")
	public int age;
	@Value("男")
	public String gerder;

	
	public ComponentAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComponentAnnotation(String name, int id, int age, String gerder) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gerder = gerder;
	}

	

	@Override
	public String toString() {
		return "ComponentAnnotation [name=" + name + ", id=" + id + ", age=" + age + ", gerder=" + gerder + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGerder() {
		return gerder;
	}

	public void setGerder(String gerder) {
		this.gerder = gerder;
	}
	
	

}
