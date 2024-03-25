package oop24;

public class Cooker implements FoodMenu{
    String name;

    public Cooker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void xiHongShi() {
        System.out.println("炒了个西红柿炒蛋");
    }

    @Override
    public void yuXiang() {
        System.out.println("炒了个鱼香肉丝");
    }

    @Override
    public void youPo() {
        System.out.println("搞了个油泼面");
    }
}
