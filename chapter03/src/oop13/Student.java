package oop13;
/*
饿汉式单例模式
1. 单例模式怎么实现？
    1.构造方法私有化
    2.对外提供一个公开的静态方法,用这个方法获取单个的实例
    3.定义一个静态变量，在类加载的时候初始化静态变量（只初始化一次）
饿汉式单例模式在类加载时就将对象创建好了，不管对象是用还是不用
 */
public class Student {
    //这是个静态变量，只在类加载的时候初始化一次，所以可以保证这个类只能new出一个对象
    private static Student s = new Student();
    private Student(){

    }

    public static Student getStudent()
    {
        return s;
    }
}
