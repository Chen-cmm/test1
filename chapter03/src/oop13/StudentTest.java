package oop13;
/*
单例模式
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        System.out.println(s1==s2);

        Teacher t1 = Teacher.getTeacher();
        Teacher t2 = Teacher.getTeacher();
        System.out.println(t1==t2);
    }
}
