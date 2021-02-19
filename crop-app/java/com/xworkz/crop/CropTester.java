package com.xworkz.crop;

import com.xworkz.crop.Dao.CropDAO;
import com.xworkz.crop.Dao.CropDAOImpl;
import com.xworkz.crop.constants.CropSeason;
import com.xworkz.crop.constants.CropType;
import com.xworkz.crop.entity.CropEntity;

public class CropTester {
	
public static void main(String[] args) {
			
			 CropEntity cropEntity = new CropEntity("Ragi", CropType.KHARIF, 40.0, CropSeason.MONSOON, true, 5);
			 
			 CropDAO cropDAOImpl = new CropDAOImpl();
			 cropDAOImpl.create(cropEntity);

		}

}
