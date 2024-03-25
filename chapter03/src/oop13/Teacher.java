package oop13;
/*
懒汉式单例模式
步骤：
    1.构造方法私有化
    2.对外提供一个静态方法，通过这个方法得到一个对象
    3.提供一个静态变量，而这个变量不进行初始化
懒汉式单例模式只有在调get方法的时候才会去创建对象
 */
public class Teacher {

    private static Teacher t;
    private Teacher(){

    }
    public static Teacher getTeacher(){
        if (t==null){
            t = new Teacher();
        }
        return t;
    }

}
