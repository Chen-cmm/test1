package oop12;
/*
被static修饰的在访问的时候，直接采用类名.，不需要new对象

1.什么情况下把成员变量定义为静态成员变量？
  当一个属性是对象级别的，这个属性通常别定义为实例变量
2.静态变量什么时候初始化（开辟空间）？静态变量存储在哪里？
  静态变量在类加载的时候就初始化，不需要等new对象
  JDK8以后静态变量存储在堆内存空间中
3.静态方法中不能使用this关键字，也不能调用实例方法
  因为this关键字表示当前对象

一个空引用访问实例相关的（包括实例方法和变量），会空指针异常

 */
public class Chinese {
    String idCard;
    String name;
    static String country ="中国";//每个中国人的国籍相同，使用static方法修饰。不是静态的话，每个对象都会生成一个，浪费堆内存

    /*
    静态代码块
    静态代码块在类加载时候执行，并且只执行一次
    静态代码块可以写多个，遵循自上而下的顺序执行
    静态代码块中写类加载时刻需要执行的操作：比如在类加载时刻记录日志，就需要写在这里
     */
    static {
        //静态上下问中无法方法实例相关的数据，这里只能访问静态的
        System.out.println("静态代码块1执行了");
    }
    static {
        System.out.println("静态代码块2执行了");
    }
    static {
        System.out.println("静态代码块3执行了");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行了");
    }
}
