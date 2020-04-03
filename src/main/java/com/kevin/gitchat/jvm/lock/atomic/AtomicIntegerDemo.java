package com.kevin.gitchat.jvm.lock.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * cas操作：
 * AtomicInteger：单元素操作
 *
 * cas不足点：
 * 1.ABA问题  ->StampedLock(aqs)
 * 2.自旋 ->JVM支持处理器提供的pause指令;pause指令能让自旋失败时cpu睡眠一小段时间再继续自旋，
 *          从而使得读操作的频率低很多,为解决内存顺序冲突而导致的CPU流水线重排的代价也会小很多。
 *
 *
 * @author wangyong
 */
public class AtomicIntegerDemo {


    /**
     *
     *
     *  static {
     *         try {
     *             //相对偏移量
     *             valueOffset = unsafe.objectFieldOffset
     *                 (AtomicInteger.class.getDeclaredField("value"));
     *         } catch (Exception ex) { throw new Error(ex); }
     *     }
     *
     *
     *  //var1 ->this即AtomicInteger
     *  //var2 ->value的偏移量
     *  //var5 + var4 需要设置的新值
     *
     *  public final int getAndAddInt(Object var1, long var2, int var4) {
     *         int var5;
     *         do {
     *             var5 = this.getIntVolatile(var1, var2);//获取需要操作的值v
     *         }
     *
     *         //比较比较值A和设置的新值B
     *         //某一时刻只有一个线程对资源修改成功，其他线程不停重试；
     *         while(
     *           !this.compareAndSwapInt(var1, var2, var5, var5 + var4)
     *         );
     *
     *         return var5;
     *     }
     *
     * 如果有一家蛋糕店，为了挽留客户，绝对为贵宾卡里余额小于20元的客户一次性赠送20元，刺激消费者充值和消费。
     * 但条件是，每一位客户只能被赠送一次。
     * 此时，如果很不幸的，用户正好正在进行消费，就在赠予金额到账的同时，他进行了一次消费，使得总金额又小于20元，
     * 并且正好累计消费了20元。使得消费、赠予后的金额等于消费前、赠予前的金额。
     * 这时，后台的赠予进程就会误以为这个账户还没有赠予，所以，存在被多次赠予的可能
     *
     * 需要进行比较的值V=5块
     *
     * A线程判断<20进行进行操作加+20
     * B线程进行操作-20
     *
     *
     *
     *
     */
    AtomicInteger atomicInteger = new AtomicInteger(0);




}
