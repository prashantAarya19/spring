package Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.np.spring.config.ServiceConfig;
import com.np.spring.service.Service;

public class Client {

	public static void main(String[] args) {
		//fields
		AbstractApplicationContext context = null;
		
		context = new AnnotationConfigApplicationContext(ServiceConfig.class);
		//context.register(DaoConfig.class, ServiceConfig.class);
		
		//getting bean of service class
		Service service = (Service) context.getBean(Service.class);
		service.prep();
		((AbstractApplicationContext) context).close();
	}

}
