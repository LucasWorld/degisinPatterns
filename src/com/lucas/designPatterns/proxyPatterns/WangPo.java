package com.lucas.designPatterns.proxyPatterns;


public class WangPo implements Women {
	/** 
	 * @uml.property name="women"
	 * @uml.associationEnd inverse="wangPo:com.lucas.designPatterns.proxyPatterns.Women"
	 */
	private Women women;

	/** 
	 * Getter of the property <tt>women</tt>
	 * @return  Returns the women.
	 * @uml.property  name="women"
	 */
	public Women getWomen() {
		return women;
	}

	/** 
	 * Setter of the property <tt>women</tt>
	 * @param women  The women to set.
	 * @uml.property  name="women"
	 */
	public void setWomen(Women women) {
		this.women = women;
	}
	
	@Override
	public void makeEyesWithMan() {
		// TODO Auto-generated method stub
		this.women.makeEyesWithMan();
	}

	@Override
	public void happyWithMan() {
		// TODO Auto-generated method stub
		this.women.happyWithMan();
	}





	
	public WangPo() {
		super();
		this.women = new PanJinLian();
	}

	public WangPo(Women women) {
		super();
		this.women = women;
	}

}
