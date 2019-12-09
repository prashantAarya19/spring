package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.np.spring.beans.Bike;
import com.np.spring.beans.Vehicle;

public class Client {
	
		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			//declaring variables
			BeanFactory factory = null;
			Resource resource = null;
			Vehicle vehicle = null;
			
			resource = new ClassPathResource("com\\np\\spring\\cfgs\\applicationContext.xml");
			
			//creating factory object
			factory = new XmlBeanFactory(resource);
			
			vehicle = factory.getBean("bike", Bike.class);
			
			//calling business method
			vehicle.build();
			vehicle.run();
		}
}//class
