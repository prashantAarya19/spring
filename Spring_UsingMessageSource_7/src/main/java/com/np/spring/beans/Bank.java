//Using JSRs-250(Java Specification Requests ) annotation
package com.np.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

//@Service
/*For dao */
@Repository
public class Bank {
	private Intrest intrest = null;
	private MessageSource messageSource = null;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Intrest getIntrest() {
		return intrest;
	}
	
	//@Resource(name = "intrest2")
	@Resource
	public void setIntrest(Intrest intrest) {
		this.intrest = intrest;
	}



	public void intrestCalculator() {
		System.out.println("Genral Intrest::"+intrest.getRate()+"%");
		System.out.println(this.messageSource.getMessage("intrest.calc",new Object[] {intrest.getRate()}, "default intrest", null));
		System.out.println(this.messageSource.getMessage("greet", null, "defaultMessage", null));
	}
	
	@PostConstruct
	public void bankInit() {
		System.out.println("Bank bean has been initilize");
	}
	
	@PreDestroy
	public void bankDestroy() {
		System.out.println("Bank bean destroyed");
	}

}
