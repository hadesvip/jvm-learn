package com.kevin.gitchat.jvm.lock;

/**
 * jvm锁相关
 *
 * @author wangyong
 */
public class LockCodeBlockDemo {

    private Object object = new Object();

    /**
     *
     * public void myMethod();
     *     Code:
     *        0: aload_0
     *        1: getfield      #3                  // Field object:Ljava/lang/Object;
     *        4: dup
     *        5: astore_1
     *        //加锁
     *        6: monitorenter
     *        7: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *       10: ldc           #5                  // String hello,world
     *       12: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *       15: aload_1
     *
     *       //释放锁
     *       16: monitorexit
     *       17: goto          25
     *       20: astore_2
     *       21: aload_1
     *
     *       //考虑了异常情况，不管程序正常退出还是异常退出，都会把线程持有的monitor对象释放掉
     *       22: monitorexit
     *       23: aload_2
     *       24: athrow
     *       25: return
     *
     * 总结：
     * 当我们使用synchronized修饰代码块的时候，从字节码层面上是通过monitorenter和monitorexit指令来实现同步的。
     * 当进入到monitorenter指令后，线程将会持有monitor对象，当退出monitorexit后，线程将会释放到monitor对象。
     * 在线程整个执行中，它会始终持有该monitor对象，这样确保了共享资源的同步访问。
     *
     * Monitor对象是什么？
     * 当我们使用new关键字创建一个java对象，底层jvm就会自动给该对象创建一个object header,并且该object header附加到该对象上；
     * 本质上，Java中的每个对象创建后，都会持有一个与之关联的monitor对象，这也就是为什么我们在使用synchronize关键字修饰同步代码块时，
     * 我们使用什么对象(Object，Date，String...)都可以的原因。
     * object header里面包含了很对信息，如monitor信息，锁相关的信息等。
     *
     *
     */
    public void myMethod() {
        synchronized (object) {
            System.out.println("hello,world");
        }
    }

    public static void main(String[] args) {

    }
}
