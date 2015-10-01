package com.carker.Utils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PC on 2015/9/29.
 */
public class City {


    /**
     * city :
     * citys : [{"city":"北京","id":2,"level":2,"province":"北京","sequence":1,"x":116.405,"y":39.905}]
     * id : 1
     * level : 1
     * province : 北京
     * region : 华北地区
     * sequence : 1
     * x : 116.405
     * y : 39.905
     */

    @SerializedName("city")
    private String city;
    @SerializedName("id")
    private int id;
    @SerializedName("level")
    private int level;
    @SerializedName("province")
    private String province;
    @SerializedName("region")
    private String region;
    @SerializedName("sequence")
    private int sequence;
    @SerializedName("x")
    private double x;
    @SerializedName("y")
    private double y;
    @SerializedName("citys")
    private List<CitysEntity> citys;

    public static com.carker.bean.City objectFromData(String str) {

        return new Gson().fromJson(str, com.carker.bean.City.class);
    }

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

    public void setCitys(List<CitysEntity> citys) {
        this.citys = citys;
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

    public List<CitysEntity> getCitys() {
        return citys;
    }

    public static class CitysEntity {
        /**
         * city : 北京
         * id : 2
         * level : 2
         * province : 北京
         * sequence : 1
         * x : 116.405
         * y : 39.905
         */

        @SerializedName("city")
        private String city;
        @SerializedName("id")
        private int id;
        @SerializedName("level")
        private int level;
        @SerializedName("province")
        private String province;
        @SerializedName("sequence")
        private int sequence;
        @SerializedName("x")
        private double x;
        @SerializedName("y")
        private double y;

        public static CitysEntity objectFromData(String str) {

            return new Gson().fromJson(str, CitysEntity.class);
        }

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
}
