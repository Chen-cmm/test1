package oop22;

/**
 * 这个程序没有使用接口
 */
public class Test {

    public static void main(String[] args) {
        Computer com = new Computer();
        HardDrive hd = new HardDrive();
        com.conn(hd);
    }
}
