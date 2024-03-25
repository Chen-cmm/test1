package oop29;

/**
 * 关于Object中的clone方法
 *     protected native Object clone() throws CloneNotSupportedException;
 *     受保护的方法，专门给子类使用的
 *     本地方法，底层调用C++程序已经可以完成对象的创建了
 *     现在要处理的是怎么去调用这个方法：方法就是在Object的子类中重写clone
 * 1.clone方法作用：对象拷贝，通常在开发中需要保护对象数据结构，通常复制一份，生成一个新的对象，对新对象进行操作
 *
 * 2.解决clone方法的调用问题，就是在子类中重写，并且为了保证在任意地方都可以调用，所以用public修饰
 *
 * 3.凡是参加clone的对象，必须实现一个标志接口（空接口）cloneable
 *      java中的接口分为两种
 *      一种是标志接口
 *      一种是普通接口
 *
 */
public class UserTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(20);
        System.out.println(u1);
        //报错原因，因为Object中的clone()方法是protected修饰的
        //protected修饰的方法只能在：本类，同包，子类中调用
        //但是下面这行不满足条件,在子类中重写clone方法之后就满足了
        //下面这种方式是一种浅克隆的方式
        User object = (User) u1.clone();//clone返回的是一个Object对象，可以对其向下转型，从而操作子类中的特有属性
        System.out.println(object);
        object.setAge(100);

        System.out.println("原始对象的年龄"+u1);
        System.out.println("新对象的年龄"+object);



    }
}
