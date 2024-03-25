package oop26;

/**
 * Object类中的toString方法
 * 1.Object类设计toString()方法的目的是什么
 *      这个方法的作用是：将Java对象转换为字符串的表达形式
 *
 * 2.Object类中toString()方法的默认实现是怎样的
 */
public class DataTest {
    public static void main(String[] args) {
        DataTest dataTest = new DataTest();
        String s = dataTest.toString();
        System.out.println(s);//toString将变量保存的值转换为字符串
        //oop26.DataTest@4554617c(相当于一个java对象的内存地址)

        Data d = new Data();
        String s1 = d.toString();
        System.out.println(s1);

        Data d1 = new Data(2024,3,1);
        String s2 = d1.toString();
        System.out.println(d1);
    }
}
