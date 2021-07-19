package com.training;
import java.util.*;
public class NameService {
	
	List<String> nameList;
	
	public NameService() {
		super();
     nameList = Arrays.asList("Abi",null,"shalini",null,"prakash");
	}

	public String getName(int idxPos) {
		
		return nameList.get(idxPos);
	}
		
	public String getNameWithDelay(int idxPos) {
		
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		 return this.nameList.get(idxPos);
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	
}
