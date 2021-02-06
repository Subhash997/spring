package com.xworkz.assignment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CpbTester {

	public static void main(String[] args) {
	
		ApplicationContext springContext=new ClassPathXmlApplicationContext("fw/spring.xml");
		Projector projectRef=springContext.getBean(Projector.class);
		System.out.println(projectRef);
		projectRef.displayProjector();
		Ball ballRef=springContext.getBean(Ball.class);
		System.out.println(ballRef);
		ballRef.display();
		Country countryRef=springContext.getBean(Country.class);
		System.out.println(countryRef);
		countryRef.displayCountryInfo();


	}
	}


