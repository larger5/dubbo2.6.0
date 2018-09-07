package com.cun.test;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cun.service.ProviderService;

public class DubboConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        ProviderService demoProviderService=(ProviderService) context.getBean("ProviderService");
        String result=demoProviderService.updateString("Consummer");
        System.out.println(""+result);
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        context.close();
	}
}
