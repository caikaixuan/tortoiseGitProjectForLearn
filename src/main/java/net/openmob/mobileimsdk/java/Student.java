package net.openmob.mobileimsdk.java;

public class Student {
    private static String schoolName = "HUBEI_XIANTAOSHI_MIDDLE_SCHOOL";

    private String name;

    private int age;

    private int sex;

    private int grade;

    private int classNumber;

    private int classOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassOrder() {
        return classOrder;
    }

    public void setClassOrder(int classOrder) {
        this.classOrder = classOrder;
    }

    public void study(Subject subject){
        System.out.println("I am studying " + subject.getNameZh());
    }
}
