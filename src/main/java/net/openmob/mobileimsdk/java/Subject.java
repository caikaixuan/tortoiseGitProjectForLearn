package net.openmob.mobileimsdk.java;

public class Subject implements Comparable<Subject>{
    private String nameEn;
    private String nameZh;
    private int fullScore;
    private int priority;

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public int getFullScore() {
        return fullScore;
    }

    public void setFullScore(int fullScore) {
        this.fullScore = fullScore;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int compareTo(Subject o) {
        if(o.getPriority() == this.getPriority()){
            return 0;
        }else{
            return o.getPriority() > this.getPriority()?-1:1;
        }
    }
}
