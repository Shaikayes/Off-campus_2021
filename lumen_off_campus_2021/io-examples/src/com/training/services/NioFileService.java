package com.training.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import com.training.model.*;
public class NioFileService {

	
	public boolean writeToFile(String fileName,List<CreditCard> cards) {
		
		boolean result = false;
		
		
		Path filePath = Paths.get(fileName);
		
		try(BufferedWriter writer = 
				Files.newBufferedWriter(filePath, 
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND)){
			
			for(CreditCard eachCard:cards) {
				writer.write(eachCard.toString());
				writer.newLine();
			result = true;
			}
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
		
		 return result;
	}
	
	public List<CreditCard> readFromFile(String fileName){
	
		 List<CreditCard> list = new ArrayList<>();
		 
		 Path filePath = Paths.get(fileName);
			
			try(BufferedReader reader = Files.newBufferedReader(filePath)){
			 
			 String line = null;
			   while( (line =reader.readLine())!=null){
					String[] values = line.split(",");
					
					CreditCard card = new CreditCard(Long.parseLong(values[0]),
							      values[1], Double.parseDouble(values[2]),
							                 Long.parseLong(values[3]));
					list.add(card);
					
			   }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return list;

		}
	
	public List<String> usingReadAllLines(String fileName){
		
	  List<String> list = null;
	  
		 Path filePath = Paths.get(fileName);
		 
		  
		  try {
		
			 list =Files.readAllLines(filePath);
			
			
		} catch (IOException e) {
					e.printStackTrace();
		}
		  
		  
		return list;

	}
	
	
}
