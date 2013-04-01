package com.lucas.designPatterns.adapterPattern;

public interface IUserInfo {

	/**
	 * @auther Lucas 获取用户姓名
	 */
	public abstract String getUserName();

	/**
	 * @auther Lucas 获取用户家庭住址
	 */
	public abstract String getHomeAddress();

	/**
	 * @auther Lucas 获取用户手机号码
	 * 
	 */
	public abstract String getMobileNumber();

	/**
	 * @auther Lucas 获取用户办公室电话
	 */
	public abstract String getOfficeTelNumber();

	/**
	 * @author Lucas 获取用户办公室电话
	 */
	public abstract String getJobPosition();

	/**
	 * @author Lucas 获取用户住宅电话
	 */
	public abstract String getHomeTelNumber();

}
