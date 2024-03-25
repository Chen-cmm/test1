package oop10;

import java.sql.SQLOutput;

public class Vip {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vip(){

    }
    public Vip(String name){
        this.name = name;
    }

    //实例方法调用必须使用对象来调用，所有静态方法不能调用实例方法
    public void shopping(){
        //this代表的是当前对象
        System.out.println(this.name+"正在购物");
        System.out.println("this的值是"+this);
        test();
    }

    public static void test(){
        System.out.println("........................");
    }
}
