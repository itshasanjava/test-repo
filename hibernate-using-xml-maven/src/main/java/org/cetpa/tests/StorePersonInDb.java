package org.cetpa.tests;

import org.cetpa.beans.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StorePersonInDb 
{
	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Person.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Person person = new Person
				(2, "Raj", "New Delhi-11001", 34.5f);
		Transaction transaction = session.beginTransaction();
		session.save(person);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Object saved in Database");
	}
}