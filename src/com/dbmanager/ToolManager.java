package com.dbmanager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ToolManager {

	public static void main(String args[]) {
		addRegistration();
	}

	public static String addRegistration() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			SessionFactory SessionFactory = configuration.buildSessionFactory(serviceRegistry);
			Session session = SessionFactory.openSession();
			String SQL = "from Users";
			Query TempQuery = session.createQuery(SQL);
			List TempList = TempQuery.list();
			System.out.println(TempList);

		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
		return null;

	}
}
