package com.lucas.designPatterns.singletonPatterns;


public class Minister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emperor emperor1 =  Emperor.getInstance();
		Emperor emperor2 =  Emperor.getInstance();
		Emperor emperor3 =  Emperor.getInstance();
		
		System.out.println(emperor1);
		System.out.println(emperor2);
		System.out.println(emperor3);
		
		EmperorNext emperor4 =  EmperorNext.getInstence();
		EmperorNext emperor5 =  EmperorNext.getInstence();
		EmperorNext emperor6 =  EmperorNext.getInstence();
		
		System.out.println(emperor4);
		System.out.println(emperor5);
		System.out.println(emperor6);
	}
}
