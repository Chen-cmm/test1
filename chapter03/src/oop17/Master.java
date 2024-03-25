package oop17;

import oop16.Dog;

public class Master {
    /*
    下面这两种就不符合OCP原则
    OCP(开闭原则)：一个软件实体应该对扩展开放，对修改关闭，即在不修改原有代码的基础上
    通过添加新的代码来扩展功能
     */
    /*public void feed(Cat c){
        c.eat();
    }*/

    /*public void feed(Dog d){
        d.eat();
    }*/

    /*
    下面这种就符合OCP原则，传入参数的时候不论是传入Cat类型还是Dog类型都行
    比如又养了一个新的宠物，则只需要再新加一个新的宠物类就行了
     */
    public void feed(Pet p){
        p.eat();
    }

}
