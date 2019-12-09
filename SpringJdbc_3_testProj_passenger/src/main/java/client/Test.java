package client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.dao.PassengerDAO;
import com.np.spring.dto.EmployeeDTO;
import com.np.spring.dto.PassengerDTO;

public class Test {

	public static void main(String[] args) {
		// Declaring fields
		ApplicationContext context = null;
		PassengerDAO dao = null;
		PassengerDTO dto = null;

		context = new ClassPathXmlApplicationContext("com/np/spring/cfgs/applicationContext.xml");

		dto = (PassengerDTO) context.getBean("passengerDTO");
		dao = (PassengerDAO) context.getBean("passengerDao");

		// loading dto object
		dto.setId(103);
		dto.setFirstName("Ravi");
		dto.setLastName("Kumar");

		/*
		 * int result = dao.insert(dto);
		 * 
		 * System.out.println(result + " record inserted");
		 */
		
		  EmployeeDTO data = dao.read(101);
		  
		  System.out.println(data);
		  
		  List<EmployeeDTO> alldata = dao.readAll();
		  
		  System.out.println(alldata);
		 

		((ConfigurableApplicationContext) context).close();

	}// main

}// class
