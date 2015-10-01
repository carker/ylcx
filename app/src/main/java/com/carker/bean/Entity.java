package com.carker.bean;

/**
 * Created by PC on 2015/9/29.
 */
public class Entity {

    /**
     * city :
     * id : 1
     * level : 0
     * province : 中国全国
     * region : 华北地区
     * sequence : 1
     * x : 104.94141
     * y : 34.452217
     */

    private String city;
    private int id;
    private int level;
    private String province;
    private String region;
    private int sequence;
    private double x;
    private double y;

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getProvince() {
        return province;
    }

    public String getRegion() {
        return region;
    }

    public int getSequence() {
        return sequence;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
