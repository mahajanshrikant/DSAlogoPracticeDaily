package com.expert;

public class User {

	private final String userId;
	private final String userName;
	private final String emailId;
	
	//constructors  is  private 
	private User(UserBuilder builder) {
		//Initialize
		this.userId=builder.userId;
		this.emailId=builder.emailId;
		this.userName=builder.userName;
	}

	public String getUserId() {
		return userId;
	}

	

	public String getUserName() {
		return userName;
	}

	

	public String getEmailId() {
		return emailId;
	}

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
	}


	//inner  class to create object
	static class UserBuilder {
		
		private  String userId;
		private  String userName;
		private  String emailId;
		
		//Inner class  ka  constructor public 
		
		public UserBuilder() {
			
		}
		//using method chaining
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		
		
		public User build() {
			User user=new User(this);
			return user;
		}
		
	}
	
	
	
}
