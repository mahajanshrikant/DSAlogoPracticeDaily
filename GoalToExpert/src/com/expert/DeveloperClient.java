package com.expert;

public class DeveloperClient {

	public static void main(String[] args) {
		
		Employee1 t=FactoryDesignPattern.getEmployee("ANDROID DEVELOPER");
		t.Salary();
	}
}
