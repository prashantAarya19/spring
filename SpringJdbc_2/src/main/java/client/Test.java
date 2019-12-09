package client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.np.spring.dao.EmployeeDAO;
import com.np.spring.dto.EmployeeDTO;

public class Test {

		public static void main(String[] args) {
		//Declaring fields
		ApplicationContext context = null;
		EmployeeDTO dto = null;
		EmployeeDAO dao = null;
		
		
		context = new ClassPathXmlApplicationContext("com/np/spring/cfgs/applicationContext.xml");
		
		
		/*
		 * dto = (EmployeeDTO)context.getBean("dto"); dto.setId(105);
		 * dto.setFirstname("Hari Narayan"); dto.setLastname("Mandal");
		 */
		 
		dao = (EmployeeDAO)context.getBean("dao");
		
		//System.out.println(dao.insert(dto)+" record inserted.");
		List<EmployeeDTO> result = dao.readAll();
		
		System.out.println(result);
		
		
		((ConfigurableApplicationContext)context).close();
		
		
	}//main

}//class
