package net.openmob.mobileimsdk.java;

public class Teacher {

    private String name;

    private int age;

    private int sex;

    private Subject subject;

    private boolean isHead;

    public void prepareForLesson(){
        System.out.println("I am prepare " + this.subject.getNameEn() + "'s lesson");
    }

    public void teach(Student student){
        System.out.println("I am teaching student whose name is " + student.getName());
    }

    public void monitorExam(){
        System.out.println("I am monitoring " + this.subject.getNameEn() + "'s exam");
    }

    public void award(Student student){
        System.out.println("I am awarding student whose name is " + student.getName());
    }

    public void punish(Student student){
        System.out.println("I am punishing student whose name is " + student.getName());
    }

    public void operateGame(){
        System.out.println("I am operating a game");
    }

    public void takeSalary(){
        System.out.println("I hava get my salary of last month");
    }

    public void spyOn(){
        if(this.isHead){
            System.out.println("I am spyying on the class");
        }
    }

}
