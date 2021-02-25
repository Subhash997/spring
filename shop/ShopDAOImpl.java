package com.xworkz.shop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ShopDAOImpl implements ShopDAO {

	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void saveShop(ShopDTO shopDto) {

		try {
			// Configuration conn=new Configuration();
			// conn.configure();
			// SessionFactory factory=conn.buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(shopDto);
			session.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
