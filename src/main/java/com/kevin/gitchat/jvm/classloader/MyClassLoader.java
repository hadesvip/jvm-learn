package com.kevin.gitchat.jvm.classloader;

/**
 * 自定义类加载器
 *
 * @author wangyong
 */
public class MyClassLoader extends ClassLoader {




    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }




}
