package oop14;

public class test {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setName("矩阵分析");
        c1.setCourseId("1111");
        c1.setTeacher("aaaa");
        c1.setXueFen("3");
        c1.setXueYuan("理学院");

        Course c2 = new Course();
        c2.setName("Java");
        c2.setCourseId("2222");
        c2.setTeacher("bbbb");
        c2.setXueFen("3");
        c2.setXueYuan("计算机学院");

        Course c3 = new Course();
        c3.setName("通信网");
        c3.setCourseId("3333");
        c3.setTeacher("cccc");
        c3.setXueFen("3");
        c3.setXueYuan("通信学院");

        Student s1 = new Student();
        s1.setName("张三");
        s1.setId("11111");
        s1.selectCourse("矩阵分析");
        s1.selectCourse("通信网");
        s1.selectCourse("通信网");
        s1.printInfo();
        s1.deleteCourse("通信网");
        s1.printInfo();
        s1.deleteCourse("通信网");

        Student s2 = new Student();
        s2.setName("李四");
        s2.setId("2222");
    }
}
