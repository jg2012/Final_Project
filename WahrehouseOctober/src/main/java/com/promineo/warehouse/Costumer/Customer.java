package com.promineo.warehouse.Costumer;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data //provides settings and getters for all global variables 
public class Customer {
//this is a representation of a customer 
  
    @Id // gets primary key 
    @GeneratedValue(strategy=GenerationType.AUTO)//auto incrmentatoin
    public int CustomerID; 
    @Column(value="CustomerName")//
    public String CustomerName;  
    public String ContactName;  
    public String Addres; 
    public String City;  
    public String PostalCode;  
    public String Country; 
    
    public Customer() {}

    public Customer(int customerID, String customerName, String contactName, String addres, String city,
	    String postalCode, String country) {
	CustomerID = customerID;
	CustomerName = customerName;
	ContactName = contactName;
	Addres = addres;
	City = city;
	PostalCode = postalCode;
	Country = country;
    }

    public Customer(String customerName, String contactName, String addres, String city, String postalCode,
	    String country) {
	super();
	CustomerName = customerName;
	ContactName = contactName;
	Addres = addres;
	City = city;
	PostalCode = postalCode;
	Country = country;
    }
    
    
    
    
    
}
