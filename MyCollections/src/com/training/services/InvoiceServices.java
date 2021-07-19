package com.training.services;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.ifaces.Invoice;

public class InvoiceServices implements CrudRepository<Invoice> {
	@Override
	public boolean save(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invoiceList.add(entity);
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Invoice> invoiceList;

	public InvoiceServices() {
		super();
		this.invoiceList=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

}
