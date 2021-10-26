package com.kevin.gitchat.jvm;

/**
 * VM启动参数:
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:MaxMetaspaceSize=30m -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:-UseCompressedOops -XX:+PrintGCDetails
 *  年轻代空间(10m):Eden 8m from survivor 1m to survivor 1m  堆空间20m
 * @author wangyong
 */
public class JVMObjectRunner {

  public static void main(String[] args) throws InterruptedException {
    //1m
    int size = 1024 * 1024;
    byte[] byteArray1 = new byte[4 * size];
    System.out.println("此时Eden区域大小:4M");
    for (int i = 0; i <=16; i++) {
      System.gc();
    }
    System.out.println("此时老年代空间:4M");
    byte[] byteArray2 = new byte[4 * size];
//    System.out.println("此时Eden区域大小还是:4M，老年代:4M");
//    byte[] byteArray3 = new byte[4 * size];
//    System.out.println("此时Eden区域大小还是:4M,老年代:8M");
//    byte[] byteArray4 = new byte[3 * size];
//    System.out.println("此时Eden区域大小还是:7M");
  }


}
