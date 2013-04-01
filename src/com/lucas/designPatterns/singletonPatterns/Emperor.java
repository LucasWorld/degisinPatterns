package com.lucas.designPatterns.singletonPatterns;

public class Emperor {

	/**
	 * @uml.property name="emperor"
	 */
	private static Emperor emperor = null;

	/**
	 * ˽�й��캯�����������ͨ��new��������
	 */
	private Emperor() {
	}

	/**
	 * ��ûʵ�ʵ����Ψһ����
	 */
	public static Emperor getInstance() {
		if (emperor == null) {
			emperor =  new Emperor();
		}
		return emperor;
	}

	/**
	 * ��ӡ�ʵ۵������Ϣ
	 */
	public static void emperorInfo() {
		System.out.println("���ǻʵ�");
	}

}
