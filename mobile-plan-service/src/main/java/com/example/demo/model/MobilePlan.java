package com.example.demo.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MobilePlan {
	public MobilePlan() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Mobile plan Constructor called");
	}
	int id;
	String planName;
	double value;
	long validity;

}
