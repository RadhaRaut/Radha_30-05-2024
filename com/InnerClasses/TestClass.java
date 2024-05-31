package com.InnerClasses;

public class TestClass {

	public static void main(String[] args) {

		Customer c1 = new Customer(6785, "Radha", 8010707619l);
		System.out.println(c1.toString());
		
		System.out.println("----------------------------------------");
		
		Customer.Address address= c1.new Address("Pune");
		address.getCustomerDetails();
		
		System.out.println("----------------------------------------");
		
		Customer.Address.Qualification.getEducationDetails();
	}

}
