package com.sk.spring.aop.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
	 * 
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
		joinPoint.proceed();// 执行目标方法
		System.out.println("环绕通知执行后");
	}

	@AfterThrowing(value = "execution(* *..ServiceImpl.do*())", throwing = "ex")
	public void doLong(Throwable ex) throws Throwable { // 目标方法发生异常执行该方法
		// 将错误信息写入日志数据库或者发邮件
		System.out.println("发生异常" + ex.getMessage());
	}

	@After(value = "doLog()")
	public void doLong(){
		System.out.println("最终执行");
	}
	
	/**
	 * pointcut 定义切入点，
	 * 自定义方法就为该切入点
	 * doLog()代表目标方法的切入点
	 */
	@Pointcut(value = "execution(* *..ServiceImpl.do*())")
	public void doLog() {
		//无方法类容
	}
	
	public void configLog() {
		System.out.println("配置方式执行");
	}

}
