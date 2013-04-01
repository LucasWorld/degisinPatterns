package com.lucas.designPatterns.strategyPattern;


public class Context {

	/** 
	 * ²ßÂÔ¶ÔÏó
	 * @uml.property name="strategy"
	 * @uml.associationEnd inverse="context:com.lucas.designPatterns.strategyPattern.IStrategy"
	 */
	private IStrategy strategy;

	/** 
	 * Getter of the property <tt>strategy</tt>
	 * @return  Returns the strategy.
	 * @uml.property  name="strategy"
	 */
	public IStrategy getStrategy() {
		return strategy;
	}

	/** 
	 * Setter of the property <tt>strategy</tt>
	 * @param strategy  The strategy to set.
	 * @uml.property  name="strategy"
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void operate(){
		this.strategy.operate();
	}
}
