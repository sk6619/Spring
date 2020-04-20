package com.sk.spring.aop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

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
		//int a = 10/0;
		}
	@Override
	public Object getObject() {
		System.out.println("执行业务");
		return null;
	}
}
