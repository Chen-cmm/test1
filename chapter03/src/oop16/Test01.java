package oop16;

/**
 * 关于基本数据类型之间的转换
 *      第一种：小容量转换成大容量，叫做自动类型转换
 *      第二种：大容量转化成小容量，不能自动转换，必须添加强制类型转换符，叫做强制类型转换
 * 除了基本数据类型之间的类型转换之外，对于引用数据类型也可以进行类型转换，叫做向上转型和向下转型
 *
 * 关于java语言中的向上转型和向下转型
 *    向上转型  子----->父  可以基本等同于基本数据类型的自动类型转换
 *    向下转型  父----->子  可以基本等同于强制类型转换
 *
 * 多态再开发中的作用
 *  1.降低程序的耦合度，提高程序的扩展力
 *  2.尽量使用多态，面向抽象编程，不要面向具体编程
 */
public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        Dog D1 = new Dog();


        /*
        向上转型：
            子----->父
            也可以等同与自动类型转换
            父类型引用指向子类型对象。这个就是多态机制最核心的语法
         */
        Animal a2 = new Cat();
        /*
        java程序包括两个重要的阶段
            第一阶段：编译阶段
                在编译的时候，编译器只知道a2的类型是Animal类型
                因此在编译的时候会去Animal类中找move方法
                找到之后，绑定上去，此时发生静态绑定。绑定成功，表示编译通过
            第二阶段：运行阶段
                在运行的时候，堆内存中真实的java对象是Cat类
                所以在move()的行为一定是Cat对象发生的
                因此运行的时候会自动调用Cat对象的move()方法
                这种绑定称为运行期绑定/动态绑定

            因为编译阶段是一种形态，而运行的时候是另一种形态。因此叫做多态
         */
        a2.move();
        /*
            a2.catchMouse();编译不过，因为编译器只知道a2是个Animal类型
            而在Animal中没有找到这个方法，所以编译报错
         */

        /*
        向下转型：
            父------>子
            也可以等同于强转类型转换
         */
        /*加入现在就是要让a2去调用catchMouse方法,那就只能做向下转型
          当调用的方法是子类中特有的方法是，考虑使用向下转型
        */
        Cat c2 = (Cat) a2;
        c2.catchMouse();

        Animal x = new Cat();
        //下面这一句编译可以过，因为x是Animal类型，Animal和Dog类有继承关系，语法没问题
        //但是在运行期间会报错ClassCastException(类型转换异常)，因为在运行过程中堆中的真实对象是Cat类型，Cat类型无法转换为Dog类型，所以出现类型转换异常
        //instanceof运算符的出现，可以解决ClassCastException异常
        /*
        instanceof运算符的语法规则
            1.instanceof运算发的结果一定是true/false
            2.语法格式：(引用 instanceof 类型)
                eg:（a instanceof Cat）
                    true表示a引用指向的对象是Cat类型
                    false表示a指向的对象不是Cat类型
         */
        //做向下转型之前，为了避免ClassCastException的发生，一般使用instanceof进行判断
        if (x instanceof Dog){
            Dog y = (Dog) x;
            System.out.println("!!!!!!!!!!!!");
        }

    }
}
