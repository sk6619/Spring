package com.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class a {
	
	public static void main(String[] args) throws Exception {
		//接收控制台输入
		Scanner scanner = new Scanner(System.in);
		//获取路径
		String pathString = scanner.next();
		System.out.println(pathString);
		//创建file对象
		File file = new File(pathString);
		//如果文件不存在抛出异常
		if(!file.exists()) {
			scanner.close();
			throw new Exception();
		}
		//长度小于200抛出异常
		if(file.length()<200) {
			scanner.close();
			throw new Exception();
		}
		//创建输入流
		InputStream inputStream = new FileInputStream(file);
		//创建数组接受流数据
		byte[] b = new byte[200];
		inputStream.read(b, 11, 100);
		for (byte c : b) {
			System.out.println(c);
		}
		scanner.close();
		inputStream.close();
	}

}
