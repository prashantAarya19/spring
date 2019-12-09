package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.beans.WishGenerator;

public class Client {
	
		public static void main(String[] args) {
			//declaring variables
			//BeanFactory factory = null;
			//Resource resource = null;
			WishGenerator wish = null;
			ApplicationContext context = null;
			
			//resource = new ClassPathResource("com\\np\\spring\\cfgs\\applicationContext.xml");
			
			//creating factory object
			//factory = new XmlBeanFactory(resource);
			
			context = new ClassPathXmlApplicationContext("com\\np\\spring\\cfgs\\applicationContext.xml");
			
			wish = context.getBean("wg", WishGenerator.class);
			
			//calling business method
			wish.wish();
			
			((ConfigurableApplicationContext)context).close();
			
			}
}//class
