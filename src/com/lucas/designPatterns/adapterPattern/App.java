package com.lucas.designPatterns.adapterPattern;


public class App {
	public static void main(String[] args) {
		IUserInfo userInfo = new OuterUserInfo();
		//IUserInfo userInfo = new UserInfo();
		for (int i = 0; i < 100; i++) {
			userInfo.getMobileNumber();
		}
	}

}
