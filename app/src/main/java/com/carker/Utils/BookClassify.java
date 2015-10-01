package com.carker.Utils;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PC on 2015/9/29.
 */
public class BookClassify {


    /**
     * description :
     * id : 1
     * keywords :
     * name : 孕妇育儿
     * seq : 1
     * title :
     */

    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private int id;
    @SerializedName("keywords")
    private String keywords;
    @SerializedName("name")
    private String name;
    @SerializedName("seq")
    private int seq;
    @SerializedName("title")
    private String title;

    public static com.carker.bean.BookClassify objectFromData(String str) {

        return new Gson().fromJson(str, com.carker.bean.BookClassify.class);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getName() {
        return name;
    }

    public int getSeq() {
        return seq;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BookClassify{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", keywords='" + keywords + '\'' +
                ", name='" + name + '\'' +
                ", seq=" + seq +
                ", title='" + title + '\'' +
                '}';
    }
}
