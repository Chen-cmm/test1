package oop34;

import java.sql.SQLOutput;

/**
 * 匿名内部类：没有名字的类，只能使用一次
 * 不把匿名内部类当作一个类，只把匿名内部类当作一个继承了某个父类或实现了某个方法的对象
 * 该对象重写了父类或接口中的一些方法。调用这些方法的时候就是去调用匿名内部类定义时写的‘
 * 方法
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        //c.conn(new Printer());
        //匿名内部类:不需要定义一个类防止类爆炸
        //这里即完成了匿名内部类的定义，同时又实例化了一个匿名内部类的对象
        //某个类只使用一次的时候才定义为匿名内部类
        //一下conm方法参数上的代码做了两件事
        //第一：完成了匿名内部类的定义
        //第二：同时实例化了一个匿名内部类的对象
        c.conn(new Usb() {
            //接口的实现
            //也可以是继承一个类，重写父类中的方法
            //一个没有名字的类实现了usb接口，效果就相当于写了一个实现usb接口的类，并且new了一个该类的对象进行了传参
            @Override
            public void read() {
                System.out.println("read");
            }

            @Override
            public void write() {
                System.out.println("write");
            }
        });
    }
}

class Computer{
    public void conn(Usb usb){
        usb.read();
        usb.write();
    }
}

interface Usb{
    void read();
    void write();
}

/*
class Printer implements Usb{

    @Override
    public void read() {
        System.out.println("打印机read");
    }

    @Override
    public void write() {
        System.out.println("打印机write");
    }
}*/
