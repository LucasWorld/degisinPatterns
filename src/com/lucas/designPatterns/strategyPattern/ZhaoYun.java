package com.lucas.designPatterns.strategyPattern;




public class ZhaoYun {
	
	public static void main(String[] args) {
		Context content;
		content = new Context(new BackDoor());
		content.operate();
		content = new Context(new GivenGreenLight());
		content.operate();
		content = new Context(new BlockEnemy());
		content.operate();
		
	}
}
