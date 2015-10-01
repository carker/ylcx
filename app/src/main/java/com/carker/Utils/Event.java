package com.carker.Utils;

import com.carker.bean.MyEntity;

import java.util.List;

/**
 * Created by carker on 2015/9/28.
 */
public class Event {
   public static class ItemEvent{
        private List<MyEntity> list;
        public ItemEvent(List<MyEntity> list){
            this.list=list;
        }

        public List<MyEntity> getDatas(){
            return  list;
        }

    }

}
