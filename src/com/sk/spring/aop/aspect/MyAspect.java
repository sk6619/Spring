package com.sk.spring.aop.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面类，给方法增加功能
 * 
 * @author Administrator
 *
 */
@Component
@Aspect
public class MyAspect {
	/**
	 * 方法格式：public 方法参数：有限制 方法返回值：void（环绕通知除外）
	 * @throws Throwable 
	 */
	/*
	 * @Before(value = "execution(* *..ServiceImpl.do*(..))") public void doLog() {
	 * //打印日志，目标方法之前 System.out.println("执行业务方法之前打印日志"+new Date()); }
	 */
	/*
	 * @AfterReturning(value = "execution(* *..ServiceImpl.do*())") public void
	 * doLong() { System.out.println("方法执行完之后"); }
	 */
	@Around(value = "execution(* *..ServiceImpl.do*())")
	public void doLong(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕通知执行前");
		joinPoint.proceed();//执行目标方法
		System.out.println("环绕通知执行后");
	}

}
