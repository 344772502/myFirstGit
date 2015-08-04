package com.zhangjf.enumtest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
	
	public static <T extends ICodeEnum> JSONArray enumOf(Class<T> enumClass) {
      JSONArray jsonArr = new JSONArray();
      for (T e : enumClass.getEnumConstants()) {
          JSONObject json = new JSONObject();
          json.put(e.getId(), e.getName());
          jsonArr.add(json);
      }
      if (jsonArr.size()==0) {
          System.out.println("无该类枚举:"+enumClass);
      }
      return jsonArr;
  }
}
