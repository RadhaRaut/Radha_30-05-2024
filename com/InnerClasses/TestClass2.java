package com.InnerClasses;

public class TestClass2 {

	public static void main(String[] args) {
		
		//Cannot instantiate the type Department
				//anonymous inner class **
				Department department = new Department(101, "QA")
				{

					@Override
					public void getDepartmentDetails() 
					{
						System.out.println(getDeparatmentId());
						System.out.println(getDeparatmentName());
						
					}
					
				};
				department.getDepartmentDetails();
				
				//by lambda expression
		
		
}
}