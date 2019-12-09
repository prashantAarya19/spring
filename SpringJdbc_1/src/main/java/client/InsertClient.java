package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertClient {

		public static void main(String[] args) {
		//Declaring fields
		ApplicationContext context = null;
		JdbcTemplate template = null;
		final String INSERT_QUERY = "insert into employee values(?, ?, ?)";
		
		context = new ClassPathXmlApplicationContext("com/np/spring/cfgs/applicationContext.xml");
		template = (JdbcTemplate) context.getBean("jdbcTemplate");
		int result = template.update(INSERT_QUERY, Integer.valueOf(102), "Namrata", "Aarya");
		
		System.out.println(result +" record inserted.");
		
		((ConfigurableApplicationContext)context).close();
		
		
	}//main

}//class
