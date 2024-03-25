package oop22;

/**
 * 电脑类
 */
public class Computer {
    public void conn(HardDrive hardDrive){
        System.out.println("设备连接成功");
        hardDrive.read();
        hardDrive.write();
    }

    /*
    要连接新设备的时候，就需要修改这个conn方法或者重载这个方法，这就违背了OCP原则，扩展能力差
     */
}
