package oop23;

public class HardDrive implements equipment{
    @Override
    public void read() {
        System.out.println("硬盘开始读数据");
    }

    @Override
    public void write() {
        System.out.println("硬盘开始写数据");
    }
}
