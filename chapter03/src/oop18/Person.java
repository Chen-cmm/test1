package oop18;

public abstract class Person {
    String name;
    public Person(){

    }

    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    具体的问候方法应该交给子类去实现，因为每个不同国家的人问候的方式是不一样的
    所以可以定义为抽象方法，抽象的方法所在的类一定是抽象类
    抽象的方法一定要被子类实现
     */
    public abstract void greet();
}
