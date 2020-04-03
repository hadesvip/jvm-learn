package com.kevin.gitchat.jvm.lock;

/**
 * lockMethod
 *
 * @author wangyong
 */
public class LockMethodDemo {


    /**
     *
     *  public synchronized void myMethod();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC, ACC_SYNCHRONIZED
     *     Code:
     *       stack=2, locals=1, args_size=1
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc           #3                  // String hello,world
     *          5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *          8: return
     *       LineNumberTable:
     *         line 11: 0
     *         line 12: 8
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       9     0  this   Lcom/kevin/gitchat/jvm/lock/LockMethodDemo;
     *
     *
     * 对于同步方法而言，字节码中并没有出现monitorenter和monitorexit相关指定，ACC_SYNCHRONIZED。
     * 本质上，JVM使用ACC_SYNCHRONIZED访问标记来判断某个方法是否是一个同步方法。
     * 当方法调用时，调用指令先判断该方法是否存在ACC_SYNCHRONIZED访问标记。如果发现了该标记，那么执行线程将会首先持有monitor对象，接下来再去
     * 执行方法。当线程执行完方法后，将会释放所持有的monitor对象。在该线程执行方法期间，其他线程将无法获取到该monitor对象。
     *
     * 线程持有的monitor对象是什么？
     * 1.如果被synchronized修饰的方法是普通的实例方法，那么该Monitor对象就是被调用方法所在的对象。
     * 2.如果synchronized修饰的方法是静态方法，那么该Monitor对象就是当前类对应的的Class对象。
     *
     */
    public synchronized void myMethod() {
        System.out.println("hello,world");
    }

}
