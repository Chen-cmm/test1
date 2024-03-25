package oop31;

/**
 * 静态内部类：可以把静态内部类当作静态变量来看
 * 在静态内部类中，无法直接访问外部类中的实例相关的数据
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


    //静态内部类:对静态内部类来说，访问控制权限修饰符四种都能用，静态内部类一般定义为private
    //一般类只有缺省和public
    private static class InnerClass{
        public void m3(){
            //静态的都可以访问，实例的不能访问，因为这是一个静态内部类
            System.out.println(i);
            //System.out.println(j);
            m1();
            //m2();
        }
    }
}
