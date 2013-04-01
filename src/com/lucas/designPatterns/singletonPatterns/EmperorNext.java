package com.lucas.designPatterns.singletonPatterns;

public class EmperorNext {

	/**
	 * @uml.property name="emperor" readOnly="true"
	 */
	private static final EmperorNext emperor = new EmperorNext();

	/**
	 * ˽�й��캯������ֹ���ͨ��new�ؼ��ִ�������
	 */
	private EmperorNext() {
	}

	/**
	 * @author��Lucas ��ȡ�ʵ�ʵ����Ψһ����
	 */
	public static EmperorNext getInstence() {
		return emperor;
	}
	
	

}
