package oop32;

/**
 * 实例内部类
 * 实例内部类中，可以直接访问外部类中的实例成员和静态成员
 */
public class OutClass {
    private static int i =100;

    private int j = 200;

    public static void m1(){
        System.out.println("外部类的静态方法执行了");
    }

    public void m2(){
        System.out.println("外部类的实例方法执行了");
    }

    public class InnerClass{
        public void m3(){
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();
        }
    }
}
