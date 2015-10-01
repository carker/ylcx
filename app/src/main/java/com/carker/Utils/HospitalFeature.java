package com.carker.Utils;

/**
 * Created by PC on 2015/9/29.
 */
public class HospitalFeature {

    /**
     * id : 34
     * message :
     * name : 外科
     * seq : 0
     */

    private int id;
    private String message;
    private String name;
    private String seq;

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getSeq() {
        return seq;
    }

    @Override
    public String toString() {
        return "HospitalFeature{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", seq='" + seq + '\'' +
                '}';
    }
}
