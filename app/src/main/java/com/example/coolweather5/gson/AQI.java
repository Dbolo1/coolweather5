package com.example.coolweather5.gson;

/**
 * Created by 菠萝 on 2017/6/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
