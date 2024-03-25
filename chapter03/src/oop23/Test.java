package oop23;

import oop09.ConstructorTest01;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        HardDrive hd = new HardDrive();
        c.conn(hd);

        Printer pt = new Printer();
        c.conn(pt);
    }
}
