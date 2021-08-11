package com.yusaoruc.retrofitjava.service;

import com.yusaoruc.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET , POST , UPDATE , DELETE
    //https://api.nomics.com/v1/prices?key=6a7188b68120a00fb1d23ba2cd799134f81ced6e
    @GET("prices?key=6a7188b68120a00fb1d23ba2cd799134f81ced6e")
    Call<List<CryptoModel>>getData();

}
