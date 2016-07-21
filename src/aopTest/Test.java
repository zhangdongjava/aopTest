package aopTest;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.config.AopNamespaceHandler;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public void test(int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		BeanFactory factory = new FileSystemXmlApplicationContext("application.xml");
		factory.getBean(Test.class).test(12);
		AopNamespaceHandler aopNamespaceHandler;
		AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator; 
	}

}
