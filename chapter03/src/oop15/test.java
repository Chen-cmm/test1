package oop15;

/**
一个类没有继承任何类，默认继承object类
object类是JDK类库中的根类
 */
public class test {
    public static void main(String[] args) {
        b b1 = new b();
        b1.eat();

    }
}
class a{
    public a(){
        System.out.println("1111111");
    }

    public void eat(){
        System.out.println("a正在吃");
    }
}

class b extends a{
    public b(){
        System.out.println("2222222");
    }
    //Override注解可以在编译阶段检查有没有发生方法重写
    //标注的方法必须是重写的方法，不然会报错
    //如果父类的返回值是引用数据类型，那么重写的方法的返回值可以是其子类
    //访问权限不能变低只能变高
    //抛出异常不能变多，可以变少
    //方法覆盖针对的是实例方法和静态方法无关
    //方法覆盖针对的是实例方法，和实例变量没有关系
    @Override
    public void eat(){
        System.out.println("b正在吃");
    }
}