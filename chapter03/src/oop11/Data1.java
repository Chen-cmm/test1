package oop11;

public class Data1 {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /*
        无参构造默认创建的日期是1970-1-1
         */
    public Data1() {
        /*this.year = 1970;
        this.month = 1;
        this.day = 1;*/
        /*
        通过this()可以在构造方法中调用另一个构造方法，这样可以实现代码的复用
        this()必须写在构造函数体的第一行 this()与super()冲突
         */
        this(1970,1,1);
    }

    /*
    有参构造创建的日期是自己定义的
     */
    public Data1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void display() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}
