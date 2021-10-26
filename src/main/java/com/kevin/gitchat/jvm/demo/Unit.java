package com.kevin.gitchat.jvm.demo;

import java.util.UUID;

/**
 * 单元类
 */
public class Unit {

  /**
   * 单元ID
   */
  private String id = UUID.randomUUID().toString().replace("-", "");

  /**
   * 单元名称
   */
  private String name;

  /**
   * 血量
   */
  private int blood = 100;


  /**
   * 是否存活
   */
  private int alive = 0;


  public int getBlood() {
    return blood;
  }

  public void setBlood(int blood) {
    this.blood = blood;
  }

  public int getAlive() {
    return alive;
  }

  public void setAlive(int alive) {
    this.alive = alive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    return "Unit{" + "id=" + id
        + ", name='" + name + '\''
        + ", blood=" + blood
        + ", alive=" + alive
        + '}';
  }
}
