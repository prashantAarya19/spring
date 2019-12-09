package client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.np.spring.orm.product.dao.ProductDAO;
import com.np.spring.orm.product.entity.Product;

public class TestClient {

	public static void main(String[] args) {
		//fields
		ApplicationContext context = null;
		ProductDAO dao = null;
		Product prod = null;
		
		context = new ClassPathXmlApplicationContext("com/np/spring/orm/product/cfgs/applicationContext.xml");
		dao = (ProductDAO) context.getBean("dao");
		prod = (Product) context.getBean("product");
		
		//prod.setId(102);
		/*
		 * prod.setName("Cocacola"); prod.setDesc("My fevourite"); prod.setPrice(45.0);
		 */
		//executing business logic
		//int result = dao.create(prod);
		
		//System.out.println("id:::"+result+" inserted");
		//dao.delete(prod);
		/*
		 * Product record = dao.get(prod.getId()); System.out.println(record);
		 */
		//closing application context
		List<Product> result = dao.getAll();
		System.out.println(result);
		if(context!= null)
			((ConfigurableApplicationContext)context).close();
	}//main

}//class
