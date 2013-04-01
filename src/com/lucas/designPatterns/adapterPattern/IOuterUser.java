package com.lucas.designPatterns.adapterPattern;

import java.util.Map;

public interface IOuterUser {

	/**
		 */
	public abstract Map<String, String> getUserBaseInfo();

	/**
			 */
	public abstract Map<String, String> getUserHomeInfo();

	/**
				 */
	public abstract Map<String, String> getUserOfficeInfo();

}
