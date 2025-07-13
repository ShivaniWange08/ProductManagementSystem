package com.practise.Repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Product;

import com.practise.Utility.HibernateUtility;

public class UserRepositories {
	
	//to get single product
	public void getSingleProductDetails(int productId) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Product pd = session.find(Product.class, productId);
        //System.out.println(pd.toString());
        transaction.commit();
        session.close();
        
        System.out.println("Product ID : " + pd.getProductId());
		System.out.println("Product Name : " + pd.getProductName());
		System.out.println("Product Price : " + pd.getProductPrice());
		System.out.println("Manufactured In :" +pd.getProductMadeIn());
		System.out.println("Product Brand : " +pd.getProductBrand());
	}
	
	//to get list of product
	public void getListOfProduct() {
SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
	    List<Product> productList = session.createQuery("select p from Product p", Product.class)
	    		.getResultList();
	    
	    productList.stream().forEach(k -> System.out.println(k.toString()));
	    transaction.commit();
	    session.close();
	}
	
	//to add your own product
	public String toAddYourProduct(String toAdd)
    {  
    	Product p = new Product();
    	p.setProductId(109);
    	p.setProductName("JOY Sunscreen");
    	p.setProductPrice(259);
    	p.setProductMadeIn("India");
    	p.setProductBrand("JOY");
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(p.toString());
        session.persist(p);
        transaction.commit();
        session.close();
		return toAdd;
        
    }
	//to delete any product
	public void toRemoveAnyProduct(int remove) {
	        
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Product s = session.find(Product.class, 0);
		session.remove(s);
		transaction.commit();
		session.close();
			
			
		}
	
	//to update any detail of product
	public void toUpdateProductDetail(int update) {
        
		SessionFactory factory = HibernateUtility.getSessionFactory();
	    Session session = factory.openSession();
	    Transaction transaction = session.beginTransaction();
		Product p1 = session.find(Product.class, 101);
		p1.setProductPrice(370);
		transaction.commit();
		session.close();
	}
	}
	

