package com.example.demo;

import com.example.demo.services.InvoiceService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	InvoiceService service = new InvoiceService();
        System.out.println( "Hello World!" + service.getInvoice());
    }
}

