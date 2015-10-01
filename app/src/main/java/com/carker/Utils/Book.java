package com.carker.Utils;


/**
 * Created by PC on 2015/9/29.
 */
public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookclass=" + bookclass +
                ", count='" + count + '\'' +
                ", fcount=" + fcount +
                ", id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", rcount=" + rcount +
                ", summary='" + summary + '\'' +
                ", time=" + time +
                '}';
    }

    /**
     * author : 麦玲玲
     * bookclass : 10
     * count : 0
     * fcount : 0
     * id : 2874
     * img : /book/150802/b09680bea4e81d7e068c0c9d001f0809.jpg
     * name : 麦玲玲2010
     * rcount : 0
     * summary : 　
     * time : 1438490059000
     */

    private String author;
    private int bookclass;
    private String count;
    private int fcount;
    private int id;
    private String img;
    private String name;
    private int rcount;
    private String summary;
    private long time;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookclass(int bookclass) {
        this.bookclass = bookclass;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookclass() {
        return bookclass;
    }

    public String getCount() {
        return count;
    }

    public int getFcount() {
        return fcount;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getRcount() {
        return rcount;
    }

    public String getSummary() {
        return summary;
    }

    public long getTime() {
        return time;
    }
}
