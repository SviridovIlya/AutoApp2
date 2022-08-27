package com.example.dolbanyujas2.model;

public class Course {

    int id;
    String img, Title, Date, Level, color;

    public Course(int id, String img, String title, String date, String level, String color) {
        this.id = id;
        this.img = img;
        this.Title = title;
        this.Date = date;
        this.Level = level;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
