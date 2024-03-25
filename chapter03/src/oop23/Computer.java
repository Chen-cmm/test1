package oop23;

public class Computer {
    //这里使用了多态，将computer类与其他具体的设备类进行解耦合
    public void conn(equipment e){
        System.out.println("设备连接成功");
        e.read();
        e.write();
    }
}
