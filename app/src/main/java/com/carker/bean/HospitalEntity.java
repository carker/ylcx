package com.carker.bean;

/**
 * Created by carker on 2015/10/1.
 */
public class HospitalEntity {
    private String hos_Ttitle;
    private String hos_content;

    public HospitalEntity( String hos_Ttitle,String hos_content) {
        this.hos_content = hos_content;
        this.hos_Ttitle = hos_Ttitle;
    }

    public HospitalEntity() {
    }

    public String getHos_content() {
        return hos_content;
    }

    public void setHos_content(String hos_content) {
        this.hos_content = hos_content;
    }

    public String getHos_Ttitle() {
        return hos_Ttitle;
    }

    public void setHos_Ttitle(String hos_Ttitle) {
        this.hos_Ttitle = hos_Ttitle;
    }
}
