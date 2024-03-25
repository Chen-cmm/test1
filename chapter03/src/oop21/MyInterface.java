package oop21;

/**
 * 1.接口再Java中表示一种规范或七月，它定义了一组抽象方法和常量，
 * 用来描述一些实现这个接口的类应该具有哪些行为和属性。接口和类一样，也是一种引用数据类型
 *
 * 2.抽象类是半抽象的，接口是完全抽象的，接口没有构造方法，也无法实例化
 *
 * 3.(JDK8之前的规则)接口中只能定义：常量+抽象方法。接口中的常量的static final可以省略
 *   接口中的抽象方法的abstract可以省略，接口中所有的方法和变量都是public修饰的
 *
 * 4.接口支持多继承
 *
 * 5.一个非抽象类实现接口必须将接口中的所有的抽象方法都实现
 *
 * 6.一个类可以实现多个接口。语法是：class implement 接口A，接口B{}
 *
 * 7.Java8之后，接口中允许出现默认方法和静态方法
 *      默认方法:引入默认方法是为了解决接口演变问题：接口可以定义抽象方法
 *              但是不饿能实现这些方法。所有实现接口都必须实现这些抽象方法
 *              这回导致接口升级的问题：当我们向接口中添加或删除一个抽象方
 *              法时，这回破坏改接口的所有实现，并且所有该接口的用户都必须
 *              有修改其代码才能适应更改。这就是所有的接口演变问题
 *      静态方法：接口中的静态方法只能通过“该接口名”去调用，实现该接口的类名
 *              无法调用
 *
 * 8.JDK9之后允许接口中定义私有的实例方法和私有的静态方法（与3中不同）
 *   私有的静态方法是给公有的静态方法调用的，因为可能需要把一个共有的静
 *   态方法拆解为多个方法，又不希望实现该接口的类能调用，所以定义为私有的
 *   而私有的实例方法与私有的静态方法相同，不过是给默认方法使用的
 *
 * 9.所有接口都隐式继承Object类
 */
public interface MyInterface {
    public static final int num1=1;
    int num2 = 2;

    public abstract void m1();

    void m2();

    //默认方法
    default void defaultMethod(){
        System.out.println("接口中的默认方法执行了");
    }

    //静态方法
    public static void staticMethod(){
        System.out.println("接口的静态方法执行了");
    }
}

class A implements MyInterface{

    @Override
    public void m1() {
        System.out.println("m1执行了");
    }

    @Override
    public void m2() {
        System.out.println("m2执行了");
    }

    public static void main(String[] args) {
        MyInterface mi =new A();
        mi.m1();
        mi.m2();
        mi.defaultMethod();
        MyInterface.staticMethod();
    }
}
