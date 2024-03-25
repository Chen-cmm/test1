package oop23;

public class Printer implements equipment{
    @Override
    public void read() {
        System.out.println("打印机开始读数据");
    }

    @Override
    public void write() {
        System.out.println("打印机开始写数据");
    }
}
