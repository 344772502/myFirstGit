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
	
	public static <T extends ICodeEnum> List<T> enumOf(Class<T> enumClass) {
      List<T> list = new ArrayList<T>();
      for (T e : enumClass.getEnumConstants()) {
             list.add(e);
      }
      if (list.size()==0) {
          System.out.println("�޸���ö��:"+enumClass);
      }
      return list;
  }
}
