package com.kevin.gitchat.jvm.demo;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 实现一个简单的游戏战斗逻辑
 * 要求:
 * 1，一个场景类，一个单元类
 * 2，生成x个场景，每个场景中生成y个单元。
 * 3，每个单元有100点生命值。生命值小于1时则死亡。
 * 4，每个回合每单元对随机一个活着的其他单元造成10～15点伤害。直到没有其他活着的单元。战斗结束。
 * 5，多线程完成。性能优先。打印输出战斗过程。
 *
 */
public class Console {

  public static void main(String[] args) {
    Scene scene = new Scene();
    List<Scene> sceneList = scene.buildSeneList(10, 20);
    sceneList.forEach(System.out::println);

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    HashMap


  }




}
