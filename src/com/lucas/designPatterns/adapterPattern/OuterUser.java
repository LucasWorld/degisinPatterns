package com.lucas.designPatterns.adapterPattern;

import java.util.HashMap;
import java.util.Map;


public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		// TODO Auto-generated method stub
		Map<String, String> userBaseInfo = new HashMap<String, String>();
		userBaseInfo.put("userName", "Lucas");
		userBaseInfo.put("mobileNumber", "13693004437");
		return userBaseInfo;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		// TODO Auto-generated method stub
		Map<String, String> userHomeInfo = new HashMap<String, String>();
		userHomeInfo.put("homeAddress", "北京市");
		userHomeInfo.put("homeTelNumber", "12345678");
		return userHomeInfo;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		// TODO Auto-generated method stub
		Map<String, String> userofficeInfo = new HashMap<String, String>();
		userofficeInfo.put("userPosition", "软件工程师");
		userofficeInfo.put("userOfficeNum", "87654321");
		return userofficeInfo;
	}

}
