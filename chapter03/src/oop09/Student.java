package oop09;
/*
构造方法

1.构造方法的作用
    1.完成对象的创建
    2.完成对象的初始化
2.当类中没有写构造方法是，编译器会自动提供一个无参构造方法
  写了构造方法后，系统不再提供。所以建议把无参构造方法也写出来

3.构造方法中赋值了，为什么还需要setter来对实例变量进行赋值
    setter是为了对后期实例变量进行修改
4.构造方法执行原理
    1.构造方法执行包括两个阶段
        阶段1：对象的创建
        阶段2：对象的初始化
    2.对象在什么时候创建
        new的时候会直接在堆内存中开辟空间，然后给所有属性默认的初始值，完成对象的创建（这个过程是在构造方法体执行之前就完成了）
    3.对象初始化是在什么时候完成的
        构造方法开始执行，标志着开始进行对象的初始化。构造方法体执行完成，表示对象初始化完成
5.构造代码块
    {
        }
    每一次new的时候，都会先执一次构造代码块。并且构造代码块是在构造方法执行之前执行的（因为里面可以用this）
6.构造代码块有什么用
如果所有的构造方法在最开始的时候有相同的代码，可以将其提取到构造代码块中
 */

public class Student {
    /*
    学生姓名
     */
    private String name;
    /*
    学生年龄
     */
    private int age;
    /*
    学生性别
     */
    private boolean gender;
    /*
    学生地址
     */
    private String address;
    /*
    Student的构造方法
    构造方法不需要写返回语句 但是实际上构造方法会返回创建出的对象的地址
    第一个是无参构造方法，第二个是有参构造方法
     */

    /*
    构造代码块
     */
    {
        System.out.println("构造代码块执行");
    }
    public Student(){

    }
    public Student(String name,int age,boolean gender,String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGender() {
        if (this.gender){
            return "男";
        }
        else {
            return "女";
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
