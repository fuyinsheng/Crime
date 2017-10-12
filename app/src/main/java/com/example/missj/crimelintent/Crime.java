package com.example.missj.crimelintent;

import java.util.UUID;

/**
 * Created by miss.j on 2017/10/11.
 */

public class Crime {
     private UUID mId;
     private  String mTitle;
     public  Crime()
     {
         mId = UUID.randomUUID();
     }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
