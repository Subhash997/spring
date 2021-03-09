package com.xworkz.modem.service;

import org.springframework.stereotype.Component;

import com.xworkz.modemDto.ModemDTO;
@Component
public interface ModemService {

	boolean validation(ModemDTO  modemDTO);
	
	
}