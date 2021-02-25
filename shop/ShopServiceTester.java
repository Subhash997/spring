package com.xworkz.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopServiceTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("fw/spring.xml");

		ShopService service = container.getBean(ShopService.class);
		service.validation(new ShopDTO("bonda", "masaldosa", "ravaidli", Open.valueOf("True")));
	}

}