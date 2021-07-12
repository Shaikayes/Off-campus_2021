package com.example.demo.model;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Comparable<Car>{

	private String model;
	private String status;
	private int yearofmanufacture;
	private int kilometers;
	private String brandName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getYearofmanufacture() {
		return yearofmanufacture;
	}
	public void setYearofmanufacture(int yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", status=" + status + ", yearofmanufacture=" + yearofmanufacture
				+ ", kilometers=" + kilometers + ", brandName=" + brandName + "]";
	}
	public Car(String model, String status, int yearofmanufacture, int kilometers, String brandName) {
		super();
		this.model = model;
		this.status = status;
		this.yearofmanufacture = yearofmanufacture;
		this.kilometers = kilometers;
		this.brandName = brandName;
	}
}
	
	

