package com.xworkz.modem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.modemDAO.ModemDao;
import com.xworkz.modemDto.ModemDTO;
@Component
public class ModemServiceImpl  implements ModemService{
	
	@Autowired
	private ModemDao modemdao;
	

	public ModemServiceImpl(ModemDao modemdao) {
		super();
		 System.out.println("created"+this.getClass().getSimpleName());
		this.modemdao = modemdao;
	}


	@Override
	public boolean validation(ModemDTO modemDTO) {

		System.out.println("validation invoked");
		System.out.println("modemEntity " + modemDTO);
		
		int mid=modemDTO.getMid();
	String brand=	modemDTO.getBrand();
	String type=	modemDTO.getType();
		
		boolean valid=false;
		if (modemDTO != null) {
			if (mid != 0  && mid > 1 && mid <= 15) {
				System.out.println("modem id is valid");
				valid = true;
			} else {
				System.out.println(
						"m id is invalid, please enter minimum 3 charecters or maximum 15 charecters and it should not be empty");
				valid = false;
			}
			if (valid) {
				if ( brand!= null) {
					System.out.println(" brand is valid");
					valid = true;

				} else {
					System.out.println(" brand can not be empty");
					valid = false;
				}
				if (valid) {
					if (type.length() >= 2 && type.length()<= 1000 && type != null) {
						System.out.println("type is valid");
						valid = true;
					} else {
						System.out.println("typeshould be within 2 to 1000");
						valid = false;
					}
				
				}

			}else {
				System.out.println("create a modemdto properly");
			}if(valid) {
				System.out.println("modemdto  is valid, can save");
				modemdao.saveModemm(modemDTO);
			} else {
				System.out.println("Modem is invalid cant save");
			}

		
		
		
		}
		return valid;
	}

}