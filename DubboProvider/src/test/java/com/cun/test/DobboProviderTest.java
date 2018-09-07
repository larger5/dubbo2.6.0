package com.cun.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DobboProviderTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.out.println(" Provider 向 ZooKeeper 注册中心注册了服务（端口：20882）");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // press any key to exit
		context.close();
	}
}
