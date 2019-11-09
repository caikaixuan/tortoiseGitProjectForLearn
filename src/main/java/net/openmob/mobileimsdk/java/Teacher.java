package net.openmob.mobileimsdk.java;

public class Teacher {

    private String name;

    private int age;

    private int sex;

    private Subject subject;

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void teach(Student student){
        System.out.println("I am teaching student whose name is " + student.getName());
    }

    public void punish(Student student){
        System.out.println("I am punishing student whose name is " + student.getName());
    }

    public void award(Student student){
        System.out.println("I am awarding student whose name is " + student.getName());
    }

    public void monitorExam(){
        System.out.println("I am monitoring " + this.subject.getNameEn() + "'s exam");
    }

    public void prepareForLesson(){
        System.out.println("I am prepare " + this.subject.getNameEn() + "'s lesson");
    }

    public void operateGame(){
        System.out.println("I am operating a game");
    }
}
