package com.lucas.designPatterns.singletonPatterns;

public class Emperor {

	/**
	 * @uml.property name="emperor"
	 */
	private static Emperor emperor = null;

	/**
	 * 私有构造函数，现在外界通过new产生对象
	 */
	private Emperor() {
	}

	/**
	 * 获得皇帝实例的唯一方法
	 */
	public static Emperor getInstance() {
		if (emperor == null) {
			emperor =  new Emperor();
		}
		return emperor;
	}

	/**
	 * 打印皇帝的相关信息
	 */
	public static void emperorInfo() {
		System.out.println("我是皇帝");
	}

}
