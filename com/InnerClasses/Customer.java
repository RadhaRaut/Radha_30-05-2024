package com.InnerClasses;
/* class contain n numbers of properties.
 * we can declare class as static but it should be a inner class.
 * 
 */

// outer class
public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;

	public Customer() {

	}

	public Customer(int customerId, String customerName, long customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}

	@Override
	public String toString() // Returns a string representation of the object
	{
		return "Costomer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + "]";
	}

	// inner classes / nested class

	public class Address    // non-static class
	{
		private String customerCity;

		public Address() {

		}

		public Address(String customerCity) {

			this.customerCity = customerCity;
		}

		// method
		@Override
		public String toString() {
			return "Address [customerCity=" + customerCity + "]";
		}
		
		public void getCustomerDetails() 
		{
			System.out.println(customerId);
			System.out.println(customerName);
			System.out.println(customerContact);
			System.out.println(customerCity);
			
			
		}
		
		public static class Qualification  // static inner class
		{
             public static String education;
	
		
		static
		{
			education	 = "b.tech";
			
		}
		
		public static void getEducationDetails() {
			
			System.out.println(education);
		}
		
		}
	}
}
	
