package com.example.musafirapp.api;

import com.example.musafirapp.models.BaseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RestApiInterface {

    @POST("auth/login")
    @FormUrlEncoded
    Call<BaseModel> postLogin(@Field("email") String email,
                              @Field("password") String password);

    @GET("profile/{id}")
    Call<BaseModel> getProfileDetail(@Path("id") String id);
}
