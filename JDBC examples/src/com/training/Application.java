package com.training;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.training.daos.CustomerRepositoryImpl;
import com.training.model.Customer;
import com.training.utility.DbConnection;

public class Application {

	public static void main(String[] args) {
		
		Connection con = DbConnection.getOracleConnection();
		
		CustomerRepositoryImpl dao = new CustomerRepositoryImpl(con);
		
		int ch=1;
		try {
			
			if(ch==1) {
				dao.add(new Customer(3,"Magesh", "ram@abc.com"));
				dao.add(new Customer(4,"Naveen", "sur@abc.com"));
				dao.add(new Customer(5,"Humera", "hum@abc.com"));

			}
			
			if(ch==2) {
				List<Customer> list = dao.findAll();
				for(Customer eachCustomer: list) {
					
					System.out.println(eachCustomer);
				}
			}
			
			if(ch==3) {
				Customer cust = dao.findById(1);
				
			 System.out.println(cust);
			}
			
//			if(ch==4) {
//				if(dao.remove(3)==1)
//				{
//					System.out.println("Deleted the Customer");
//				}
//				else {
//					System.out.println("Customer doesnt exist");
//				}
//			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
