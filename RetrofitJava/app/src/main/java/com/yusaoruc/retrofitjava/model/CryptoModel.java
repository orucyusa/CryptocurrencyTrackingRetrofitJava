package com.yusaoruc.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    @SerializedName("currency")
    public String currecny;

    @SerializedName("price")
    public String price;

}
