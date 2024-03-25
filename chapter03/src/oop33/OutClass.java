package oop33;

/**
 * 局部内部类：等同于局部变量
 * 局部内部类能不能访问外部类的数据，取决于它在什么方法中（静态还是实例）
 * 局部内部类在访问类外的局部变量时，局部变量是由final修饰的，即不能更改
 * 只不过从JDK8之后final由系统自动提供
 *
 */
public class OutClass {
        private static int j=1;
        private int d =2;
        public void m1(){
            int i =1;//省略了个final，自动加上了
            //局部内部类，定义在方法体中的
            //局部变量不能使用访问控制权限修饰符修饰
            //局部内部类在访问类外的局部变量时，局部变量是由final修饰的，即不能更改
            class InnerClass{
                public void x(){
                    System.out.println(j);
                    System.out.println(d);
                    System.out.println(i);
                }
            }
        }

}
