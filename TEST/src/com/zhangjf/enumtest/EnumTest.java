package com.zhangjf.enumtest;

import java.util.List;

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
        
        List<UserType> list = EnumUtil.enumOf(UserType.class);
        for (int i = 0; i < list.size(); i++) {
          System.out.println(list.get(i).getId()+":"+list.get(i).getName());
        }
	}
}
