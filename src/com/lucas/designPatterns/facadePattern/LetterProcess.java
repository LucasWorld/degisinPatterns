package com.lucas.designPatterns.facadePattern;

public interface LetterProcess {

	/**
	 * 写信
	 */
	public abstract void write(String content);

	/**
	 * 填写信封内容
	 */
	public abstract void fillEnvonope(String address);

	/**
	 * 把信放入信封
	 */
	public abstract void letterIntoEnvolope();

	/**
	 * 将信寄出
	 */
	public abstract void sendLetter();

}
