package com.carker.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carker on 2015/9/28.
 */
public class MyEntity {
    private String title;
    private String index;
    public static List<com.carker.bean.MyEntity> list=new ArrayList<>();
    public MyEntity(String index, String title) {
        this.index = index;
        this.title = title;
    }
    public MyEntity() {

    }
    static{
        for(int i=0;i<10;i++){
            com.carker.bean.MyEntity entity=new com.carker.bean.MyEntity("hello"+i,""+i);
            list.add(entity);
        }
    }
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
