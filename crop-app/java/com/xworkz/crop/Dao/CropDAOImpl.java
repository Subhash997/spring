package com.xworkz.crop.Dao;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.crop.entity.CropEntity;

public class CropDAOImpl implements CropDAO {
	
	public CropDAOImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	SessionFactory sessionFac;
	
	public void setSessionF(SessionFactory sessionFac) {
		this.sessionFac = sessionFac;
	}
@Override
	public Long create(CropEntity cropEntity) {
	System.out.println("invoked saveCrop");
		
		Transaction transaction= null;
		SessionFactory factory = sessionFac;
		try(Session session =  factory.openSession()){
			transaction = session.getTransaction();
			session.beginTransaction();
			Serializable id=session.save(cropEntity);
			
			session.getTransaction().commit();
			return (Long)id;
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			factory.close();
		}
		
		return null;
		
	}

}
