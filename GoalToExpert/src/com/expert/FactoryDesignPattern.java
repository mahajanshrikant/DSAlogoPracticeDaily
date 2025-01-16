package com.expert;

public class FactoryDesignPattern {

	//get the employee 
	public static Employee1 getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		} else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();
		} else {
			return null;
		}
	}
}
