package com.carker.bean;

/**
 * Created by carker on 2015/9/30.
 */
public class GridEntity {
    private int pictureUrl;
    private String content;

    public GridEntity(String content, int pictureUrl) {
        this.content = content;
        this.pictureUrl = pictureUrl;
    }

    public GridEntity() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(int pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
