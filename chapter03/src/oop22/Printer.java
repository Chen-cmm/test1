package oop22;

public class Printer {

    /*
    当电脑还要连接打印机的时候，Computer类中的代码就需要改变
    不符合OCP的原则
     */
    public void read(){
        System.out.println("打印机开始读数据");
    }

    public void write(){
        System.out.println("打印机开始写数据");
    }
}
