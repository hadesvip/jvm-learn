package com.kevin.gitchat.jvm.parameter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.Callable;

/**
 * jvm参数
 * <p>
 * -Xmx 最大可用堆空间
 * Java堆分为新生代和老年代
 * -新生代
 * -eden
 * -s0  from
 * -s1  to
 * s0,s1区域大小相等
 * -老年代
 *
 * -Xss 指定最大栈空间
 *
 *
 *
 * @author wangyong
 */
public class SampleArgs {

    public static void main(String[] args) {
        System.out.println("==================");
        Arrays.asList(args).forEach(System.out::println);



        






    }



}
