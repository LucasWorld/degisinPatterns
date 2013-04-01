package com.lucas.designPatterns.facadePattern;


public class LetterProcessImpl implements LetterProcess {

	@Override
	public void write(String content) {
		// TODO Auto-generated method stub
		System.out.println("写信的内容是："+content);

	}

	@Override
	public void fillEnvonope(String address) {
		// TODO Auto-generated method stub
		System.out.println("将信寄到："+address);
	}

	@Override
	public void letterIntoEnvolope() {
		// TODO Auto-generated method stub
		System.out.println("把信放入到信封");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("将信寄出");
	}


}
