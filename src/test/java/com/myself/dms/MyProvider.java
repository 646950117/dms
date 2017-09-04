package com.myself.dms;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProvider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "springContext.xml" });
		context.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟，输入任何字符退出

	}

}
