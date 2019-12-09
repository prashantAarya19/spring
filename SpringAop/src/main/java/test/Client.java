package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.service.Intrest;

public class Client {

	public static void main(String[] args) {
		//fields
		ApplicationContext context = null;
		Intrest intrest = null;
		
		context = new ClassPathXmlApplicationContext("com/np/spring/cfgs/applicationContext.xml");
		intrest = (Intrest) context.getBean("intrest");
		
		//calling business method
		System.out.println("The intrest for the given amount is "+intrest.getIntrest(100000));
		
	}//main()

}//class
