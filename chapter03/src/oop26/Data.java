package oop26;

public class Data {
    private int year;
    private int month;
    private int day;

    public Data() {
        this(1970,1,1);
    }

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

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

    @Override
    public String toString() {
        String s = this.year+"年"+this.month+"月"+this.day+"日";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }
        if (this==obj) {
            return true;
        }
        if (obj instanceof Data){
            //通过父类访问子类中的特有属性，则需要向下转型
            Data data = (Data) obj;
            if (data.year==this.year&&data.month==this.month&&data.day==this.day){
                return true;
            }
        }
        return false;

    }
}
