package aopTest;

import org.springframework.aop.config.AopNamespaceHandler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public void test(){
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		BeanFactory factory = new FileSystemXmlApplicationContext("application.xml");
		factory.getBean(Test.class).test();
		AopNamespaceHandler aopNamespaceHandler;
	}

}
