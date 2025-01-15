package com.expert;

public class BuilderPattern {
	
	public static void main(String[] args) {
		
	User user=	new User.UserBuilder().setEmailId("growthfornewyear@gmail.com")
		.setUserId("test").setUserName("Sonu Nigam").build();
	
	System.out.println(user);
	}

}
