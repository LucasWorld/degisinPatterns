package com.lucas.designPatterns.facadePattern;

public interface LetterProcess {

	/**
	 * д��
	 */
	public abstract void write(String content);

	/**
	 * ��д�ŷ�����
	 */
	public abstract void fillEnvonope(String address);

	/**
	 * ���ŷ����ŷ�
	 */
	public abstract void letterIntoEnvolope();

	/**
	 * ���żĳ�
	 */
	public abstract void sendLetter();

}
