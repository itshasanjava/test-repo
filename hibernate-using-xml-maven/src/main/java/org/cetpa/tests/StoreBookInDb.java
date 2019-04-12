package org.cetpa.tests;

import org.cetpa.beans.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreBookInDb 
{
	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addResource("Book.hbm.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Book book = new Book(1003, "Java ME");
		Transaction transaction = session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Object saved in Database");
	}
}