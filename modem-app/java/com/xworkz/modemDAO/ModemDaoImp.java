package com.xworkz.modemDAO;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class ModemDaoImp implements ModemDao {
	
	
	
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public ModemDaoImp() {
		
	}

	@Override
	public void saveModemm(com.xworkz.modemDto.ModemDTO modemDTO) {
//	Configuration conn=new Configuration();
//	conn.configure();
//SessionFactory	 factory=conn.buildSessionFactory();
try {  
	Session	session=factory.openSession();
		session.beginTransaction();
		session.save(modemDTO);
		session.getTransaction().commit();
}

catch (HibernateException e) {
	e.printStackTrace();
	
		
	}
}
}