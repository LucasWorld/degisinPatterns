package com.lucas.designPatterns.adapterPattern;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		System.out.println("员工的姓名：Lucas");
		return null;
	}

	@Override
	public String getHomeAddress() {
		// TODO Auto-generated method stub
		System.out.println("员工的家庭地址：北京市");
		return null;
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		System.out.println("员工手机号：13693004437");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		System.out.println("员工办公室电话：12345678");
		return null;
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		System.out.println("员工职位：软件工程师");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		System.out.println("员工住宅电话：87654321");
		return null;
	}

}
