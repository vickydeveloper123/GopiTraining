package com.inheritance;

public class Car extends Engine{

	public void drive() {
		
		int result=super.engine();
		
		if(result>1) {
			System.out.println(" drive updated sucessfully....");
		}else {
			System.out.println(" details are not there.....");
		}

		System.out.println("car is having drive method....");
	}  // abstract or instance method static method.
	
	

}