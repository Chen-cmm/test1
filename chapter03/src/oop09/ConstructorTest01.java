package oop09;

public class ConstructorTest01 {
    public static void main(String[] args) {
        //调用Student的构造方法来实现Student类型对象的创建
        Student s1 = new Student("张三",18,true,"翻斗花园");
        System.out.println("s1的姓名是：" + s1.getName());
        System.out.println("s1的年龄是：" + s1.getAge());
        System.out.println("s1的性别是：" + s1.isGender());
        System.out.println("s1的住址是：" + s1.getAddress());


        Student s2 = new Student("李四",19,false,"翻斗花园");
        System.out.println("s2的姓名是：" + s2.getName());
        System.out.println("s2的年龄是：" + s2.getAge());
        System.out.println("s2的性别是：" + s2.isGender());
        System.out.println("s2的住址是：" + s2.getAddress());


        Student s3 = new Student();
        System.out.println("s3的姓名是：" + s3.getName());
        System.out.println("s3的年龄是：" + s3.getAge());
        System.out.println("s3的性别是：" + s3.isGender());
        System.out.println("s3的住址是：" + s3.getAddress());
    }
}
