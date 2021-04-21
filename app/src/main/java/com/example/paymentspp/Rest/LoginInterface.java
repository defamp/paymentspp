package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Login.PostLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface LoginInterface {
    @POST("login")
    Call<PostLogin> postLogin(
            @Field("username") String username,
            @Field("password") String password
    );
}
