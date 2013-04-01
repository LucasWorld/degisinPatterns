package com.lucas.designPatterns.proxyPatterns;


public class XiMenQing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ��Ĭ�ϴ�����
		WangPo wangPo = new WangPo();
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		//������������
		JiaShi jiashi = new JiaShi();
		WangPo wangPoByJiaShi = new WangPo(jiashi);
		wangPoByJiaShi.makeEyesWithMan();
		wangPoByJiaShi.happyWithMan();		
	}

}
