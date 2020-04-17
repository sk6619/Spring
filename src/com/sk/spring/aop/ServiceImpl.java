package com.sk.spring.aop;

import org.springframework.stereotype.Component;

/**
 * service实现类
 * @author Administrator
 *
 */
@Component
public class ServiceImpl implements Service{

	@Override
	public void doService() {
		System.out.println("执行服务方法");
	}
	@Override
	public Object getObject() {
		System.out.println("执行业务");
		return null;
	}
}
