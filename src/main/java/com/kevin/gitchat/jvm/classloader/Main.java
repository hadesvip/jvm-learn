package com.kevin.gitchat.jvm.classloader;

/**
 * classLoader
 *
 * @author wangyong
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());

        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(User.class.getClassLoader());
        System.out.println(MyClassLoader.class.getClassLoader().getClass().getName());

    }
}
