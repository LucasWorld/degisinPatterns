package com.lucas.designPatterns.facadePattern;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		LetterProcess letterProcess = new LetterProcessImpl();
		letterProcess.write("hello,I am Lucas");
		letterProcess.fillEnvonope("北京");
		letterProcess.letterIntoEnvolope();
		letterProcess.sendLetter();*/
		
		//修改之后的代码
		ModenPostOffice modenPostOffice = new ModenPostOffice();
		modenPostOffice.sendLetter("Hello,I am Lucas", "北京");
	}

}
