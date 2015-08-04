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
			System.out.println("ö������ ID�޸���ö��ֵ:" + id);
		}
		return result;
	}

	/**
	 * ����ö�����ͺͱ��룬ȡ�ö�Ӧ��ö��
	 * 
	 * @param enumClass
	 *            ö������
	 * @param code
	 *            ����
	 * @return ö��
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
			System.out.println("�޸���ö��:" + name);
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
          System.out.println("�޸���ö��:"+enumClass);
      }
      return jsonArr;
  }
}
