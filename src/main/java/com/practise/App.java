package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Product;
import com.practise.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
    	Product p = new Product();
    	p.setProductId(105);
    	p.setProductName("SummerKiss Perfume");
    	p.setProductPrice(499);
    	p.setProductMadeIn("India");
    	p.setProductBrand("Aqualogica");
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(p);
        transaction.commit();
        session.close();
        
    }
}
