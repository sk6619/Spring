package com.other;

import java.util.HashMap;
import java.util.Map;

public class JudgeObject {
	
	public static void main(String[] args) {
		int a =10;
		int b =10;
		System.out.println(a==b);
		int c = new Integer(5200);
		int d = 5200;
		System.out.println(c==d);
		///////
		String aString = new String("aa");
		System.out.println("aa"==(aString));
		/////////////////////////////////
		Map<String, Dog> map = new HashMap<String, Dog>();
		Dog dog = new Dog();
		System.out.println(dog.hashCode());
		map.put("1", dog);
		System.out.println(map.get("1").hashCode());
		dog.setName("小黄");
		map.put("2", dog);
		System.out.println(map.get("2").hashCode());
		System.out.println(dog.equals(map.get("2")));
	}

}
