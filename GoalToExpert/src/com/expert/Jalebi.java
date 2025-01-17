package com.expert;

public class Jalebi {

	//isko bolate hai eager way of creating the singleton object
	//not good for big project where we not using the object but we still creating it.
	private static Jalebi jalebi=new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
