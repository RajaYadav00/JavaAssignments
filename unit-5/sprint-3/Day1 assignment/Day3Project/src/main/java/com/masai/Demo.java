package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean pb=ctx.getBean("pr",PresentationBean.class);
		
		int sum=pb.presentationSum(x, y);
		int mult=pb.presentationMultiplication(x, y);
		int sub=pb.presentationSub(x, y);
		
		System.out.println( "sum =   "+sum);
		System.out.println("");
		System.out.println("multiplication =    "+mult);
		System.out.println("");
		System.out.println("sub  =   "+sub);

	}

}
