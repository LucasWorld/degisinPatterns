package com.lucas.designPatterns.facadePattern;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		LetterProcess letterProcess = new LetterProcessImpl();
		letterProcess.write("hello,I am Lucas");
		letterProcess.fillEnvonope("����");
		letterProcess.letterIntoEnvolope();
		letterProcess.sendLetter();*/
		
		//�޸�֮��Ĵ���
		ModenPostOffice modenPostOffice = new ModenPostOffice();
		modenPostOffice.sendLetter("Hello,I am Lucas", "����");
	}

}
