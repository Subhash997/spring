package com.xworkz.modemDAO;


import org.springframework.stereotype.Component;

import com.xworkz.modemDto.ModemDTO;
@Component
public interface ModemDao {
public void saveModemm(ModemDTO modemDTO);

}