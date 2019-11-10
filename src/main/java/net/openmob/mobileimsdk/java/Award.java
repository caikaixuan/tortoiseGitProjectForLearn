package net.openmob.mobileimsdk.java;

import java.util.Date;

public class Award {
    private String nameEn;
    private String nameZh;
    private int price;
    private java.util.Date butTime;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getButTime() {
        return butTime;
    }

    public void setButTime(Date butTime) {
        this.butTime = butTime;
    }
}
