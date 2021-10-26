package com.kevin.gitchat.jvm.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.LongStream;

/**
 * 场景
 *
 * @author wangyong
 */
public class Scene {

  /**
   * 场景ID
   */
  private String id = UUID.randomUUID().toString().replace("-", "");

  /**
   * 场景名称
   */
  private String name;

  /**
   * 存活的单元列表
   */
  private List<Unit> aliveUnitList;

  /**
   * 死亡的单元列表
   */
  private List<Unit> deadUnitList;

  public List<Unit> getAliveUnitList() {
    return aliveUnitList;
  }

  public void setAliveUnitList(List<Unit> aliveUnitList) {
    this.aliveUnitList = aliveUnitList;
  }

  public List<Unit> getDeadUnitList() {
    return deadUnitList;
  }

  public void setDeadUnitList(List<Unit> deadUnitList) {
    this.deadUnitList = deadUnitList;
  }

  /**
   * 构建场景
   *
   * @param x 场景数量
   * @param y 单元数量
   */
  public List<Scene> buildSeneList(int x, int y) {
    List<Scene> sceneList = new ArrayList<>(x);
    LongStream.range(0, x).forEach(sceneNum -> {
      Scene scene = new Scene();
      List<Unit> aliveUnitList = new ArrayList<>(y);
      LongStream.range(0, x).forEach(unitNum -> aliveUnitList.add(new Unit()));
      scene.setAliveUnitList(aliveUnitList);
      sceneList.add(scene);
    });
    return sceneList;
  }


  @Override
  public String toString() {
    return "Scene{" + "id='" + id + '\''
        + ", name='" + name + '\''
        + ", aliveUnitList=" + aliveUnitList
        + ", deadUnitList=" + deadUnitList
        + '}';
  }
}
