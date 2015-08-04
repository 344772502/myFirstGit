package com.zhangjf.enumtest;

import java.util.ArrayList;
import java.util.List;

public class EnumUtil {
	
	public static <T extends ICodeEnum> T enumOf(Class<T> enumClass, int id) {
		T result = null;
		for (T e : enumClass.getEnumConstants()) {
			if (e.getId() == id) {
				result = e;
				break;
			}
		}
		if (result == null) {
			System.out.println("枚举类型 ID无该类枚举值:" + id);
		}
		return result;
	}

	/**
	 * 根据枚举类型和编码，取得对应的枚举
	 * 
	 * @param enumClass
	 *            枚举类型
	 * @param code
	 *            编码
	 * @return 枚举
	 */
	public static <T extends ICodeEnum> T enumOf(Class<T> enumClass, String name) {
		if (name==null||name.trim().equals("")) {
			return null;
		}
		T result = null;
		for (T e : enumClass.getEnumConstants()) {
			if (e.getName().equals(name)) {
				result = e;
				break;
			}
		}
		if (result == null) {
			System.out.println("无该类枚举:" + name);
		}
		return result;
	}
	
	public static <T extends ICodeEnum> List<T> enumOf(Class<T> enumClass) {
      List<T> list = new ArrayList<T>();
      for (T e : enumClass.getEnumConstants()) {
             list.add(e);
      }
      if (list.size()==0) {
          System.out.println("无该类枚举:"+enumClass);
      }
      return list;
  }
}
