package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Customer;

public class CustomerRepositoryImpl implements CrudRepository<Customer> {

	private Connection con;
	@Override
	public int add(Customer t) throws SQLException {
		String sqlAdd = "insert into customer values(?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(sqlAdd);

			pstmt.setInt(1, t.getId());
			pstmt.setString(2,t.getCustomerName());
			pstmt.setString(3, t.getEmail());

		int rowAdded = pstmt.executeUpdate();

		return rowAdded;
	}

	public CustomerRepositoryImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public List<Customer> findAll() throws SQLException {
		List<Customer> custList = new ArrayList<>();
		String sql = "select * from customer";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String customerName = rs.getString("customerName");
			String email = rs.getString("email");

			custList.add(new Customer(id, customerName, email));
		}
		
		return custList;	
	}
	
	@Override
	public Customer findById(int key) throws SQLException {
		Customer cust=null;
		String sql = "select * from customer where id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, key);
		ResultSet rs= pst.executeQuery();
		if(rs.next())
		{
			String customerName = rs.getString("customerName");
			String email = rs.getString("email");
			int id = rs.getInt("id");
			cust=new Customer(id, customerName, email);
	}
		return cust;
	}
	
	public int remove(int key) throws SQLException{
		int rowdeleted=0;
		String sql= "delete from customer where id=?";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1, key);
		rowdeleted = pst.executeUpdate();

		return rowdeleted;

	}


	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	

	
	public List<Customer> findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
