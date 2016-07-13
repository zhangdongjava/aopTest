package aopTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
    
@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test(){
		
	}
	
//	@Before("test()")
//	public void testBefore(){
//		System.out.println("testBefore");
//	}
//	@After("test()")
//	public void testAfter(){
//			System.out.println("testAfter");
//	}
	
	@Around("test()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		joinPoint.proceed(new Object[]{5});
	}
}
