package com.training;

public class Application {

	int abc;
	static void show() {
		
		 int a=0 ;
		 
		 System.out.println(a);
		 ;
	}
	
	public static void understandFinally(String args) {
		
		
		try {
			int number = Integer.parseInt(args);
			System.out.println("Number:="+number);

		} catch (NumberFormatException e) {
			System.out.println("Argument should be a number");

			e.printStackTrace();
		}
		finally {
			System.out.println("DONE- Inside Finally");
		}
		
		

	}
	
	public static String understandClearly(String args) {
		
		try {
			int number = Integer.parseInt(args);
			System.out.println("Number:="+number);

		} catch (NumberFormatException e) {
			System.out.println("Argument should be a number");

			e.printStackTrace();
			return "From Catch";
		}catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e.getMessage());
		}
		finally {
			System.out.println("DONE- Inside Finally");
		}

		return "From Clearly";
	}
	
public static String mutlpleCatch(String args) {
		
		try {
			int number = Integer.parseInt(args);
			System.out.println("Number:="+number);

		} catch (NumberFormatException  | ArrayIndexOutOfBoundsException e) {
			System.out.println("Argument should be a number");

			e.printStackTrace();
			return "From Catch";
		}
		finally {
			System.out.println("DONE- Inside Finally");
		}

		return "From Clearly";
	}

	public static void main(String[] args) {

		// understandFinally(args[0]);
		System.out.println(understandClearly(args[0]));
		
				
	}

}
