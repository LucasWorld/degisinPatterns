package com.lucas.designPatterns.singletonPatterns;

public class EmperorNext {

	/**
	 * @uml.property name="emperor" readOnly="true"
	 */
	private static final EmperorNext emperor = new EmperorNext();

	/**
	 * 私有构造函数，禁止外界通过new关键字创建对象
	 */
	private EmperorNext() {
	}

	/**
	 * @author：Lucas 获取皇帝实例的唯一方法
	 */
	public static EmperorNext getInstence() {
		return emperor;
	}
	
	

}
