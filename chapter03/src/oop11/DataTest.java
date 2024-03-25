package oop11;

public class DataTest {
    public static void main(String[] args) {
        //创建默认日期对象
        Data1 d1 = new Data1();
        d1.display();

        Data1 d2 = new Data1(1233,12,3);
        d2.display();
    }
}
