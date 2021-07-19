package com.training.services;
import java.io.*;

import com.training.model.CreditCard;

public class FileService {

	
	public boolean serialize(CreditCard card , File file) {
		
		boolean result = false;
		
		try (ObjectOutputStream outStream= new ObjectOutputStream(new FileOutputStream(file))) {
			
			outStream.writeObject(card);
			
			result =true;
		}catch(IOException e) {
			 e.printStackTrace();
		}
		
		 return result;
	}
	
	public Object deserialize(File file) {
		
		
		Object obj =null;
		
		try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file))){
			
			obj = inStream.readObject();
			
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	
	public boolean writeToTextFile(CreditCard card,File file) {
		
		boolean result = false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(file,true))){
			
			writer.println(card);
			
			result =true;
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public CreditCard[]  readFromTextFile(File file) {
		
		
		CreditCard[] cards = new CreditCard[2];
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line =null;
			int i=0;
			while((line = reader.readLine())!=null) {
				
				String[] values = line.split(",");
				
				CreditCard card = new CreditCard(Long.parseLong(values[0]),
						      values[1], Double.parseDouble(values[2]), Long.parseLong(values[3]));
				cards[i]=card;
				i++;
			}
			
		}catch (Exception e) {
              e.printStackTrace();
		}
		
		return cards;
	}
}
