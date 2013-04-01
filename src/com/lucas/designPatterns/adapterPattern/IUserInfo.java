package com.lucas.designPatterns.adapterPattern;

public interface IUserInfo {

	/**
	 * @auther Lucas ��ȡ�û�����
	 */
	public abstract String getUserName();

	/**
	 * @auther Lucas ��ȡ�û���ͥסַ
	 */
	public abstract String getHomeAddress();

	/**
	 * @auther Lucas ��ȡ�û��ֻ�����
	 * 
	 */
	public abstract String getMobileNumber();

	/**
	 * @auther Lucas ��ȡ�û��칫�ҵ绰
	 */
	public abstract String getOfficeTelNumber();

	/**
	 * @author Lucas ��ȡ�û��칫�ҵ绰
	 */
	public abstract String getJobPosition();

	/**
	 * @author Lucas ��ȡ�û�סլ�绰
	 */
	public abstract String getHomeTelNumber();

}
