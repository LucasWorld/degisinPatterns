package com.lucas.designPatterns.facadePattern;


public class LetterProcessImpl implements LetterProcess {

	@Override
	public void write(String content) {
		// TODO Auto-generated method stub
		System.out.println("д�ŵ������ǣ�"+content);

	}

	@Override
	public void fillEnvonope(String address) {
		// TODO Auto-generated method stub
		System.out.println("���żĵ���"+address);
	}

	@Override
	public void letterIntoEnvolope() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ��뵽�ŷ�");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("���żĳ�");
	}


}
