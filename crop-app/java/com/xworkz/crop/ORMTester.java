package com.xworkz.crop;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.crop.Dao.CropDAO;
import com.xworkz.crop.constants.CropSeason;
import com.xworkz.crop.constants.CropType;
import com.xworkz.crop.entity.CropEntity;

public class ORMTester {

	public static void main(String[] args) {
		
		String filePath = "spring/application.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(filePath);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		CropDAO cropDAO = container.getBean(CropDAO.class);
		CropEntity cropEntity =  new CropEntity("Rice", CropType.KHARIF, 40.0, CropSeason.MONSOON, true, 5);
		System.out.println(cropDAO.create(cropEntity));
		
	
	}

}
