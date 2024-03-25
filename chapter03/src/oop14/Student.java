package oop14;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<String> selectCourse = new ArrayList<String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectCourse(String courseName){
        if (!selectCourse.contains(courseName)) {
            selectCourse.add(courseName);
        }
        else{
            System.out.println("该课程已经选择");
        }
    }

    public void deleteCourse(String courseName){
        if (selectCourse.contains(courseName)){
            System.out.println("课程不存在");
        }
        else {
            selectCourse.remove(selectCourse.indexOf(courseName));
        }
    }

    public void printInfo(){
        System.out.print(this.name+"所选的课程有：");
        for (int i=0;i<selectCourse.size();i++) {
            System.out.println(selectCourse);
        }
    }
}
