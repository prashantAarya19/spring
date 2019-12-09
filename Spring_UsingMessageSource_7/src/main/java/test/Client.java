/* Important points */
/* If the dependent bean is prototype (in our case bank) and the target bean (in our case bank) is singleton
 * then also every time new object will be created whenever we will call the getBean() method*/
/* If the dependent bean is singleton (in our case bank) and the target bean (in our case bank) is prototype
 * then also every time only one object will be created whenever we will call the getBean() method*/
package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.beans.Bank;


public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = null;
		Bank bank = null;
		
		context = new ClassPathXmlApplicationContext("com\\np\\spring\\cfgs\\applicationContext.xml");
		context.registerShutdownHook();
		
		bank = (Bank) context.getBean("bank");
		
		//calling business method
		bank.intrestCalculator();
		 
		
		((ConfigurableApplicationContext)context).close();

	}
}// class
