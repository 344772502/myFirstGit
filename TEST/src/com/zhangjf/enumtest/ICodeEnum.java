package com.zhangjf.enumtest;

public interface ICodeEnum {

	/**
	 * 表码ID,通常填入 关联的表的 表码字段
	 * 
	 * @return
	 */
	public int getId();

	/**
	 * 表码名称, 用于在页面上将ID转换成名称显示
	 * 
	 * @return
	 */
	public String getName();


}
