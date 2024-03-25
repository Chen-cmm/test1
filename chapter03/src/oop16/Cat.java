package oop16;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走");
    }

    //这个方法是子类特有的，而父类没有
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
