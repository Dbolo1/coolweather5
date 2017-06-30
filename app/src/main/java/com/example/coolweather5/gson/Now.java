package com.example.coolweather5.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 菠萝 on 2017/6/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
