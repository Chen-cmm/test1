package oop24;

/**
 * 顾客，面向菜单点菜
 */
public class Customer {
    public void order(FoodMenu menu){
        menu.yuXiang();
        menu.xiHongShi();
        menu.youPo();
    }
}
