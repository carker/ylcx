package com.carker.Utils;

import java.util.List;

/**
 * Created by PC on 2015/9/29.
 */
public class HospitalLocation {

    /**
     * total : 489
     * tngou : [{"y":"","x":"","fax":"","zipcode":"","gobus":"","level":"","nature":"","mtype":"","count":1,"name":"\u2026\u2026","fcount":0,"id":503,"img":"\u2026\u2026","url":"\u2026\u2026","message":"\u2026\u2026","rcount":0,"tel":1435561395000,"address":"\u2026\u2026","area":0},{"y":"","x":"","fax":"","zipcode":"","gobus":"","level":"","nature":"","mtype":"","count":1,"name":"\u2026\u2026","fcount":0,"id":503,"img":"\u2026\u2026","url":"\u2026\u2026","message":"\u2026\u2026","rcount":0,"tel":1435561395000,"address":"\u2026\u2026","area":0}]
     */

    private int total;
    private List<TngouEntity> tngou;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTngou(List<TngouEntity> tngou) {
        this.tngou = tngou;
    }

    public int getTotal() {
        return total;
    }

    public List<TngouEntity> getTngou() {
        return tngou;
    }

    public static class TngouEntity {
        /**
         * y :
         * x :
         * fax :
         * zipcode :
         * gobus :
         * level :
         * nature :
         * mtype :
         * count : 1
         * name : ……
         * fcount : 0
         * id : 503
         * img : ……
         * url : ……
         * message : ……
         * rcount : 0
         * tel : 1435561395000
         * address : ……
         * area : 0
         */

        private String y;
        private String x;
        private String fax;
        private String zipcode;
        private String gobus;
        private String level;
        private String nature;
        private String mtype;
        private int count;
        private String name;
        private int fcount;
        private int id;
        private String img;
        private String url;
        private String message;
        private int rcount;
        private String tel;
        private String address;
        private int area;

        public void setY(String y) {
            this.y = y;
        }

        public void setX(String x) {
            this.x = x;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public void setGobus(String gobus) {
            this.gobus = gobus;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setNature(String nature) {
            this.nature = nature;
        }

        public void setMtype(String mtype) {
            this.mtype = mtype;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void setName(String name) {
            this.name = name;
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

        public void setUrl(String url) {
            this.url = url;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setArea(int area) {
            this.area = area;
        }

        public String getY() {
            return y;
        }

        public String getX() {
            return x;
        }

        public String getFax() {
            return fax;
        }

        public String getZipcode() {
            return zipcode;
        }

        public String getGobus() {
            return gobus;
        }

        public String getLevel() {
            return level;
        }

        public String getNature() {
            return nature;
        }

        public String getMtype() {
            return mtype;
        }

        public int getCount() {
            return count;
        }

        public String getName() {
            return name;
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

        public String getUrl() {
            return url;
        }

        public String getMessage() {
            return message;
        }

        public int getRcount() {
            return rcount;
        }

        public String getTel() {
            return tel;
        }

        public String getAddress() {
            return address;
        }

        public int getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "TngouEntity{" +
                    "y='" + y + '\'' +
                    ", x='" + x + '\'' +
                    ", fax='" + fax + '\'' +
                    ", zipcode='" + zipcode + '\'' +
                    ", gobus='" + gobus + '\'' +
                    ", level='" + level + '\'' +
                    ", nature='" + nature + '\'' +
                    ", mtype='" + mtype + '\'' +
                    ", count=" + count +
                    ", name='" + name + '\'' +
                    ", fcount=" + fcount +
                    ", id=" + id +
                    ", img='" + img + '\'' +
                    ", url='" + url + '\'' +
                    ", message='" + message + '\'' +
                    ", rcount=" + rcount +
                    ", tel=" + tel +
                    ", address='" + address + '\'' +
                    ", area=" + area +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HospitalLocation{" +
                "total=" + total +
                ", tngou=" + tngou +
                '}';
    }
}
