package com.example.coolweather5.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 菠萝 on 2017/6/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
