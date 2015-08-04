package com.zhangjf.enumtest;

/**
 * @author zhangjf
 * 性别枚举
 * 2014-10-13
 */
public enum SexType implements ICodeEnum {
	
	FEMALE(0,"女"),MALE(1,"男");
	 
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
