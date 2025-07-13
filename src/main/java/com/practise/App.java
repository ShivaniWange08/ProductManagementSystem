package com.practise;

import java.util.Scanner;

import com.practise.Repositories.UserRepositories;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        while(true) {
        	UserRepositories userrepositories = new UserRepositories();
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.println("THANK YOU!!, Please select as per choice :");
        	System.out.println("1.Get details of single product");
        	System.out.println("2.Get detailed list of products");
        	System.out.println("3.Add your product");
        	System.out.println("4.Remove any product");
        	System.out.println("5.Update any product");
        	System.out.println("Enter your choice : ");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1 :{
        		System.out.println("Enter a Id of product :");
        		Scanner s = new Scanner(System.in);
        		int productId = s.nextInt();
        		userrepositories.getSingleProductDetails(productId);
        		break;
        	}
        	case 2 :{
        		System.out.println("List of Product : ");
        		userrepositories.getListOfProduct();
        		break;
        	}
        	case 3 :{
        		System.out.println("Enter a name of product you want to add :");
        		Scanner s1 = new Scanner(System.in);
        		String toAdd = s1.nextLine();
        		userrepositories.toAddYourProduct(toAdd);
        		break;
        	}
        	
        	case 4: {
        		System.out.println("Enter productId of that product you want to remove :");
        		Scanner s2 = new Scanner(System.in);
        		int remove = s2.nextInt();
        		userrepositories.toRemoveAnyProduct(remove);
        		break;
        	}
        	
        	case 5 :{
        	 System.out.println("Enter productId of that product you want to update :");
        	 Scanner s3 = new Scanner(System.in);
        	 int update = s3.nextInt();
        	 userrepositories.toUpdateProductDetail(update);
        	 break;
        	}
        	default:
        	}
        }
      
    }
}
