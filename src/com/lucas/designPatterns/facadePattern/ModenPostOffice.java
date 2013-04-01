package com.lucas.designPatterns.facadePattern;

public class ModenPostOffice {

	/**
	 * @uml.property name="letterProcess"
	 * @uml.associationEnd inverse=
	 *                     "modenPostOffice:com.lucas.designPatterns.facadePattern.LetterProcess"
	 */
	private LetterProcess letterProcess = new LetterProcessImpl();
	/**
	 * @uml.property name="police"
	 * @uml.associationEnd 
	 *                     inverse="modenPostOffice1:com.lucas.designPatterns.facadePattern.Police"
	 */
	private Police police = new Police();

	/**
	 * ÓÊ¾Ö¼ÄÐÅ
	 */
	public void sendLetter(String content, String address) {
		letterProcess.write(content);
		letterProcess.fillEnvonope(address);
		letterProcess.letterIntoEnvolope();
		letterProcess.sendLetter();
	}

	/**
	 * Getter of the property <tt>letterProcess</tt>
	 * 
	 * @return Returns the letterProcess.
	 * @uml.property name="letterProcess"
	 */
	public LetterProcess getLetterProcess() {
		return letterProcess;
	}

	/**
	 * Setter of the property <tt>letterProcess</tt>
	 * 
	 * @param letterProcess
	 *            The letterProcess to set.
	 * @uml.property name="letterProcess"
	 */
	public void setLetterProcess(LetterProcess letterProcess) {
		this.letterProcess = letterProcess;
	}

	/**
	 * Getter of the property <tt>police</tt>
	 * 
	 * @return Returns the police.
	 * @uml.property name="police"
	 */
	public Police getPolice() {
		return police;
	}

	/**
	 * Setter of the property <tt>police</tt>
	 * 
	 * @param police
	 *            The police to set.
	 * @uml.property name="police"
	 */
	public void setPolice(Police police) {
		this.police = police;
	}

}
