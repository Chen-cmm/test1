package oop19;

public class Teacher extends Person{
    int salary;
    String name;

    public Teacher() {
    }

    public Teacher(String name, int age, String email, int salary) {
        super(name, age, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println(this.getSalary());
        System.out.println(this.getAge());
        System.out.println(this.getEmail());
        System.out.println(this.getName());
        System.out.println(super.name);
        System.out.println(this.name);
    }

    /*
    要求在父类的方法上再添加一点代码，只需要用super.调用父类的doSome方法，自己再写一部分代码就行
     */
    @Override
    public void doSome() {
        super.doSome();
        System.out.println("教师也在做一些事");
    }
}
