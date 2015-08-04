package com.zhangjf.enumtest;

/**
 * @author zhangjf
 * �Ա�ö��
 * 2014-10-13
 */
public enum SexType implements ICodeEnum {
	
	FEMALE(0,"Ů"),MALE(1,"��");
	 
	private String name;
	private int id;

	private SexType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
