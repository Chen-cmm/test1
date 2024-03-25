package oop20;

public class CreditAccount extends Account{
    //子类特有的属性
    double credit;

    public CreditAccount() {
        //系统在这个第一行会默认写一条super()所以如果父类没有午餐构造时，这个构造函数就会报错
        //如果写了this()或super()那么系统就不会去添加这一条
    }

    public CreditAccount(String actno, double balance, double credit) {
        //通过子类的构造方法调用父类的构造方法
        //引入这个语法可以：1.代码复用 2.模拟现实世界的现有父亲再有儿子  3.给继承过来的父类特征初始化
        super(actno, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
