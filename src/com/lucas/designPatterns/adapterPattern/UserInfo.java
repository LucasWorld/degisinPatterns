package com.lucas.designPatterns.adapterPattern;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		System.out.println("Ա����������Lucas");
		return null;
	}

	@Override
	public String getHomeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Ա���ļ�ͥ��ַ��������");
		return null;
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		System.out.println("Ա���ֻ��ţ�13693004437");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		System.out.println("Ա���칫�ҵ绰��12345678");
		return null;
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		System.out.println("Ա��ְλ���������ʦ");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		System.out.println("Ա��סլ�绰��87654321");
		return null;
	}

}
