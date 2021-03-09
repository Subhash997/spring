package com.xworkz.modem.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.modem.service.ModemService;
import com.xworkz.modemDto.ModemDTO;


public class SpringTester {
	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring/application.xml");
ModemService	modemservice=context.getBean(ModemService.class);
modemservice.validation(new ModemDTO(7,"samsung","wireless"));
	
	}
}