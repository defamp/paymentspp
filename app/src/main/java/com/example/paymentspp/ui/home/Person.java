package com.example.paymentspp.ui.home;

public class Person {
    private int photoId;
    private String name;
    private String pay;

    public Person(int photoId, String name, String pay) {
        this.photoId = photoId;
        this.name = name;
        this.pay = pay;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

}
