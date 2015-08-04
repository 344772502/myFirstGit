package com.zhangjf.enumtest;

public enum UserType implements ICodeEnum{

  ADMIN(-1,"管理员"),SUPER_ADMIN(-2,"超级管理员"),NORMAL(0,"普通用户");
  
  private String name;
  private int id;
  
  private UserType(int id,String name){
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  
}
