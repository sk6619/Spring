package com.sk.spring.based_nanotation_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 测试@autowire和@resource
 * @author Administrator
 *
 */
@Component
public class User {
	@Value("2")
	int id;
	@Value("李四")
	String name;
	@Autowired //支持bytype，byname默认为bytype
	@Qualifier //byName方式
	ComponentAnnotation cnAnnotation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ComponentAnnotation getCnAnnotation() {
		return cnAnnotation;
	}
	public void setCnAnnotation(ComponentAnnotation cnAnnotation) {
		this.cnAnnotation = cnAnnotation;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cnAnnotation=" + cnAnnotation + "]";
	}
	
}
