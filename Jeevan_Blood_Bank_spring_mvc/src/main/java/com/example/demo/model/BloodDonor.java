package com.example.demo.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BloodDonor {
	
	@Range(min =11111, max=99999, message="phone number should be a 5 digit Number")
	long phoneNumber;
	String bloodGroup;
	String firstName;

}
