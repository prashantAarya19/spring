/* Important points */
/* If the dependent bean is prototype (in our case bank) and the target bean (in our case bank) is singleton
 * then also every time new object will be created whenever we will call the getBean() method*/
/* If the dependent bean is singleton (in our case bank) and the target bean (in our case bank) is prototype
 * then also every time only one object will be created whenever we will call the getBean() method*/
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.beans.Bank;

public class Client {
	
		public static void main(String[] args) {
			ApplicationContext context = null;
			Bank bank = null;
			context = new ClassPathXmlApplicationContext("com\\np\\spring\\cfgs\\applicationContext.xml");
			
			bank = context.getBean("bank", Bank.class);
			
			//System.out.println(bank.getIntrest().hashCode());
			
			//bank = context.getBean("bank", Bank.class);
			//System.out.println(bank.getIntrest().hashCode());

			
			//calling business method
			bank.intrestCalculator();
			
			((ConfigurableApplicationContext)context).close();
			
			}
}//class
