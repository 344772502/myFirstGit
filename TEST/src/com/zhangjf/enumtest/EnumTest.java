package com.zhangjf.enumtest;

import net.sf.json.JSONArray;

public class EnumTest {
	public static void main(String[] args) {
		String name = EnumUtil.enumOf(SexType.class, 0).getName();
		int id = EnumUtil.enumOf(SexType.class, "ƒ–").getId();
		System.out.println("name:"+name);
		System.out.println("id :"+id);
		
		String name1 = EnumUtil.enumOf(UserType.class, -2).getName();
        int id1 = EnumUtil.enumOf(UserType.class, "π‹¿Ì‘±").getId();
        System.out.println("name1:"+name1);
        System.out.println("id1:"+id1);
       
        JSONArray jsonArr = EnumUtil.enumOf(UserType.class);
        System.out.println(jsonArr);
	}
}
