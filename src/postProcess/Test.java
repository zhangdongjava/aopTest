package postProcess;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("application2.xml");
		String name = factory.getBean(Msg.class).getName();
		System.out.println(name);
	}

}
