package com.training;

import java.util.ArrayList;
import java.util.List;

import com.training.model.CreditCard;
import com.training.services.CreditCardServices;

public class StreamApplication {

	public static void main(String[] args) {
		
		List<CreditCard> cards = new ArrayList<CreditCard>();
		
		cards.add(new CreditCard(10233, "ramesh", 789, 80000));
		cards.add(new CreditCard(20233, "Suresh", 689, 700000));
		cards.add(new CreditCard(30233, "Ayushi", 589, 50000));
		cards.add(new CreditCard(40233, "Ahmed", 489, 60000));
		cards.add(new CreditCard(50233, "Parish", 6789, 900000));
		
		CreditCardServices service = new CreditCardServices();
		
		service.usingFilterAndMap();
		service.collectingToUtilMap();

		}

	}
