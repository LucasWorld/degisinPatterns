package com.lucas.designPatterns.proxyPatterns;


public class XiMenQing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//有一个默认代理人
		WangPo wangPo = new WangPo();
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		//更换被代理人
		JiaShi jiashi = new JiaShi();
		WangPo wangPoByJiaShi = new WangPo(jiashi);
		wangPoByJiaShi.makeEyesWithMan();
		wangPoByJiaShi.happyWithMan();		
	}

}
