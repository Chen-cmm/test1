package oop19;

/**
 * super代表的是当前对象中的父类特诊，super可以看作是当前对象的一部分
 * 因为super和当前对象有关，所以super也无法使用在静态方法中
 *
 * super.大部分情况都是可以省略的，但是当父类和子类中定义了相同的实例变量或
 * 相同的实例方法时，如果需要在子类中访问父类的属性或方法时，super.不能省略
 *
 * super本身并不是一个引用，super知识代表了当前对象的父类型特征
 * super不能够单独的输出。
 * super代表父类、超类等所有的特征
 */
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三",24,"qq",290000);
        t.doSome();


    }
}
