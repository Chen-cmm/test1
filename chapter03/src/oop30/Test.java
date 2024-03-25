package oop30;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address a = new Address("北京","海淀");
        User u = new oop30.User("张三",a);
        User uClone = (User)u.clone();

        System.out.println(u);
        System.out.println(uClone);

        /*uClone.getAddr().setCity("天津");
        System.out.println("_____________________________");
        System.out.println(u);
        System.out.println(uClone);
        使用浅拷贝，浅拷贝只拷贝一层，对于对象中的其他引用变量的内存也是直接复制过来
        所以，修改这个引用变量的值，会导致其他对象的引用变量的值也被改变
        深拷贝需要对clone方法进行重写*/

        uClone.getAddr().setCity("天津");
        System.out.println("_____________________________");
        System.out.println(u);
        System.out.println(uClone);


    }

}
